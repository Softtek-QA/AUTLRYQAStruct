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
 * 		-HMC
 * 		-VA
 * 		-PDV
 *      -SAFE
 * 
 * FLUXOS DE EXECUÇÃO:
 * 
 *  1º   - HMC    - CADASTRO DE USUÁRIO DE LOJA
 *  2º   - PDV    - LOGIN - PDV
 *  3º   - VA     - CONSULTA DE PREÇO DO MATERIAL UTILIZADO NOS PEDIDOS
 *  4º   - VA     - CADASTRA CLIENTE PF - PESSOA FÍSICA
 *  5º   - VA     - CADASTRA CLIENTE EST - ESTRANGEIRO
 *  6º   - VA     - CADASTRA CLIENTE PJ - PESSOA JURÍDICA
 *  8º   - VA     - CRIAR PEDIDO PARA PF - FLUXO DE SAÍDA - CAIXA - PAGAMENTO - DINHEIRO -VA
 *  9º   - VA     - CONSULTA STATUS DO PEDIDO CRIADO
 *  10º  - PDV    - EFETUA O PAGAMENTO DO PEDIDO - PDV
 *  11º  - VA     - CONSULTA STATUS DO PEDIDO PAGO
 *  12º  - PDV 	  - EFETUA DEVOLUÇÃO DO PEDIDO
 *  13º  - VA     - CONSULTA STATUS DO PEDIDO DEVOLVIDO
 *  
 *  14º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - RETIRADA EXTERNA IMEDIATA PARA - PAGAMENTO EM DINHEIRO - PF
 *  15º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - RETIRADA INTERNA IMEDIATA PARA - PAGAMENTO EM DINHEIRO - PF
 *  16º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - CAIXA - PAGAMENTO EM DINHEIRO - EST
 *  17º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - RETIRADA EXTERNA IMEDIATA PARA - PAGAMENTO EM DINHEIRO - EST
 *  18º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - RETIRADA INTERNA IMEDIATA PARA - PAGAMENTO EM DINHEIRO - EST
 *  19º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - CAIXA PARA - PAGAMENTO EM DINHEIRO - PJ
 *  20º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - RETIRADA INTERNA IMEDIATA PARA - PAGAMENTO EM DINHEIRO - PJ
 *  21º  - 8º-13º     - CRIAR PEDIDO - FLUXO DE SAÍDA - RETIRADA INTERNA IMEDIATA PARA - PAGAMENTO EM DINHEIRO - PJ
 *  
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega001V2{	
	public static AUTFWKTestObjectBase gerTests;
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVACadastros cadastrosVA;
	public static AUTVAGeradorPedido geradorPedidos;
	public static AUTVA03ConsultaStatusPedido consultaStatusPedido;
	public static br.lry.components.pdv.AUTPDVBaseServices pdv;
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	
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
	public void AUT_AUT_IT00001_CFG_ID00009_FRT009_CN00000() {	
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
		geradorPedidos = new AUTVAGeradorPedido();	
		consultaStatusPedido = new AUTVA03ConsultaStatusPedido();
		gerTests = new AUTFWKTestObjectBase();
		pdv = new AUTPDVBaseServices();	
		gerTests.autInitConfigurationProjectExecution(AUTEntrega001V2.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
		gerTests.autSetDesktopAgent(cadastrosHMC.AUT_AGENT_SILK4J);
	}

	
	/**
	 * 1
	 * Executa os procedimentos de cadastro
	 * 
	 */
	@Test
	public void AUT_IT00001_STHMC_ID00009_FRT009_CN00001A_CADASTRO_USUARIO_LOJA0035() {
		try {	
			//cadastrosHMC.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);					
			AUT_LOJA_CADASTRO = "0035";
			cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);			
			//cadastrosHMC.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			//cadastrosHMC.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}

	/**
	 * 8
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	//@Test
	public void AUT_IT00002_STPDV_ID00009_FRT009_CN00001_LOGIN_LOJA0035() {				
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


	//@Test
	/**
	 * 3
	 * Executa procedimentos para consulta de material de preço do material PDV
	 * 
	 */
	public void AUT_IT00003_STPDV_ID00009_FRT009_CN00003_CONSULTA_PRECO_MATERIAL_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			pdv.autStartConsultaDefault();
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}	


	/**
	 * 
	 * Configura os parametros de inicialização para cadastros de clientes-VA
	 * 
	 */
	//@Test
	public void AUT_IT00004_STCFG_ID00009_FRT009_CN00004_VA_CONFIG_CADASTRO_CLIENTES() {		
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
	 * 4
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Física
	 * 
	 */
	//@Test
	public void AUT_IT00005_STVA_ID00009_FRT009_CN00005_CADASTRO_CLIENTE_PF_LOJA0035() {		
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
	 * 6
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	//@Test
	public void AUT_IT00006_STVA_ID00009_FRT009_CN00006_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
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
	 * 6
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_IT00007_STVA_ID00009_FRT009_CN00007_CADASTRO_CLIENTE_PJ_LOJA0035() {
		//cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
		try {
			try {
				cadastrosVA.autLogoutApplication();
			}
			catch(java.lang.Exception e) {

			}
			//cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			cadastrosVA.autInitClientMenuCadastroPJ();
			cadastrosVA.autLogoutApplication();
			//cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			try {
				cadastrosVA.autLogoutApplication();	
			}
			catch(java.lang.Exception e2) {

			}
			//cadastrosVA.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}

	/**
	 * 7
	 * 
	 * Configura os parametros de inicialização do gerador de pedidos
	 * 
	 */
	@Test
	public void AUT_IT00008_STCFG_ID00009_FRT009_CN00008_CONFIG_GERADOR_PEDIDOS_LOJA0035() {
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

	/**
	 * 8
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 * 
	 */
	@Test
	public void AUT_IT00009_STVA_ID00009_FRT009_CN00009_PEDIDO_CAIXA_SD_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());			
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	@Test
	public void AUT_IT00010_STVA_ID00009_FRT009_CN00010_RETIRADA_EXTERNA_IMEDIATA_SD_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT);			
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	public void AUT_IT00011_STVA_ID00009_FRT009_CN00011_RETIRADA_INTERNA_IMEDIATA_SD_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;			
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT);			
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			//geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	/**
	 * 8
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 * 
	 */
	//@Test
	public void AUT_IT00008_STVA_ID00009_FRT009_CN00008_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT.toString());			
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}

	/**
	 * 9
	 * 
	 */
	//@Test
	public void AUT_IT00009_STVA_ID00009_FRT009_CN00009_CONSULTA_PEDIDO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);	
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}		
	}

	
	//@Test
	/**
	 * 10
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00010_STPDV_ID00009_FRT009_CN00010_PAGAMENTO_PEDIDO_LOJA0035() {				
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			pdv.autStartPagamentoPedido(geradorPedidos.AUT_NUMERO_PEDIDO);
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


	//@Test
	/**
	 * 11
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00011_STVA_ID00009_FRT009_CN00011_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 12
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_IT00012_STPDV_ID00009_FRT009_CN00012_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			pdv.autStartDevolucaoItem(geradorPedidos.AUT_NUMERO_PEDIDO);
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


	//@Test
	/**
	 * 13
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00013_STVA_ID00009_FRT009_CN00013_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 14
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00014_STVA_ID00009_FRT009_CN00014_RETIRADA_EXTERNA_IMEDIATA_SD_PAG_DINHEIRO_PF_LOJA0035() {
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


	//@Test
	/**
	 * 
	 * 15
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00015_STVA_ID00009_FRT009_CN00015_CONSULTA_PEDIDO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}

	}


	//@Test
	/**
	 * 16
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00016_STPDV_ID00009_FRT009_CN00016_PAGAMENTO_PEDIDO_LOJA0035() {
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


	//@Test
	/**
	 * 17
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00017_STVA_ID00009_FRT009_CN00017_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 18
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_IT00018_STPDV_ID00009_FRT009_CN00018_DEVOLUCAO_PEDIDO_LOJA0035() {
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


	//@Test
	/**
	 * 19
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00019_STVA_ID00009_FRT009_CN00019_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 20
	 * 
	 * Executa procedimentos de criação de pedido para pessoa estrangeiro - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_IT00020_STVA_ID00009_FRT009_CN00020_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		try {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());			
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00021_STVA_ID00009_FRT009_CN00021_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}

	//@Test
	/**
	 * 22
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00022_STPDV_ID00009_FRT009_CN00022_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			pdv.autStartPagamentoPedido(geradorPedidos.AUT_NUMERO_PEDIDO);
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


	//@Test
	/**
	 * 23
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00023_STVA_ID00009_FRT009_CN00023_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 24
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_IT00024_STPDV_ID00009_FRT009_CN00024_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			pdv.autStartDevolucaoItem(geradorPedidos.AUT_NUMERO_PEDIDO);
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


	//@Test
	/**
	 * 25
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00025_STVA_ID00009_FRT009_CN00025_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}

	}

	//@Test
	/**
	 * 26
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00026_STVA_ID00009_FRT009_CN00026_RETIRADA_EXTERNA_IMEDIATA_SD_PAG_DINHEIRO_PE_LOJA0035() {
		try {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}

	}


	//@Test
	/**
	 * 27
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00027_STVA_ID00009_FRT009_CN00027_CONSULTA_PEDIDO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}

	//@Test
	/**
	 * 28
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00028_STPDV_ID00009_FRT009_CN00028_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
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


	//@Test
	/**
	 * 29
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 * 
	 */
	public void AUT_IT00029_STVA_ID00009_FRT009_CN00029_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 30
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_IT00030_STPDV_ID00009_FRT009_CN00030_DEVOLUCAO_PEDIDO_LOJA0035() {
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


	//@Test
	/**
	 * 31
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00031_STVA_ID00009_FRT009_CN00031_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}

	//@Test
	/**
	 * 
	 * 32
	 * 
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_IT00032_STVA_ID00009_FRT009_CN00032_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT.toString());			
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			geradorPedidos.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 33
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00033_STVA_ID00009_FRT009_CN00033_CONSULTA_PEDIDO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}

	//@Test
	/**
	 * 34
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 * 
	 */
	public void AUT_IT00034_STPDV_ID00009_FRT009_CN00034_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);	
			pdv.autStartPagamentoPedido(geradorPedidos.AUT_NUMERO_PEDIDO);
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


	//@Test
	/**
	 * 35
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_IT00035_STVA_ID00009_FRT009_CN00035_CONSULTA_PEDIDO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	//@Test
	/**
	 * 36
	 * Devolução do pedido no PDV
	 */
	public void AUT_IT00036_STPDV_ID00009_FRT009_CN00036_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			pdv.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			pdv.autStartDevolucaoItem(geradorPedidos.AUT_NUMERO_PEDIDO);
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


	//@Test
	/**
	 * 37
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 * 
	 */
	public void AUT_IT00037_STVA_ID00009_FRT009_CN00037_CONSULTA_PEDIDO_LOJA0035() {
		try {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			consultaStatusPedido.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}

	}



	//@Test
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
