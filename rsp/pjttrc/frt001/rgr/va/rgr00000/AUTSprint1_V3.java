/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

import com.borland.silktest.jtf.SilkTestSuite;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
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
public class AUTSprint1_V3{	
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
		gerTests.autInitConfigurationProjectExecution(AUTSprint1_V3.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
		gerTests.autSetDesktopAgent(cadastrosHMC.AUT_AGENT_SILK4J);
	}

	/**
	 * 1
	 * Executa os procedimentos de cadastro
	 * 
	 */
	@Test
	public void AUT_VA_ID00001_FRT001_CN00001A_HMC_CADASTRO_USUARIO_LOJA0035() {
		try {	
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001A_HMC_CADASTRO_USUARIO_LOJA0035"});					
			AUT_LOJA_CADASTRO = "0035";
			cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001A_HMC_CADASTRO_USUARIO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001A_HMC_CADASTRO_USUARIO_LOJA0035"});
		}
	}

	@Test
	/**
	 * 8
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00001_PDV_LOGIN_LOJA0035() {				
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001_PDV_LOGIN_LOJA0035"});
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			pdvConsultaItem.autStartLogin(parametrosConfig.get("AUT_OPERADOR").toString(), parametrosConfig.get("AUT_PWD_OPERADOR").toString());
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001_PDV_LOGIN_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001_PDV_LOGIN_LOJA0035"});
		}
	}


	@Test
	/**
	 * 3
	 * Executa procedimentos para consulta de material de preço do material PDV
	 * 
	 */
	public void AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});
			AUTPDVConsultaPrecoItem pdvConsultaItem = new AUTPDVConsultaPrecoItem();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			pdvConsultaItem.autStartProcess(parametrosConfig);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});
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
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00004_VA_CONFIG_CADASTRO_CLIENTES"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);  				
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00004_VA_CONFIG_CADASTRO_CLIENTES"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00004_VA_CONFIG_CADASTRO_CLIENTES"});
		}	
	}


	/**
	 * 4
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Física
	 * 
	 */
	@Test
	public void AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035() {		
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_TIPO_CADASTRO", AUT_VA_CADASTROS.FISICA);
			cadastrosVA.autInitClientMenuCadastroPF();
			cadastrosVA.autLogoutApplication();			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035"});
		}catch(java.lang.Exception e) {
			try {
				cadastrosVA.autLogoutApplication();
			}
			catch(java.lang.Exception e1) {

			}
			System.out.println(e.getMessage());
			e.printStackTrace();
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_PF_LOJA0035"});
		}
	}


	/**
	 * 6
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_CN00006_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		try {
			try {
				cadastrosVA.autLogoutApplication();
			}
			catch(java.lang.Exception e) {

			}
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});
			cadastrosVA.autInitClientMenuCadastroExtrangeiro();
			cadastrosVA.autLogoutApplication();
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			try {
				cadastrosVA.autLogoutApplication();	
			}
			catch(java.lang.Exception e2) {

			}
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});
		}
	}


	/**
	 * 7
	 * 
	 * Configura os parametros de inicialização do gerador de pedidos
	 * 
	 */
	@Test
	public void AUT_CN00007_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00007_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035"});
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.AUT_CLIENT_DOC_CNPJ = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF").toString();
			geradorPedidos.AUT_CLIENT_DOC_CPF = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ").toString();
			geradorPedidos.AUT_CLIENT_DOC_PASSAPORT = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_PASSAPORTE").toString();;

			geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00007_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00007_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035"});
		}		
	}

	/**
	 * 8
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 * 
	 */
	@Test
	public void AUT_CN00008_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00008_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT.toString());			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00008_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00008_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});
		}
	}

	/**
	 * 9
	 * 
	 */
	@Test
	public void AUT_CN00009_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00009_VA_CONSULTA_PEDIDO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00009_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00009_VA_CONSULTA_PEDIDO_LOJA0035"});
		}		
	}


	@Test
	/**
	 * 10
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00010_PDV_PAGAMENTO_PEDIDO_LOJA0035() {				

		AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();

		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.CAIXA);

			pdvConsultaItem.autStartProcess(parametrosConfig);	

			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}

		}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}		
		}
	}


	@Test
	/**
	 * 11
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00011_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00011_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autGetProjectManagerOverview().autExecSubStatementsDefault(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(), new Object[] {"AUT_CN00011_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});															
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00011_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
		}
	}


	@Test
	/**
	 * 12
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00012_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();

		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			Integer qtd = Integer.parseInt(geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM").toString());			
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM").toString());
			parametrosConfig.put("AU"
					+ "T_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.CAIXA);
			
			pdvConsultaItem.autStartProcess(parametrosConfig);	

			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}	
		}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}	
		}
	}


	@Test
	/**
	 * 13
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00013_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00013_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00013_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00013_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}
	}


	@Test
	/**
	 * 14
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00014_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00014_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00014_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00014_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035"});
		}

	}


	@Test
	/**
	 * 
	 * 15
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00015_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00015_VA_CONSULTA_PEDIDO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00015_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00015_VA_CONSULTA_PEDIDO_LOJA0035"});
		}

	}


	@Test
	/**
	 * 16
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00016_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();

		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.name());
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}																																						
		}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}	
		}

	}


	@Test
	/**
	 * 17
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00017_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00017_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00017_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00017_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
		}

	}


	@Test
	/**
	 * 18
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00018_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00018_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.name());
			
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00018_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00018_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}		}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00018_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00018_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			}
	}


	@Test
	/**
	 * 19
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00019_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00019_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00019_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00019_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}
	}


	@Test
	/**
	 * 20
	 * 
	 * Executa procedimentos de criação de pedido para pessoa estrangeiro - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_CN00020_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00020_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035"});
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00020_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00020_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035"});
		}

	}


	@Test
	/**
	 * 21
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00021_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00021_VA_CONSULTA_PEDIDO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00021_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00021_VA_CONSULTA_PEDIDO_LOJA0035"});
		}

	}

	@Test
	/**
	 * 22
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00022_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();

		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00022_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.CAIXA);
			
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00022_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00022_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
		}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_PDV_CONSULTA_PRECO_MATERIAL_LOJA0035"});
			}		
			}

	}


	@Test
	/**
	 * 23
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00023_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00023_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00023_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00023_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
		}
	}


	@Test
	/**
	 * 24
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00024_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();

		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00024_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.CAIXA);
			
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00024_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00024_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}		}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00024_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00024_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			}
	}


	@Test
	/**
	 * 25
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00025_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00025_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00025_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00025_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}

	}

	@Test
	/**
	 * 26
	 * Executa procedimentos de criação de pedido para pessoa estrangeira - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	public void AUT_CN00026_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00026_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00026_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00026_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PE_LOJA0035"});
		}

	}


	@Test
	/**
	 * 27
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00027_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00027_VA_CONSULTA_PEDIDO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00027_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00027_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
	}

	@Test
	/**
	 * 28
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_CN00028_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
	
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00028_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.name());
			
			
			pdvConsultaItem.autStartProcess(parametrosConfig);	
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00028_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00028_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00028_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00028_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			}

	}


	@Test
	/**
	 * 29
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 * 
	 */
	public void AUT_CN00029_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00029_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00029_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00029_VA_CONSULTA_PEDIDO_PAGAMENTO_LOJA0035"});
		}
	}


	@Test
	/**
	 * 30
	 * 
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00030_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();		
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00030_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.name());
			
			pdvConsultaItem.autStartProcess(parametrosConfig);	
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00030_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00030_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
		}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00030_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00030_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			}

	}


	@Test
	/**
	 * 31
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00031_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00031_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00031_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00031_VA_CONSULTA_PEDIDO_DEVOLUCAO_LOJA0035"});
		}
	}


	@Test
	/**
	 * 
	 * 32
	 * 
	 * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_CN00032_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00032_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});
			geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
			geradorPedidos.autVAGeracaoPedidosV2(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT.toString());			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00032_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00032_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035"});
		}
	}


	@Test
	/**
	 * 33
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00033_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00033_VA_CONSULTA_PEDIDO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Aguardando liberação de pagamento");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00033_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00033_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
	}

	@Test
	/**
	 * 34
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 * 
	 */
	public void AUT_CN00034_PDV_PAGAMENTO_PEDIDO_LOJA0035() {
		AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
		
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00034_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.CAIXA);
						
			pdvConsultaItem.autStartProcess(parametrosConfig);			 					
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00034_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00034_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			}
		catch(java.lang.Exception e) {  
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00034_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00034_PDV_PAGAMENTO_PEDIDO_LOJA0035"});
			}
			}
	}


	@Test
	/**
	 * 35
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	public void AUT_CN00035_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00035_VA_CONSULTA_PEDIDO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Faturado Total");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00035_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00035_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
	}


	@Test
	/**
	 * 36
	 * Devolução do pedido no PDV
	 */
	public void AUT_CN00036_PDV_DEVOLUCAO_PEDIDO_LOJA0035() {
		AUTPDVDevolucaoItem pdvConsultaItem = new AUTPDVDevolucaoItem();
	
		try {
			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00036_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));	
			parametrosConfig.put("AUT_LOJA_DEVOLUCAO","0035");
			parametrosConfig.put("AUT_ITEM_QUANTIDADE",geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_QUANTIDADE_ITEM"));
			parametrosConfig.put("AUT_DD","11");
			parametrosConfig.put("AUT_TELEFONE","912123434");
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			parametrosConfig.put("AUT_PWD_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_COORDENADOR"));
			parametrosConfig.put("AUT_FLUXO_SAIDA", AUT_VA_FLUXO_SAIDA.CAIXA);
			
			pdvConsultaItem.autStartProcess(parametrosConfig);				
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00036_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00036_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			}
		catch(java.lang.Exception e) {
			if(pdvConsultaItem.AUT_STATUS_EXECUTION) {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00036_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
			else {
				gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00036_PDV_DEVOLUCAO_PEDIDO_LOJA0035"});
			}
		}

	}


	@Test
	/**
	 * 37
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 * 
	 */
	public void AUT_CN00037_VA_CONSULTA_PEDIDO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00037_VA_CONSULTA_PEDIDO_LOJA0035"});
			consultaStatusPedido.AUTVA03ConsultaStatusPedido(geradorPedidos.AUT_NUMERO_PEDIDO, "Devolvido");			
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00037_VA_CONSULTA_PEDIDO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00037_VA_CONSULTA_PEDIDO_LOJA0035"});
		}

	}



	@Test
	/**
	 * 
	 * 38
	 * Executa procedimentos para pagamento de pedido no PDV
	 * 
	 */
	public void AUT_CN00038_PDV_LOGOUT_LOJA0035() {				
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00038_PDV_LOGOUT_LOJA0035"});
			AUTPDVPagamentoPedido pdvConsultaItem = new AUTPDVPagamentoPedido();
			java.util.HashMap<String,Object> parametrosConfig = new java.util.HashMap<String,Object>();
			parametrosConfig.put("AUT_MATERIAL", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_CODIGO_ITEM"));
			parametrosConfig.put("AUT_PEDIDO", Integer.parseInt(geradorPedidos.AUT_NUMERO_PEDIDO));		
			parametrosConfig.put("AUT_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_OPERADOR"));
			parametrosConfig.put("AUT_PWD_OPERADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_PWD_OPERADOR"));
			parametrosConfig.put("AUT_COORDENADOR", geradorPedidos.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_PDV_LINX, "AUT_COORDENADOR"));
			pdvConsultaItem.autPDVLogout(parametrosConfig.get("AUT_COORDENADOR").toString(), parametrosConfig.get("AUT_PWD_OPERADOR").toString());
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00038_PDV_LOGOUT_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00038_PDV_LOGOUT_LOJA0035"});
		}
	}
}
