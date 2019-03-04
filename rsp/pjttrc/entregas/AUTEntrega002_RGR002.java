package br.lry.qa.rsp.pjttrc.entregas;

import java.util.AbstractMap.SimpleEntry;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent;
import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.lry.components.AUTVABaseComponent;
import br.lry.components.hmc.AUTHMCBaseServices;
import br.lry.components.va.AUTVABaseServices;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.components.va.AUTVACadastros.AUT_VA_PROPRIEDADE_RESIDENCIA;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_CLIENTE_INVALIDO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_CONTATO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_ENDERECO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_RESIDENCIA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;
import br.stk.framework.tests.AUTFWKTestObjectBase;

/**
 * 
 *Regressivo de testes Cadatros de Cliente - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega002_RGR002 {
	public static AUTHMCBaseServices hmc;	
	public static AUTVABaseServices va;
	public static String USUARIO_GLOBAL = "00000000", SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";
	private String numCPF;
		
	public void AUT_INIT() {
		AUT_IT99999_STCFG_ID00006_FRT006_CN00000_CONFIG();	
	}	
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização de cadastro de usuário no HMC
	 * 
	 */
	//@Test
	public void AUT_IT00000_STCFG_ID00006_FRT006_CN00000_CONFIG() {
		
		hmc = new AUTHMCBaseServices();
		va = new AUTVABaseServices();
			
		hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT = hmc.autHMCCadastros().autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER").toString();
		hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT = hmc.autHMCCadastros().autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD").toString();
		gerTests = new AUTFWKTestObjectBase();
				
		gerTests.autInitConfigurationProjectExecution(AUTEntrega002_RGR002.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	
	public void AUT_IT99999_STCFG_ID00006_FRT006_CN00000_CONFIG() {
		
		hmc = new AUTHMCBaseServices();
		va = new AUTVABaseServices();
			
		hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT = hmc.autHMCCadastros().autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER").toString();
		hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT = hmc.autHMCCadastros().autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD").toString();
		
		gerTests = new AUTFWKTestObjectBase();					
	}
	
	
	
	/**
	 *
	 * Executa os procedimentos de cadastro de usuário no HMC
	 *
	 */	
	//public static void AUT_IT00001_STHMC_ID00009_FRT009_CN00001_CADASTRO_USUARIO_LOJA0035() {
	public static void main(String[] args) {
		java.util.HashMap<String,Object> params = new java.util.HashMap<String,Object>();
		AUTVABaseComponent bs = new AUTVABaseComponent();
		/**
		 * 
		 * Teste Delete
		 * 
		 */
		params.put("PROJECT_ID", 13);
		params.put("PROCESS_NAME","AUT_PRC_000001_CN000001");
		
		/**
		 * 
		 * Teste inclusão
		 * 
		 */
		params.put("PROCESS_DESCRIPTION","AUT_PRC_000001_CN000000001 DESCRIPTION BY PROCESS NAME DESCRIPTION SCENARIO BUSINESS");
		params.put("PARAMETER_NAME","AUT_PEDIDO");
		params.put("PARAMETER_VALUE","123456666");
		params.put("PARAMETER_ROW", 1);
				
		params.put("COLUMN_NAME", "DRV_PROCESS_DESCRIPTION");
		params.put("COLUMN_VALUE", "AUT NEW DESCRIPTION BY TESTING");

		//bs.autGetDataFlowDBIntegration().autRemoveParameters(params);
		bs.autGetDataFlowDBIntegration().autUpdateParameters(params);
	}

	
	
	/**
	 * 
	 * Configura os parametros de inicialização para cadastros de clientes-VA
	 * 
	 */
	//@Test
	public void AUT_IT00002_STCFG_ID00006_FRT006_CN00002_VA_CADASTRO_CLIENTES() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);			
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT);
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT);  
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_HMC_LOGIN, "AUT_USER_ID", hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT);
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_HMC_LOGIN, "AUT_NOVA_SENHA", hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT);
		
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_USER", hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT);
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_PASSWORD", hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);			
		}
		
	}
			
		
	//@Test
	/**
	 *
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 *
	 */
	public void AUT_IT00003_STVA_ID00006_FRT006_CN00003_CADASTRO_CLIENTE_PJ_LOJA0035() {
		try{
			
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);	
			va.autVACadastros().autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);		
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	//@Test
	/**
	 * CN00002 - Realizar um cadastro de um cliente Pessoa Fisica
	 */
	public void AUT_IT00004_STVA_ID00006_FRT006_CN00004_CADASTRO_CLIENTE_PF_LOJA0035() {
		try{
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.CASA);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		}
	}
	
	
	//@Test
	/**
	 * CN00003 - Realizar um cadastro de um cliente Estrangeiro
	 */
	public void AUT_IT00005_STVA_ID00006_FRT006_CN00005_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.ESTRANGEIRO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
			}
	}

	
	//@Test
	/**
	 * CN00004 -Realizar um cadastro de um cliente adicionando mais de um telefone
	 */
	public void AUT_IT00006_STVA_ID00006_FRT006_CN00006_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035() {
		try{
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClienteMultiplosTelefonesVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	//@Test
	/**
	 * CN00005 - Realizar um cadastro de um cliente com um CPF que já cadastrado
	 */
	public void AUT_IT00007_STVA_ID00006_FRT006_CN00007_REQUISITO_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO() {
		try{
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);			
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CONDOMINIO);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}

	
	
	//@Test
	/**
	 * CN00006 - Realizar um cadastro de um cliente com um CNPJ que já cadastrado
	 */
	public void AUT_IT00008_STVA_ID00006_FRT006_CN00008_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO() {
		try{
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.JURIDICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CONDOMINIO);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}	
	
	
	//@Test
	/**
	 * CN00007 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 */
	public void AUT_IT00009_STVA_ID00006_FRT006_CN00009_CADASTRO_CLIENTE_NAO_SEI_CEP() {
		try{
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.CASA);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	//@Test
	/**
	 * CN00008 - Realizar cadastro de cliente por um cpf invalido
	 */
	public void AUT_IT00010_STVA_ID00006_FRT006_CN00010_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO() {
		try{
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClienteInvalido(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_TIPO_CLIENTE_INVALIDO.CPF);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	//@Test
	/**
	 * CN00009 - Realizar cadastro de cliente por cep invalido
	 */
	public void AUT_IT00011_STVA_ID00006_FRT006_CN00011_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			va.autVACadastros().autCadastroClienteCEPInvalido(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	//@Test
	/**
	 * CN00010 - Realizar cadastro com mais de um endereço
	 */
	public void AUT_IT00012_STVA_ID00006_FRT006_CN00012_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			va.autVACadastros().autCadastroClienteMultiplosEnderecosVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CASA, AUT_VA_TIPO_ENDERECO.COBRANCA, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	

	
	//@Test
	public void AUT_IT00013_STVA_ID00006_FRT006_CN00013_REQUISITO_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO(){
		try{
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", AUTProjectsFunctions.gerarCNPJ());
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}		
	}	
	
	//@Test
	/**
	 * CN00011 - Cadastrar um cliente PJ e classificá-lo como Exceção
	 */
	public void AUT_IT00014_STVA_ID00006_FRT006_CN00014_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", va.autVACadastros().AUT_NUMERO_DOC_CNPJ_OUTPUT);
			va.autVACadastros().autCadastroClientePJExcecao(va.autVACadastros().AUT_NUMERO_DOC_CNPJ_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, false);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		
		}
	}
	
	
	//@Test
	/**
	 * CN00012 - Classificar um cliente PJ já cadastrado como Exceção
	 */
	public void AUT_IT00015_STVA_ID00006_FRT006_CN00015_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			va.autVACadastros().autCadastroClientePJExcecao(va.autVACadastros().AUT_NUMERO_DOC_CNPJ_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, true);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
		
	//@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00016_STVA_ID00006_FRT006_CN00016A_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", AUTProjectsFunctions.gerarCNPJ());
			va.autVACadastros().autCadastroClienteVA(hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	//@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00017_STVA_ID00006_FRT006_CN00016B_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autVACadastros().autCadastroClientePJExcecao(va.autVACadastros().AUT_NUMERO_DOC_CNPJ_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, false);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}		
	}

	//@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00018_STVA_ID00006_FRT006_CN00017_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			va.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", va.autVACadastros().AUT_NUMERO_DOC_CNPJ_OUTPUT);
			va.autVACadastros().autCadastroFilhoPJExcecao(va.autVACadastros().AUT_NUMERO_DOC_CNPJ_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_OUTPUT, hmc.autHMCCadastros().AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO, AUT_VA_PROPRIEDADE_RESIDENCIA.FINANCIADA);
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);			
		}
		catch(java.lang.Exception e) {
			va.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		
		}
	}	
}
