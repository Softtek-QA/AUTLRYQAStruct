/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

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
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_FLUXO_SAIDA;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_MEIOS_PAGAMENTO;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_PLANO_PAGAMENTO;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.process.AUTPDVConsultaPrecoItem;
import br.lry.process.AUTPDVDevolucaoItem;
import br.lry.process.AUTPDVPagamentoPedido;
import br.lry.process.AUTSAPConsultaEstoque;
import br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001.AUTVA03ConsultaStatusPedido;
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
	public static AUTFWKTestObjectBase gerTests;
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVACadastros cadastrosVA;
	public static AUTVAGeradorPedido geradorPedidos;
	public static AUTVA03ConsultaStatusPedido consultaStatusPedido;
	public static br.lry.components.pdv.AUTPDVBaseServices pdv;
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	public static br.lry.components.sap.AUTSAPBaseServices sap;
	public static br.lry.components.safe.AUTSafeBaseServices safe;
	String hostExec = "192.168.0.116";
	
	@Test
	public void AUT_00009_FRT009() {
		
	}
	
	
	/**
	 * 
	 * Configura os parametros de inicialização para realização de cadastros no HMC
	 * 
	 */
	@Test
	public void AUT_AUT_IT00000_STCFG_ID00009_FRT009_CN00000() {	
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
		geradorPedidos = new AUTVAGeradorPedido();	
		consultaStatusPedido = new AUTVA03ConsultaStatusPedido();
		gerTests = new AUTFWKTestObjectBase();
		pdv = new AUTPDVBaseServices();	
		safe = new AUTSafeBaseServices();
		AUT_LOJA_CADASTRO = "0035";
		gerTests.autInitConfigurationProjectExecution(AUTVAWorkFlowEndToEnd0001.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
		gerTests.autSetDesktopAgent(cadastrosHMC.AUT_AGENT_SILK4J);
	}

	
	/**
	 * 
	 * Executa os procedimentos de cadastro
	 * 
	 */
	@Test
	public void AUT_IT00001_STHMC_ID00009_FRT009_CN00001_CADASTRO_USUARIO_LOJA0035() {
		try {	
			cadastrosHMC.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);								
			cadastrosHMC.autCadastrarUsuarioHMCV2(AUT_LOJA_CADASTRO);			
			cadastrosHMC.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			cadastrosHMC.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	/**
	 * 
	 * Configura os parametros de inicialização para cadastros de clientes-VA
	 * 
	 */
	@Test
	public void AUT_IT00002_STCFG_ID00009_FRT009_CN00000_VA_CONFIG_CADASTRO_CLIENTES() {		
		try {
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);  				
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}	
	}

	/**
	 * 
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Física
	 * 
	 */
	@Test
	public void AUT_IT00003_STVA_ID00009_FRT009_CN00002_CADASTRO_CLIENTE_PF_LOJA0035() {		
		try {
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_TIPO_CADASTRO", AUT_VA_CADASTROS.FISICA);
			cadastrosVA.autInitClientMenuCadastroPF();
			cadastrosVA.autLogoutApplication();				
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}catch(java.lang.Exception e) {
			try {
				cadastrosVA.autLogoutApplication();
			}
			catch(java.lang.Exception e1) {

			}
			System.out.println(e.getMessage());
			e.printStackTrace();
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}

	
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_IT00004_STVA_ID00009_FRT009_CN00003_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
		try {
			try {
				cadastrosVA.autLogoutApplication();
			}
			catch(java.lang.Exception e) {

			}
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			cadastrosVA.autInitClientMenuCadastroExtrangeiro();
			cadastrosVA.autLogoutApplication();
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			try {
				cadastrosVA.autLogoutApplication();	
			}
			catch(java.lang.Exception e2) {

			}
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_IT00005_STVA_ID00009_FRT009_CN00004_CADASTRO_CLIENTE_PJ_LOJA0035() {
		cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
		try {
			try {
				cadastrosVA.autLogoutApplication();
			}
			catch(java.lang.Exception e) {

			}
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			cadastrosVA.autInitClientMenuCadastroPJ();
			cadastrosVA.autLogoutApplication();
			cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			try {
				cadastrosVA.autLogoutApplication();	
			}
			catch(java.lang.Exception e2) {

			}
		}
	}


	/**
	 * 8
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	@Test
	public void AUT_IT00006_STPDV_ID00009_FRT009_CN00005_LOGIN_LOJA0035() {				
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			pdv.autPDVAcessos().autPDVLoginDefault();
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {			
			System.out.println(e.getMessage());
			e.printStackTrace();
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}

	@Test
	/**
	 * 3
	 * Executa procedimentos para consulta de material de preço do material PDV
	 * 
	 */
	public void AUT_IT00007_STPDV_ID00009_FRT009_CN00006_VALIDA_PRECO_MATERIAL_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			pdv.autStartConsultaDefault();
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}	

	@Test
	/**
	 * 
	 * Consulta de estoque de material no SAP
	 * 
	 */
	public void AUT_IT00008_STSAP_ID00009_FRT009_CN00007_VALIDA_ESTOQUE_MATERIAL_LOJA0035() {
		try {
			sap.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			sap.autSAPEstoques().autGetStorageMaterial(AUT_LOJA_CADASTRO, sap.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM").toString());
			sap.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			sap.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}	

	
	@Test
	/**
	 * 
	 * Gera voucher para cliente PF
	 * 
	 */
	public void AUT_IT00009_STSAFE_ID00009_FRT009_CN00008_GERAR_VOUCHER_PF() {
		try {
 			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			safe.autSAFEGerarVoucher(AUT_SAFE_TYPE_PERSONS.ESTRANGEIRO,AUT_SAFE_TIPO_CONVENIO.ACORDO_EXTRAJUDICIAL);
			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}	
	
	@Test
	/**
	 * 
	 * Gera voucher para cliente estrangeiro
	 * 
	 */
	public void AUT_IT00010_STSAFE_ID00009_FRT009_CN00009_GERAR_VOUCHER_EST() {
		try {
 			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			safe.autSAFEGerarVoucher(AUT_SAFE_TYPE_PERSONS.FISICA,AUT_SAFE_TIPO_CONVENIO.CLUBE_DO_ESPECIALISTA);
			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}

	
	@Test
	/**
	 * 
	 * Gera voucher para cliente PJ
	 * 
	 */
	public void AUT_IT00011_STSAFE_ID00009_FRT009_CN00010_GERAR_VOUCHER_PJ() {
		try {
 			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			safe.autSAFEGerarVoucher(AUT_SAFE_TYPE_PERSONS.JURIDICA,AUT_SAFE_TIPO_CONVENIO.CLUBE_DO_ESPECIALISTA);
			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * 
	 * Configura os parametros de inicialização do gerador de pedidos
	 * 
	 */
	@Test
	public void AUT_IT00012_STCFG_ID00009_FRT009_CN00000_CONFIG_GERADOR_PEDIDOS_LOJA0035() {
		try {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.AUT_CLIENT_DOC_CNPJ = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF").toString();
			geradorPedidos.AUT_CLIENT_DOC_CPF = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ").toString();
			geradorPedidos.AUT_CLIENT_DOC_PASSAPORT = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_PASSAPORTE").toString();;

			geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);			
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}		
	}

	
	@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00013_STVA_ID00009_FRT009_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
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
	public void AUT_IT00014_STVA_ID00009_FRT009_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}



	@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00015_STPDV_ID00009_FRT009_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			pdv.autStartPagamentoPedido(geradorPedidos.AUT_NUMERO_PEDIDO,AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA);
			if(pdv.autPDVPagamentos().AUT_STATUS_EXECUTION) {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
			}
			else {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
			}
		}
		catch(java.lang.Exception e) {
			if(pdv.autPDVPagamentos().AUT_STATUS_EXECUTION) {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
			}
			else {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
			}		
		}
	}

	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00016_STVA_ID00009_FRT009_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Pago");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	public void AUT_IT00017_STSAP_ID00009_FRT009_CN00017_FATURA_PEDIDO_PF_LOJA0035() {
		try {
			sap.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			sap.autSAPFaturamentos().AUT_SAP_RUNTIME_PARAMETERS = sap.autGetDataFlow().autGetParameters(AUT_TABLE_PARAMETERS_NAMES.AUT_SAP_FATURAMENTO_ZOSDGCP);
			sap.autSAPFaturamentos().autSetParameter("AUT_PEDIDO", geradorPedidos.AUT_NUMERO_PEDIDO);
			sap.autSAPFaturamentos().autFaturarPedido(sap.autGetDataFlow().autGetParameters(AUT_TABLE_PARAMETERS_NAMES.AUT_SAP_FATURAMENTO_ZOSDGCP));
			sap.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			sap.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
		
	
	@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00018_STVA_ID00009_FRT009_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_PF_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVAConsultaStatusPedidoCompleto(geradorPedidos.AUT_NUMERO_PEDIDO, "Pago");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00019_STPDV_ID00009_FRT009_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			pdv.autStartDevolucaoItem(geradorPedidos.AUT_NUMERO_PEDIDO,AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA);
			if(pdv.autPDVDevolucoes().AUT_STATUS_EXECUTION) {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
			else {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
			}	
		}
		catch(java.lang.Exception e) {
			if(pdv.autPDVDevolucoes().AUT_STATUS_EXECUTION) {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
			else {
				pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
			}	
		}
	}


	@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00020_STVA_ID00009_FRT009_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00021_STSAFE_ID00009_FRT009_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035() {
		try {
			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			safe.autCarregarValeTroca(cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT, AUT_SAFE_TYPE_PERSONS.FISICA);
			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			safe.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	@Test
	/**
	 * 
	 * 38
	 * Executa procedimentos para pagamento de pedido no PDV
	 * 
	 */
	public void AUT_IT00038_STPDV_ID00009_FRT009_CN00038_LOGOUT_LOJA0035() {				
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			pdv.autPDVAcessos().autPDVLogoutDefault();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
}
