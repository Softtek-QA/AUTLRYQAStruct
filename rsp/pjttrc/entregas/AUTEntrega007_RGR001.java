package br.lry.qa.rsp.pjttrc.entregas;

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
public class AUTEntrega007_RGR001 {
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVACadastros cadastrosVA;
	public static String USUARIO_GLOBAL = "00000000", SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";
	private String numCPF;
	
	@Test
	public void AUT_00004_FRT004() {
		
	}
	
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização de cadastro de usuário no HMC
	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00004_FRT004_CN00000_CONFIG() {
		
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
			
		cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT = cadastrosHMC.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER").toString();
		cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT = cadastrosHMC.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD").toString();
		gerTests = new AUTFWKTestObjectBase();
				
		gerTests.autInitConfigurationProjectExecution(AUTEntrega007_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	
	
	/**
	 * Executa os procedimentos de cadastro de usuário no HMC
	 */
	@Test
	public void AUT_IT00001_STHMC_ID00004_FRT004_CN00001_CADASTRO_USUARIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			AUT_LOJA_CADASTRO = "0035";
			cadastrosHMC.autCadastrarUsuarioHMCV2(AUT_LOJA_CADASTRO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	/**
	 * 
	 * Configura os parametros de inicialização para cadastros de clientes-VA
	 * 
	 */
	@Test
	public void AUT_IT00002_STCFG_ID00004_FRT004_CN00002_VA_CADASTRO_CLIENTES() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);  
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_HMC_LOGIN, "AUT_USER_ID", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_HMC_LOGIN, "AUT_NOVA_SENHA", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);
		
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);			
		}
		
	}
			
	@Test
	/**
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 */
	public void AUT_IT00003_STVA_ID00004_FRT004_CN00003_CADASTRO_CLIENTE_PJ_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);	
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);		
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * CN00002 - Realizar um cadastro de um cliente Pessoa Fisica
	 */
	public void AUT_IT00004_STVA_ID00004_FRT004_CN00004_CADASTRO_CLIENTE_PF_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.CASA);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		}
	}
	
	
	@Test
	/**
	 * CN00003 - Realizar um cadastro de um cliente Estrangeiro
	 */
	public void AUT_IT00005_STVA_ID00004_FRT004_CN00005_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.ESTRANGEIRO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
			}
	}

	
	@Test
	/**
	 * CN00004 -Realizar um cadastro de um cliente adicionando mais de um telefone
	 */
	public void AUT_IT00006_STVA_ID00004_FRT004_CN00006_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClienteMultiplosTelefonesVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * CN00005 - Realizar um cadastro de um cliente com um CPF que já cadastrado
	 */
	public void AUT_IT00007_STVA_ID00004_FRT004_CN00007_REQUISITO_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);			
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CONDOMINIO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}

	
	
	@Test
	/**
	 * CN00006 - Realizar um cadastro de um cliente com um CNPJ que já cadastrado
	 */
	public void AUT_IT00008_STVA_ID00004_FRT004_CN00008_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.JURIDICA_ATUALIZACAO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CONDOMINIO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}	
	
	
	@Test
	/**
	 * CN00007 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 */
	public void AUT_IT00009_STVA_ID00004_FRT004_CN00009_CADASTRO_CLIENTE_NAO_SEI_CEP() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.CASA);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * CN00008 - Realizar cadastro de cliente por um cpf invalido
	 */
	public void AUT_IT00010_STVA_ID00004_FRT004_CN00010_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClienteInvalido(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT,AUT_VA_TIPO_CLIENTE_INVALIDO.CPF);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * CN00009 - Realizar cadastro de cliente por cep invalido
	 */
	public void AUT_IT00011_STVA_ID00004_FRT004_CN00011_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			cadastrosVA.autCadastroClienteCEPInvalido(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	@Test
	/**
	 * CN00010 - Realizar cadastro com mais de um endereço
	 */
	public void AUT_IT00012_STVA_ID00004_FRT004_CN00012_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF", AUTProjectsFunctions.gerarCPF());
			cadastrosVA.autCadastroClienteMultiplosEnderecosVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CASA, AUT_VA_TIPO_ENDERECO.COBRANCA, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	

	
	@Test
	public void AUT_IT00013_STVA_ID00004_FRT004_CN00013_REQUISITO_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO(){
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", AUTProjectsFunctions.gerarCNPJ());
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}		
	}
	
	
	@Test
	/**
	 * CN00011 - Cadastrar um cliente PJ e classificá-lo como Exceção
	 */
	public void AUT_IT00014_STVA_ID00004_FRT004_CN00014_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT);
			cadastrosVA.autCadastroClientePJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, false);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		
		}
	}
	
	
	@Test
	/**
	 * CN00012 - Classificar um cliente PJ já cadastrado como Exceção
	 */
	public void AUT_IT00015_STVA_ID00004_FRT004_CN00015_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			cadastrosVA.autCadastroClientePJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, true);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			

		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00016_STVA_ID00004_FRT004_CN00016A_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", AUTProjectsFunctions.gerarCNPJ());
			cadastrosVA.autCadastroClienteVA(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
			

		}
	}
	
	
	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00017_STVA_ID00004_FRT004_CN00016B_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autCadastroClientePJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, false);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
		
	}

	@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_IT00018_STVA_ID00004_FRT004_CN00017_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ", cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT);
			cadastrosVA.autCadastroFilhoPJExcecao(cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO, AUT_VA_PROPRIEDADE_RESIDENCIA.FINANCIADA);
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		
		}
	}
	
}
