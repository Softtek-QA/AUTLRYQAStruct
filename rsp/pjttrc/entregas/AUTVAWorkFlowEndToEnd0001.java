/**
 * 
 */
package br.lry.qa.rsp.pjttrc.entregas;

import java.io.File;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

import com.borland.silktest.jtf.SilkTestSuite;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.pdv.AUTPDVBaseServices;
import br.lry.components.safe.AUTSafeBaseComponent.AUT_SAFE_TIPO_CONVENIO;
import br.lry.components.safe.AUTSafeBaseComponent.AUT_SAFE_TYPE_PERSONS;
import br.lry.components.safe.AUTSafeBaseServices;
import br.lry.components.safe.AUTSafeConsultaValeTroca;
import br.lry.components.sap.AUTSAPBaseServices;
import br.lry.components.va.AUTVA03ConsultaStatusPedido;
import br.lry.components.va.AUTVABaseServices;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.components.va.AUTVACadastros.AUT_VA_PROPRIEDADE_RESIDENCIA;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_CLIENTE_INVALIDO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_CONTATO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_ENDERECO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_RESIDENCIA;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_FLUXO_SAIDA;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_MEIOS_PAGAMENTO;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_PLANO_PAGAMENTO;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;
import br.lry.process.AUTPDVConsultaPrecoItem;
import br.lry.process.AUTPDVDevolucaoItem;
import br.lry.process.AUTPDVPagamentoPedido;
import br.lry.process.AUTSAPConsultaEstoque;
import br.stk.framework.tests.AUTFWKTestObjectBase;
import junit.framework.JUnit4TestAdapter;


/**
 * 
 ** REGRESSIVO PARA TESTES INTEGRADOS:
 *
 *-  SISTEMAS:
 *		
 * 		-HMC 				- Cadastro de usuários loja
 * 		-VA 				- Cadastro de clientes loja, geração e consulta de pedidos
 * 		-BOITATA
 * 		-PDV 				- Pagamentos e devoluções de pedidos
 *      -SAFE				- Geração de Vale troca em função de pedidos devolvidos e voucher para variações nos fluxos de pagamento
 *      -SAP				- Faturamento de Pedidos e consultas de estoque
 * 
 * 
 * 
 * FLUXOS DE EXECUÇÃO:
 * 
 *  1º   - HMC    - CADASTRO DE USUÁRIO DE LOJA
 *  2º   - VA     - CADASTRA CLIENTE PF - PESSOA FÍSICA
 *  3º   - VA     - CADASTRA CLIENTE EST - ESTRANGEIRO
 *  4º   - VA     - CADASTRA CLIENTE PJ - PESSOA JURÍDICA
 *  5º   - PDV    - LOGIN 
 *  6º   - PDV    - CONSULTA PREÇO DO MATERIAL UTILIZADO NOS PEDIDOS
 *  7º   - SAP    - CONSULTA ESTOQUE DO MATERIAL 		- CAR 
 *  8º	 - SAFE	  - GERA VOUCHER - PF 					- PESSOA FÍSICA
 *  9º	 - SAFE	  - GERA VOUCHER - EST 					- ESTRANGEIRO
 *  10º	 - SAFE	  - GERA VOUCHER - PJ 					- PESSOA JURÍDICA
 *  
 *  
 *  
 *  
 *  
 *  ******* FLUXO DE SAÍDA : RETIRADA EXTERNA IMEDIATA
 *  
 *  
 *  13º  - VA-BOITATA - PF: GERA PEDIDO - FLUXO DE SAÍDA - RETIRA EXTERNA IMEDIATA - PAG - DINHEIRO
 *  14º  - VA     - PF:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  15º  - PDV    - PF:PAGA PEDIDO
 *  16º  - VA     - PF:VALIDA STATUS DO PEDIDO PAGO
 *  17º	 - SAP	  - GERA REMESSA, ORDEM DE TRANSPORTE, CONFIRMA OT, REGISTRA SM E GERA FATURA DO PEDIDO - SEM CONFERÊNCIA DO MATERIAL
 *  18º  - VA     - PF:VALIDA STATUS DO PEDIDO FATURADO : MOSTRA DOCUMENTOS SAP VINCULADOS
 *  19º  - PDV 	  - PF:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  20º  - VA     - PF:VALIDA STATUS DE DEVOLUÇÃO
 *  21º  - SAFE   - PF:VALIDA CRIAÇÃO DE VALE TROCA
 *
 *  22º  - VA-BOITATA - EST: GERA PEDIDO - FLUXO DE SAÍDA - RETIRA EXTERNA IMEDIATA - PAG - DINHEIRO
 *  23º  - VA     - EST:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  24º  - PDV    - EST:PAGA PEDIDO
 *  25º  - VA     - EST:VALIDA STATUS DO PEDIDO PAGO
 *  26º	 - SAP	  - GERA REMESSA, ORDEM DE TRANSPORTE, CONFIRMA OT, REGISTRA SM E GERA FATURA DO PEDIDO - SEM CONFERÊNCIA DO MATERIAL
 *  27º  - VA     - EST:VALIDA STATUS DO PEDIDO FATURADO : MOSTRA DOCUMENTOS SAP VINCULADOS
 *  28º  - PDV 	  - EST:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  29º  - VA     - EST:VALIDA STATUS DE DEVOLUÇÃO
 *  30º  - SAFE   - EST:VALIDA CRIAÇÃO DE VALE TROCA
 * 
 *  31º  - VA-BOITATA - PJ: GERA PEDIDO - FLUXO DE SAÍDA - RETIRA EXTERNA IMEDIATA - PAG - DINHEIRO
 *  32º  - VA     - PJ:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  33º  - PDV    - PJ:PAGA PEDIDO
 *  34º  - VA     - PJ:VALIDA STATUS DO PEDIDO PAGO
 *  35º	 - SAP	  - GERA REMESSA, ORDEM DE TRANSPORTE, CONFIRMA OT, REGISTRA SM E GERA FATURA DO PEDIDO - SEM CONFERÊNCIA DO MATERIAL
 *  36º  - VA     - PJ:VALIDA STATUS DO PEDIDO FATURADO : MOSTRA DOCUMENTOS SAP VINCULADOS
 *  37º  - PDV 	  - PJ:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  38º  - VA     - PJ:VALIDA STATUS DE DEVOLUÇÃO
 *  39º  - SAFE   - PJ:VALIDA CRIAÇÃO DE VALE TROCA
 *
 *  
 *  
 *  ******* FLUXO DE SAÍDA : RETIRADA INTERNA IMEDIATA
 *  
 *  
 *  40º  - VA-BOITATA - PF: GERA PEDIDO - FLUXO DE SAÍDA - RETIRA INTERNA IMEDIATA - PAG - DINHEIRO
 *  41º  - VA     - PF:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  42º  - PDV    - PF:PAGA PEDIDO
 *  43º  - VA     - PF:VALIDA STATUS DO PEDIDO PAGO
 *  44º  - PDV 	  - PF:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  45º  - VA     - PF:VALIDA STATUS DE DEVOLUÇÃO
 *  46º  - SAFE   - PF:VALIDA CRIAÇÃO DE VALE TROCA
 *
 *  47º  - VA-BOITATA - EST: GERA PEDIDO - FLUXO DE SAÍDA - RETIRA INTERNA IMEDIATA - PAG - DINHEIRO
 *  48º  - VA     - EST:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  49º  - PDV    - EST:PAGA PEDIDO
 *  50º  - VA     - EST:VALIDA STATUS DO PEDIDO PAGO
 *  51º  - PDV 	  - EST:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  52º  - VA     - EST:VALIDA STATUS DE DEVOLUÇÃO
 *  53º  - SAFE   - EST:VALIDA CRIAÇÃO DE VALE TROCA
 * 
 *  54º  - VA-BOITATA - PJ: GERA PEDIDO - FLUXO DE SAÍDA - RETIRA INTERNA IMEDIATA - PAG - DINHEIRO
 *  55º  - VA     - PJ:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  56º  - PDV    - PJ:PAGA PEDIDO
 *  57º  - VA     - PJ:VALIDA STATUS DO PEDIDO PAGO
 *  58º  - PDV 	  - PJ:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  59º  - VA     - PJ:VALIDA STATUS DE DEVOLUÇÃO
 *  60º  - SAFE   - PJ:VALIDA CRIAÇÃO DE VALE TROCA
 *  
 *  
 *  
 *  
 *  
 *  ******* FLUXO DE SAÍDA : CAIXA
 *  
 *  
 *  61º  - VA-BOITATA - PF: GERA PEDIDO - FLUXO DE SAÍDA - CAIXA - PAG - DINHEIRO
 *  62º  - VA     - PF:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  63º  - PDV    - PF:PAGA PEDIDO
 *  64º  - VA     - PF:VALIDA STATUS DO PEDIDO PAGO
 *  65º  - PDV 	  - PF:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  66º  - VA     - PF:VALIDA STATUS DE DEVOLUÇÃO
 *  67º  - SAFE   - PF:VALIDA CRIAÇÃO DE VALE TROCA
 *
 *  68º  - VA-BOITATA - EST: GERA PEDIDO - FLUXO DE SAÍDA - CAIXA - PAG - DINHEIRO
 *  69º  - VA     - EST:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  70º  - PDV    - EST:PAGA PEDIDO
 *  71º  - VA     - EST:VALIDA STATUS DO PEDIDO PAGO
 *  72º  - PDV 	  - EST:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  73º  - VA     - EST:VALIDA STATUS DE DEVOLUÇÃO
 *  74º  - SAFE   - EST:VALIDA CRIAÇÃO DE VALE TROCA
 * 
 *  75º  - VA-BOITATA - PJ: GERA PEDIDO - FLUXO DE SAÍDA - CAIXA - PAG - DINHEIRO
 *  76º  - VA     - PJ:VALIDA STATUS DO PEDIDO CRIADO - STATUS INICIAL
 *  77º  - PDV    - PJ:PAGA PEDIDO
 *  78º  - VA     - PJ:VALIDA STATUS DO PEDIDO PAGO
 *  79º  - PDV 	  - PJ:DEVOLVE PEDIDO - MOSTRA CONFIRMAÇÃO DO PDV PARA GERAÇÃO DE VALE TROCA
 *  80º  - VA     - PJ:VALIDA STATUS DE DEVOLUÇÃO
 *  81º  - SAFE   - PJ:VALIDA CRIAÇÃO DE VALE TROCA
 *  
 *  
 *  
 * @author SOFTTEK-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTVAWorkFlowEndToEnd0001{	
	//***********************************************************************************************************************	
	//***********************************************************************************************************************	
	//*********       LEROY MERLIN: ENTREGA 1 --> TESTES INTEGRADOS - WORKFLOW END-TO-END       *****************************
	//*********																					*****************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************	
	
	
	public static br.lry.qa.rsp.pjttrc.entregas.AUTEntregasBase entregas = new AUTEntregasBase();	

	@Test
	public void AUT_CFG_INIT() {
		entregas.autSetCurrentSuite(AUTVAWorkFlowEndToEnd0001.class);
		entregas.autLoaderCurrentSuite();
		entregas.autEntrega001().AUT_INIT();
		entregas.autEntrega002().AUT_INIT();
	}
	
	/**
	 * 
	 * HMC - Executa os procedimentos de cadastro
	 * 
	 */
	@Test
	public void AUT_IT00000_STHMC_ID00001_FRT001_CN00001_CADASTRO_USUARIO_LOJA0035() {
		try {					
			entregas.autEntrega001().AUT_IT00001_STHMC_ID00001_FRT001_CN00001_CADASTRO_USUARIO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}


	/**
	 * 
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Física
	 * 
	 */
	@Test
	public void AUT_IT00002_STVA_ID00001_FRT001_CN00002_CADASTRO_CLIENTE_PF_LOJA0035() {		
		try {
			entregas.autEntrega001().AUT_IT00002_STCFG_ID00001_FRT001_CN00000_VA_CONFIG_CADASTRO_CLIENTES();
			entregas.autEntrega001().AUT_IT00003_STVA_ID00001_FRT001_CN00002_CADASTRO_CLIENTE_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}

	
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_IT00003_STVA_ID00001_FRT001_CN00003_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00004_STVA_ID00001_FRT001_CN00003_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);	
		}
	}
	
	
	
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_IT00005_STVA_ID00001_FRT001_CN00004_CADASTRO_CLIENTE_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00005_STVA_ID00001_FRT001_CN00004_CADASTRO_CLIENTE_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);	
		}
	}


	/**
	 * 8
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	@Test
	public void AUT_IT00006_STPDV_ID00001_FRT001_CN00005_LOGIN_LOJA0035() {				
		try {
			entregas.autEntrega001().AUT_IT00006_STPDV_ID00001_FRT001_CN00005_LOGIN_LOJA0035();
		}
		catch(java.lang.Exception e) {	
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);			
		}
	}

	
	@Test
	/**
	 * 3
	 * Executa procedimentos para consulta de material de preço do material PDV
	 * 
	 */
	public void AUT_IT00007_STPDV_ID00001_FRT001_CN00006_VALIDA_PRECO_MATERIAL_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00007_STPDV_ID00001_FRT001_CN00006_VALIDA_PRECO_MATERIAL_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);	
		}
	}	

	@Test
	/**
	 * 
	 * Consulta de estoque de material no SAP
	 * 
	 */
	public void AUT_IT00008_STSAP_ID00001_FRT001_CN00007_VALIDA_ESTOQUE_MATERIAL_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00008_STSAP_ID00001_FRT001_CN00007_VALIDA_ESTOQUE_MATERIAL_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);	
		}
	}	

	
	@Test
	/**
	 * 
	 * Gera voucher para cliente PF
	 * 
	 */
	public void AUT_IT00009_STSAFE_ID00001_FRT001_CN00008_GERAR_VOUCHER_PF() {
		try {
			entregas.autEntrega001().AUT_IT00009_STSAFE_ID00001_FRT001_CN00008_GERAR_VOUCHER_PF();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);				
		}
	}	
	
	@Test
	/**
	 * 
	 * Gera voucher para cliente estrangeiro
	 * 
	 */
	public void AUT_IT00010_STSAFE_ID00001_FRT001_CN00009_GERAR_VOUCHER_EST() {
		try {
			entregas.autEntrega001().AUT_IT00010_STSAFE_ID00001_FRT001_CN00009_GERAR_VOUCHER_EST();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}

	
	@Test
	/**
	 * 
	 * Gera voucher para cliente PJ
	 * 
	 */
	public void AUT_IT00011_STSAFE_ID00001_FRT001_CN00010_GERAR_VOUCHER_PJ() {
		try {
			entregas.autEntrega001().AUT_IT00011_STSAFE_ID00001_FRT001_CN00010_GERAR_VOUCHER_PJ();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
		
	
	
	//***********************************************************************************************************************	
	//********************************** FLUXO DE SAÍDA: RETIRADA EXTERNA IMEDIATA ******************************************
	//***********************************************************************************************************************
	
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00012_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00012_STCFG_ID00001_FRT001_CN00000_CONFIG_GERADOR_PEDIDOS_LOJA0035();
			entregas.autEntrega001().AUT_IT00013_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00013_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00014_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00014_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00015_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}

	
	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00015_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00016_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);			
		}
	}
	
	
	@Test
	public void AUT_IT00016_STSAP_ID00001_FRT001_CN00017_FATURA_PEDIDO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00017_STSAP_ID00001_FRT001_CN00017_FATURA_PEDIDO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
		
	
	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00017_STVA_ID00001_FRT001_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00018_STVA_ID00001_FRT001_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00018_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00019_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}

	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00019_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00020_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00020_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00021_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	


	
	
	
	
	
	//***************************************************** PESSOA ESTRANGEIRA *******************
	
	
	
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00021_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00022_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00022_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00023_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00023_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00024_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);	
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00024_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00024_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	
	@Test
	public void AUT_IT00025_STSAP_ID00001_FRT001_CN00017_FATURA_PEDIDO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00025_STSAP_ID00001_FRT001_CN00017_FATURA_PEDIDO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);	
		}
	}
		
	
	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00026_STVA_ID00001_FRT001_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00026_STVA_ID00001_FRT001_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00027_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00027_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00028_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00028_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00029_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00029_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//****************************************** PESSOA JURÍDICA **************************
	
	
		
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00030_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00030_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00031_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00031_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00032_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00032_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00033_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00033_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	
	@Test
	public void AUT_IT00034_STSAP_ID00001_FRT001_CN00017_FATURA_PEDIDO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00034_STSAP_ID00001_FRT001_CN00017_FATURA_PEDIDO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
		
	
	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00035_STVA_ID00001_FRT001_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00035_STVA_ID00001_FRT001_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00036_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00036_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00037_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00037_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00038_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00038_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	//***********************************************************************************************************************	
	//********************************** FLUXO DE SAÍDA: RETIRADA INTERNA IMEDIATA ******************************************
	//***********************************************************************************************************************

	

	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00039_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00039_STVA_ID00001_FRT001_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00040_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00040_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00041_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00041_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}		
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00042_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00042_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00043_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00043_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00044_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00044_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}		
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00045_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00045_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	

	
	//***************************************************** PESSOA ESTRANGEIRA *******************
	
	
	
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00046_STVA_ID00001_FRT001_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00046_STVA_ID00001_FRT001_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00047_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00047_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00048_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00048_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00049_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00049_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00050_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00050_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00051_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00051_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00052_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00052_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	

	//****************************************** PESSOA JURÍDICA **************************
	
	
	
	
	
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00053_STVA_ID00001_FRT001_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00053_STVA_ID00001_FRT001_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00054_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00054_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00055_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00055_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00056_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00056_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
		
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00057_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00057_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00058_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00058_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00059_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00059_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	
	
	
	
	
	
	

	
	
	
	
	//***********************************************************************************************************************	
	//********************************** FLUXO DE SAÍDA: CAIXA ******************************************
	//***********************************************************************************************************************

	

	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_IT00060_STVA_ID00001_FRT001_CN00013_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00060_STVA_ID00001_FRT001_CN00013_CAIXA_PAG_DINHEIRO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00061_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00061_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00062_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00062_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00063_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00063_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00064_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00064_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00065_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00065_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00066_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00066_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	

	
	//***************************************************** PESSOA ESTRANGEIRA *******************
	
	
	
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00068_STVA_ID00001_FRT001_CN00013_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00067_STVA_ID00001_FRT001_CN00013_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00069_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00068_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00070_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00069_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00071_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00070_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
		
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00072_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00071_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00073_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00072_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00074_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00073_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	

	//****************************************** PESSOA JURÍDICA **************************
	
	
	
	
	
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00076_STVA_ID00001_FRT001_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00074_STVA_ID00001_FRT001_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00077_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00075_STVA_ID00001_FRT001_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00078_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00076_STPDV_ID00001_FRT001_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00079_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00077_STVA_ID00001_FRT001_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00080_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00078_STPDV_ID00001_FRT001_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00081_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00079_STVA_ID00001_FRT001_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00082_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035() {
		try {
			entregas.autEntrega001().AUT_IT00080_STSAFE_ID00001_FRT001_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}

	@Test
	/**
	 * 
	 * 38
	 * Executa procedimentos para pagamento de pedido no PDV
	 * 
	 */
	public void AUT_IT00083_STPDV_ID00001_FRT001_CN00038_LOGOUT_LOJA0035() {				
		try {
			entregas.autEntrega001().AUT_IT00081_STPDV_ID00001_FRT001_CN00038_LOGOUT_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);		
		}
	}
	
	
	//***********************************************************************************************************************	
	//***********************************************************************************************************************	
	//*********       LEROY MERLIN: ENTREGA 2 --> MÓDULO : CADASTROS - WORKFLOW END-TO-END       *****************************
	//*********																					 ****************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************
	//***********************************************************************************************************************

			
	@Test
	/**
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 */
	public void AUT_IT00084_STVA_ID00003_FRT003_CN00003_CADASTRO_CLIENTE_PJ_LOJA0035() {
		try{			
			entregas.autEntrega002().AUT_IT00003_STVA_ID00003_FRT003_CN00003_CADASTRO_CLIENTE_PJ_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}
	}
	
	
	@Test
	/**
	 * CN00002 - Realizar um cadastro de um cliente Pessoa Fisica
	 */
	public void AUT_IT00085_STVA_ID00003_FRT003_CN00004_CADASTRO_CLIENTE_PF_LOJA0035() {
		try{			
			entregas.autEntrega002().AUT_IT00004_STVA_ID00003_FRT003_CN00004_CADASTRO_CLIENTE_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	
	
	@Test
	/**
	 * CN00003 - Realizar um cadastro de um cliente Estrangeiro
	 */
	public void AUT_IT00086_STVA_ID00003_FRT003_CN00005_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		try{			
			entregas.autEntrega002().AUT_IT00004_STVA_ID00003_FRT003_CN00004_CADASTRO_CLIENTE_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}

	
	@Test
	/**
	 * CN00004 -Realizar um cadastro de um cliente adicionando mais de um telefone
	 */
	public void AUT_IT00087_STVA_ID00003_FRT003_CN00006_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035() {
		try{			
			entregas.autEntrega002().AUT_IT00004_STVA_ID00003_FRT003_CN00004_CADASTRO_CLIENTE_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		

	}
	
	
	@Test
	/**
	 * CN00005 - Realizar um cadastro de um cliente com um CPF que já cadastrado
	 */
	public void AUT_IT00088_STVA_ID00003_FRT003_CN00007_REQUISITO_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO() {
		try
		{			
			entregas.autEntrega002().AUT_IT00004_STVA_ID00003_FRT003_CN00004_CADASTRO_CLIENTE_PF_LOJA0035();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}

		
	@Test
	/**
	 * 
	 * CN00006 - Realizar um cadastro de um cliente com um CNPJ que já cadastrado
	 * 
	 */
	public void AUT_IT00089_STVA_ID00003_FRT003_CN00008_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO() {
		try{			
			entregas.autEntrega002().AUT_IT00008_STVA_ID00003_FRT003_CN00008_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}	
	
	
	@Test
	/**
	 * CN00007 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 */
	public void AUT_IT00090_STVA_ID00003_FRT003_CN00009_CADASTRO_CLIENTE_NAO_SEI_CEP() {
		try{			
			entregas.autEntrega002().AUT_IT00009_STVA_ID00003_FRT003_CN00009_CADASTRO_CLIENTE_NAO_SEI_CEP();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	
	
	@Test
	/**
	 * CN00008 - Realizar cadastro de cliente por um cpf invalido
	 */
	public void AUT_IT00091_STVA_ID00003_FRT003_CN00010_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO() {
		try{			
			entregas.autEntrega002().AUT_IT00010_STVA_ID00003_FRT003_CN00010_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	
	
	@Test
	/**
	 * CN00009 - Realizar cadastro de cliente por cep invalido
	 */
	public void AUT_IT00092_STVA_ID00003_FRT003_CN00011_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO() {
		try{			
			entregas.autEntrega002().AUT_IT00011_STVA_ID00003_FRT003_CN00011_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	

	@Test
	/**
	 * CN00010 - Realizar cadastro com mais de um endereço
	 */
	public void AUT_IT00093_STVA_ID00003_FRT003_CN00012_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS() {
		try{			
			entregas.autEntrega002().AUT_IT00012_STVA_ID00003_FRT003_CN00012_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	

	
	@Test
	public void AUT_IT00094_STVA_ID00003_FRT003_CN00013_REQUISITO_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO(){
		try{			
			entregas.autEntrega002().AUT_IT00013_STVA_ID00003_FRT003_CN00013_REQUISITO_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}				
	}	
	
	@Test
	/**
	 * CN00011 - Cadastrar um cliente PJ e classificá-lo como Exceção
	 */
	public void AUT_IT00095_STVA_ID00003_FRT003_CN00014_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO() {
		try{			
			entregas.autEntrega002().AUT_IT00014_STVA_ID00003_FRT003_CN00014_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	
	
	@Test
	/**
	 * CN00012 - Classificar um cliente PJ já cadastrado como Exceção
	 */
	public void AUT_IT00096_STVA_ID00003_FRT003_CN00015_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO() {
		try{			
			entregas.autEntrega002().AUT_IT00015_STVA_ID00003_FRT003_CN00015_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	
		
	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00097_STVA_ID00003_FRT003_CN00016A_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try{			
			entregas.autEntrega002().AUT_IT00016_STVA_ID00003_FRT003_CN00016A_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}
	
	
	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00098_STVA_ID00003_FRT003_CN00016B_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try{			
			entregas.autEntrega002().AUT_IT00017_STVA_ID00003_FRT003_CN00016B_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}

	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00099_STVA_ID00003_FRT003_CN00017_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try{			
			entregas.autEntrega002().AUT_IT00018_STVA_ID00003_FRT003_CN00017_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO();
		}
		catch(java.lang.Exception e) {
			entregas.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.ERROR);
		}		
	}	
	
}

