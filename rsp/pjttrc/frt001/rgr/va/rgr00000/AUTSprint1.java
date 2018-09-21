/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

import com.borland.silktest.jtf.SilkTestSuite;

import br.lry.components.AUTBaseComponent.AUT_TEST_OPERATIONS;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.lry.components.hmc.AUTHMCCadastros;
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
 *Regressivo de testes integrados - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTSprint1{	
	public static AUTFWKTestObjectBase gerTests;
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVACadastros cadastrosVA;
	public static AUTVAGeradorPedido geradorPedidos;
	public static AUTVA03ConsultaStatusPedido consultaStatusPedido;
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	String hostExec = "192.168.0.116";

	@Test
	public void AUT_00001_FRT001() {

	}

	/**
	 * 
	 * Configura os parametros de inicialização para realização de cadastros no HMC
	 * 
	 */
	@Test
	public void AUT_CN00000_CONFIG() {
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
		geradorPedidos = new AUTVAGeradorPedido();	
		consultaStatusPedido = new AUTVA03ConsultaStatusPedido();
		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTSprint1.class,AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	}

	/**
	 * 
	 * Executa os procedimentos de cadastro
	 * 
	 */
	@Test
	public void AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035"});
			AUT_LOJA_CADASTRO = "0035";
			cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035"});
		}
	}

	/**
	 * 
	 * Executa procedimentos de consulta de produto
	 * 
	 */
	//@Test
	public void AUT_CN00002_SAP_CONSULTA_ESTOQUE_PRODUTO_LOJA0035() {
		
		AUTSAPConsultaEstoque estoqueProcess = new AUTSAPConsultaEstoque();

		estoqueProcess.autGetStorageMaterial("0035",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM").toString()); 			 
	}

	@Test
	/**
	 * 
	 * Executa procedimentos para consulta de material de preço do material PDV
	 * 
	 */
	public void AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035() {
		try {
		gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});

		AUTPDVConsultaPrecoItem pdvConsultaItem = new AUTPDVConsultaPrecoItem();
		java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
		parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
		pdvConsultaItem.autStartProcess(parametrosConfig);
		gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});

		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});			
		}
	}	


	/**
	 * 
	 * Configura os parametros de inicialização para cadastros de clientes-VA
	 * 
	 */
	@Test
	public void AUT_CN00004_VA_CONFIG_CADASTRO_CLIENTES() {		
		try {
		gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00004_VA_CONFIG_CADASTRO_CLIENTES"});
		cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
		cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);  				
		gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00004_VA_CONFIG_CADASTRO_CLIENTES"});
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00004_VA_CONFIG_CADASTRO_CLIENTES"});			
		}	
	}


	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Física
	 * 
	 */
	@Test
	public void AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035() {		
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035"});			
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_TIPO_CADASTRO", AUT_VA_CADASTROS.FISICA);
			cadastrosVA.autInitClientMenuCadastroPF();
			cadastrosVA.autLogoutApplication();			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035"});			
		}catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035"});			
		}
	}
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Jurídica
	 * 
	 */
	@Test
	public void AUT_CN00006_VA_CADASTRO_CLIENTE_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_PJ_LOJA0035"});	
			cadastrosVA.autInitClientMenuCadastroPJ();
			cadastrosVA.autLogoutApplication();			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_PJ_LOJA0035"});			
			
		}catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_PJ_LOJA0035"});						
		}
	}
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_CN00007_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00007_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});						
			cadastrosVA.autInitClientMenuCadastroExtrangeiro();
			cadastrosVA.autLogoutApplication();
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00007_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00007_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});						
		}
	}


	/**
	 * 
	 * Configura os parametros de inicialização do gerador de pedidos
	 * 
	 */
	@Test
	public void AUT_CN00008_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00008_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035"});						
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.AUT_CLIENT_DOC_CNPJ = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF").toString();
			geradorPedidos.AUT_CLIENT_DOC_CPF = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ").toString();
			geradorPedidos.AUT_CLIENT_DOC_PASSAPORT = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_PASSAPORTE").toString();;

			geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00008_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035"});								
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00008_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035"});									
		}		
	}

	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 * 
	 */
	@Test
	public void AUT_CN00009_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00009_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});									
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT.toString());			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00009_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});									
			
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00009_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});												
		}
	}

	@Test
	public void AUT_CN00010_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00010_VA_CONSULTA_PEDIDO_LOJA0035"});												
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00010_VA_CONSULTA_PEDIDO_LOJA0035"});												
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00010_VA_CONSULTA_PEDIDO_LOJA0035"});												
		}		
	}

	@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00011_PDV_PAGAMENTO_PEDIDO_LOJA0035() {				
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00011_PDV_PAGAMENTO_PEDIDO_LOJA0035"});															
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00011_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																		
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00011_PDV_PAGAMENTO_PEDIDO_LOJA0035"});															
		}
	}


	@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00012_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00012_VA_CONSULTA_PEDIDO_LOJA0035"});															
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00012_VA_CONSULTA_PEDIDO_LOJA0035"});															
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00012_VA_CONSULTA_PEDIDO_LOJA0035"});															
		}
		consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");
	}


	@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00013_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00013_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});															
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00013_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																		
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00013_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																	
		}
	}


	@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00014_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00014_VA_CONSULTA_PEDIDO_LOJA0035"});																	
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00014_VA_CONSULTA_PEDIDO_LOJA0035"});																			
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00014_VA_CONSULTA_PEDIDO_LOJA0035"});																				
		}
	}


	@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Cartão de Crédito
	 */
	public void AUT_CN00015_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00015_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																				
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00015_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																				
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00015_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																							
		}
	}	 

	@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00016_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00016_VA_CONSULTA_PEDIDO_LOJA0035"});																							
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00016_VA_CONSULTA_PEDIDO_LOJA0035"});																							
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00016_VA_CONSULTA_PEDIDO_LOJA0035"});																							
		}
	}

	@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00017_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00017_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																							
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00017_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																										
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00017_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																										
		}
		
	}


	@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00018_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00018_VA_CONSULTA_PEDIDO_LOJA0035"});																										
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00018_VA_CONSULTA_PEDIDO_LOJA0035"});																												
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00018_VA_CONSULTA_PEDIDO_LOJA0035"});																													
		}		
	}


	@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00019_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00019_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																													
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00019_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00019_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																
		}		
	}


	@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00020_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00020_VA_CONSULTA_PEDIDO_LOJA0035"});																																
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00020_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00020_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
		}
	}


	@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Cartão Celebre/Próprio
	 */ 
	public void AUT_CN00021_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00021_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00021_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00021_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00022_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00022_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00022_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00022_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00023_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00023_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00023_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00023_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00024_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00024_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00024_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00024_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00025_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00025_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00025_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00025_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00026_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00026_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00026_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00026_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00027_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00027_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00027_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00027_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00028_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00028_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00028_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00028_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00030_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00030_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00030_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00030_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00031_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00031_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00031_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00031_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00032_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00032_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00032_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00032_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}



	//@Test
	/** 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Cartão de Crédito
	 */
	public void AUT_CN00033_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00033_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00033_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00033_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00034_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00034_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00034_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00034_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00035_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00035_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00035_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00035_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00036_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00036_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00036_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00036_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00037_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00037_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00037_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00037_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00038_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00038_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00038_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00038_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/** 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Cartão Celebre/Próprio
	 */ 
	public void AUT_CN00039_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00039_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00039_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00039_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00040_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00040_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00040_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00040_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00041_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00041_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00041_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00041_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00042_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00042_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00042_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00042_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00043_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00043_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00043_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00043_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00044_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00044_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00044_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00044_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

		consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");
	}


	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00045_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00045_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00045_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00045_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00046_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00046_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00046_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00046_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00047_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00047_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00047_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00047_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00048_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00049_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00049_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00049_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00049_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00050_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00050_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00050_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00050_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Cartão de Crédito
	 */
	public void AUT_CN00051_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00051_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00051_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00051_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00052_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00052_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00052_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00052_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00053_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00053_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00053_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00053_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00054_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00054_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00054_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00054_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00056_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00056_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);	

			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00056_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00056_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00055_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00055_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00055_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00055_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Cartão de Celebre/Próprio
	 */ 
	public void AUT_CN00056_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00056_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00056_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00056_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00057_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00057_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00057_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00057_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00058_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00058_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00058_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00058_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00059_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00059_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00059_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00059_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00060_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00060_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00060_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00060_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00061_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00061_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00061_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00061_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}














	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_CN00062_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00062_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT.toString());			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00062_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00062_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00063_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00063_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00063_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00063_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00064_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00064_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00064_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00064_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00065_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00065_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00065_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00065_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00066_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00066_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00066_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00066_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00067_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00067_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00067_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00067_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Cartão de Crédito
	 */
	public void AUT_CN00068_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00068_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00068_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00068_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																						
		}

	}	 

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00069_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00069_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00069_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00069_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		
	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00070_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00070_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00070_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00070_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00071_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00071_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00071_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00071_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00072_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00072_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00072_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00072_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00073_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00073_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00073_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00073_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Cartão de Celebre/Próprio
	 */ 
	public void AUT_CN00074_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00074_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00074_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00074_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00075_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00075_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00075_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00075_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00076_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00076_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00076_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00076_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00077_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00077_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00077_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00077_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00078_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00078_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00078_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00078_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00079_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00079_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00079_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00079_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00080_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00080_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);		
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00080_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00080_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00081_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00081_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00081_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00081_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00082_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00082_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00082_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00082_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00083_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00083_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00083_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00083_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00084_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00084_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00084_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00084_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00085_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00085_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00085_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00085_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Interna Imediata - Cartão de Crédito
	 */
	public void AUT_CN00086_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00086_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00086_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00086_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00087_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00087_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00087_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00087_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00088_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00088_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00088_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00088_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00089_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00089_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00089_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00089_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00090_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00090_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00090_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00090_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00091_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00091_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00091_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00091_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Interna Imediata - Cartão de Celebre/Próprio
	 */ 
	public void AUT_CN00092_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00092_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00092_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00092_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00093_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00093_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00093_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00093_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00094_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00094_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00094_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00094_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00095_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00095_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00095_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00095_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00096_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00096_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00096_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00096_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00097_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00097_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00097_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00097_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00098_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00099_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00099_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00099_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00099_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00100_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00100_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00100_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00100_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00101_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00101_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00101_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00101_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00102_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00102_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00102_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00102_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00103_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00103_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00103_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00103_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Externa Imediata - Cartão de Crédito
	 */
	public void AUT_CN00104_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00104_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00104_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00104_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00105_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00105_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00105_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00105_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00106_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00106_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00106_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00106_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00107_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00107_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00107_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00107_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00108_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00108_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00108_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00108_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00109_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00109_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00109_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00109_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Externa Imediata - Cartão de Celebre/Próprio
	 */ 
	public void AUT_CN00110_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00111_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00111_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00111_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00111_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00112_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00112_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 		
			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00112_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00112_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00113_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00113_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00113_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00113_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00114_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00114_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00114_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00114_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00115_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00115_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00115_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00115_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}








	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeiro - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_CN00116_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00116_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00116_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00116_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035"});																																						
		}

	}



	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00117_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00117_VA_CONSULTA_PEDIDO_LOJA0035"});																																					consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00117_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00117_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00118_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00118_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00118_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00118_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00119_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00119_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00119_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00120_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00120_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00120_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00120_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00121_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00121_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00121_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00121_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Caixa - Cartão de Crédito
	 */
	public void AUT_CN00122_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00122_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00122_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00122_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																						
		}

	}	 

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00123_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00123_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00123_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00123_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00124_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00124_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();

			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00124_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00124_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00125_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00125_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00125_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00125_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00126_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00126_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00126_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00126_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00127_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00127_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00127_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00127_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 *  Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Caixa - Cartão de Celebre/Próprio
	 */ 
	public void AUT_CN00128_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00128_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00128_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00128_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00129_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00129_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00129_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00129_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00130_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00130_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00130_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00130_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00131_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00131_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00131_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00131_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00132_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00132_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00132_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00132_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00133_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00133_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00133_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00133_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}



	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00134_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00134_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00134_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00134_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});																																						
		}
	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00135_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00135_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00135_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00135_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00136_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00136_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00136_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00136_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00137_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00137_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00137_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00137_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00138_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00138_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00138_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00138_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00139_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00139_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00139_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00139_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Interna Imediata - Cartão de Crédito
	 */
	public void AUT_CN00140_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00140_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00140_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00140_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00141_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00141_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00141_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00141_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00142_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00142_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00142_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00142_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00143_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00143_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00143_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00143_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00144_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00144_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00144_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00144_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00145_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00145_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00145_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00145_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Interna Imediata - Cartão de Celebre/Próprio
	 */ 
	public void AUT_CN00146_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00146_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00146_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00146_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00147_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00147_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00147_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00147_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00148_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00148_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 		
			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00148_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00148_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00149_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00149_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00149_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00149_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 *  Devolução do pedido no PDV 
	 */
	public void AUT_CN00150_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00150_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);	
			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00150_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00150_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00151_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00151_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00151_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00151_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00152_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00152_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00152_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00152_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00153_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00153_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00153_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00153_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00154_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00154_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00154_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00154_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00155_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00155_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00155_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00155_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00156_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00156_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00156_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00156_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00157_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00157_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00157_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00157_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Externa Imediata - Cartão de Crédito
	 */
	public void AUT_CN00158_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00158_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00158_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00029_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00159_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00159_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00159_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00159_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00160_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00160_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00160_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00160_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00161_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00161_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00161_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00161_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00162_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00162_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);	
			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00162_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00162_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00163_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00163_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00163_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00163_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Externa Imediata - Cartão de Celebre/Próprio
	 */ 
	public void AUT_CN00164_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00164_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																			
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00164_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00164_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PE_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00165_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00165_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00165_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00165_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}

	//@Test
	/**
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00166_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00166_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																			
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00166_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00166_PDV_PAGAMENTO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00167_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00167_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00167_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00167_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00168_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00168_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																			
			AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00168_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00168_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});																																						
		}

	}


	//@Test
	/**
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00169_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(), new Object[] {"AUT_CN00169_VA_CONSULTA_PEDIDO_LOJA0035"});																																			
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00169_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}
		catch(java.lang.Exception e) {
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_TEST_OPERATIONS.UPDATE_TABLE_PROJECT_DETAIL_ERRO.toString(), new Object[] {"AUT_CN00169_VA_CONSULTA_PEDIDO_LOJA0035"});																																						
		}

	}


}
