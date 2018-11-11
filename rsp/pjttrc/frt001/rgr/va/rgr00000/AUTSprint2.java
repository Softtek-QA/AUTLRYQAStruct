package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.lry.components.hmc.AUTHMCCadastros;
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
public class AUTSprint2 {
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVACadastros cadastrosVA;
	public static String USUARIO_GLOBAL = "00000000", SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";
	private String numCPF;
	
	@Test
	public void AUT_00016_FRT015() {
		
	}
	
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização de cadastro de usuário no HMC
	 * 
	 */
	@Test
	public void AUT_CN00000_CONFIG() {
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
			
		cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT = cadastrosHMC.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER").toString();
		cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT = cadastrosHMC.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD").toString();
		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTSprint2.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
		
	}
	
	
	/**
	 * Executa os procedimentos de cadastro de usuário no HMC
	 */
	@Test
	public void AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035"});					
			AUT_LOJA_CADASTRO = "0035";
			cadastrosHMC.autCadastrarUsuarioHMCV2(AUT_LOJA_CADASTRO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035"});					
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035"});					
		}
	}
	
	
	/**
	 * 
	 * Configura os parametros de inicialização para cadastros de clientes-VA
	 * 
	 */
	@Test
	public void AUT_CN00002_VA_CONFIG_CADASTRO_CLIENTES() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00002_VA_CONFIG_CADASTRO_CLIENTES"});					
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);  
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_HMC_LOGIN, "AUT_USER_ID", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_HMC_LOGIN, "AUT_NOVA_SENHA", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);
		
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00002_VA_CONFIG_CADASTRO_CLIENTES"});					
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00002_VA_CONFIG_CADASTRO_CLIENTES"});					
			
		}
		
	}
			
	@Test
	/**
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 */
	public void AUT_CN00003_VA_CADASTRO_CLIENTE_PJ_LOJA0035() {
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_VA_CADASTRO_CLIENTE_PJ_LOJA0035"});					
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);	
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_VA_CADASTRO_CLIENTE_PJ_LOJA0035"});					
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00003_VA_CADASTRO_CLIENTE_PJ_LOJA0035"});					

		}
	}
	
	
	@Test
	/**
	 * CN00002 - Realizar um cadastro de um cliente Pessoa Fisica
	 */
	public void AUT_CN00004_VA_CADASTRO_CLIENTE_PF_LOJA0035() {
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00004_VA_CADASTRO_CLIENTE_PF_LOJA0035"});					
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.CASA);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00004_VA_CADASTRO_CLIENTE_PF_LOJA0035"});					
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00004_VA_CADASTRO_CLIENTE_PF_LOJA0035"});					
		}
	}
	
	
	@Test
	/**
	 * CN00003 - Realizar um cadastro de um cliente Estrangeiro
	 */
	public void AUT_CN00005_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.ESTRANGEIRO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00005_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035"});
		}
	}

	
	@Test
	/**
	 * CN00004 -Realizar um cadastro de um cliente adicionando mais de um telefone
	 */
	public void AUT_CN00006_VA_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035() {
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035"});
			cadastrosVA.autCadastroClienteMultiplosTelefonesVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00006_VA_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035"});

		}
	}
	
	
	@Test
	/**
	 * CN00005 - Realizar um cadastro de um cliente com um CPF que já cadastrado
	 */
	public void AUT_CN00007_REQUISITO_VA_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO() {
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00007_REQUISITO_VA_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO"});
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CONDOMINIO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00007_REQUISITO_VA_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00007_REQUISITO_VA_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO"});

		}
	}

	
	
	@Test
	/**
	 * CN00006 - Realizar um cadastro de um cliente com um CNPJ que já cadastrado
	 */
	public void AUT_CN00008_VA_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO() {
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00008_VA_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO"});
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.JURIDICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CONDOMINIO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00008_VA_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00008_VA_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO"});

		}
	}	
	
	
	@Test
	/**
	 * CN00007 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 */
	public void AUT_CN00009_VA_CADASTRO_CLIENTE_NAO_SEI_CEP() {
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00009_VA_CADASTRO_CLIENTE_NAO_SEI_CEP"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.CASA);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00009_VA_CADASTRO_CLIENTE_NAO_SEI_CEP"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00009_VA_CADASTRO_CLIENTE_NAO_SEI_CEP"});

		}
	}
	
	
	@Test
	/**
	 * CN00008 - Realizar cadastro de cliente por um cpf invalido
	 */
	public void AUT_CN00010_VA_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO() {
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_VA_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO"});
			cadastrosVA.autCadastroClienteInvalido(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_TIPO_CLIENTE_INVALIDO.CPF);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_VA_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00010_VA_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO"});
		}
	}
	
	
	@Test
	/**
	 * CN00009 - Realizar cadastro de cliente por cep invalido
	 */
	public void AUT_CN00011_VA_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00011_VA_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			cadastrosVA.autCadastroClienteCEPInvalido(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00011_VA_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO"});

		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00011_VA_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO"});

		}
	}
	

	@Test
	/**
	 * CN00010 - Realizar cadastro com mais de um endereço
	 */
	public void AUT_CN00012_VA_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_VA_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			cadastrosVA.autCadastroClienteMultiplosEnderecosVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CASA, AUT_VA_TIPO_ENDERECO.COBRANCA, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_VA_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00012_VA_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS"});
		}
	}
	

	
	@Test
	public void AUT_CN00013_REQUISITO_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO(){
		try{
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00013_REQUISITO_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO"});
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", AUTProjectsFunctions.gerarCNPJ());
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00013_REQUISITO_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO"});

		}catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00013_REQUISITO_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO"});
		}
			
	}
	
	
	@Test
	/**
	 * CN00011 - Cadastrar um cliente PJ e classificá-lo como Exceção
	 */
	public void AUT_CN00014_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00014_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT);
			cadastrosVA.autCadastroClientePJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, false);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00014_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO"});
		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00014_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO"});

		}
	}
	
	
	@Test
	/**
	 * CN00012 - Classificar um cliente PJ já cadastrado como Exceção
	 */
	public void AUT_CN00015_VA_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00015_VA_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO"});
			cadastrosVA.autCadastroClientePJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, true);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00015_VA_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO"});

		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00015_VA_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO"});

		}
	}
	
	
	
	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_CN00016A_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016A_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", AUTProjectsFunctions.gerarCNPJ());
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016A_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});

		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016A_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});

		}
	}
	
	
	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_CN00016B_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016B_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});
			cadastrosVA.autCadastroClientePJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, false);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016B_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});

		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00016B_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});

		}
		
	}

	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_CN00017_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_EXECUTANDO.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00017_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT);
			cadastrosVA.autCadastroFilhoPJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO, AUT_VA_PROPRIEDADE_RESIDENCIA.FINANCIADA);
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_PASSED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00017_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});

		}
		catch(java.lang.Exception e) {
			gerTests.autTestExecProcessDataBase(String.format(AUT_SYNC_EXECUTION_STATE.UPDATE_TABLE_PROJECT_DETAIL_FAILED.toString(),gerTests.autGetStringValue(gerTests.AUT_LIST_PROJECTS_LOADER)), new Object[] {"AUT_CN00017_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO"});

		}
	}
	
}