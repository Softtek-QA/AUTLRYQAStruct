package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_CONTATO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_ENDERECO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_RESIDENCIA;

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
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	String hostExec = "192.168.0.116";
	
	/**
	 * 
	 * Configura os parametros de inicialização para realização de cadastros no HMC
	 * 
	 */
	@Test
	public void AUT_CN00000_CONFIG() {
		
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
	}
	
	
	/**
	 * Executa os procedimentos de cadastro de usuário no HMC
	 * 
	 */
	//@Test
	public void AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035() {
		AUT_LOJA_CADASTRO = "0035";
		cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);
	}
	
	
	//@Test
	/**
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 */
	public void AUT_CN00001_VA_CADASTRO_CLIENTE_PJ_LOJA0035() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
	}
	
	//@Test
	/**
	 * CN00002 - Realizar um cadastro de um cliente Pessoa Fisica
	 */
	public void AUT_CN00002_VA_CADASTRO_CLIENTE_PF_LOJA0035() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.ENTREGA, AUT_VA_TIPO_RESIDENCIA.CASA);
	}
	
	//@Test
	/**
	 * CN00003 - Realizar um cadastro de um cliente Estrangeiro
	 */
	public void AUT_CN00003_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.ESTRANGEIRO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
	}

	
	@Test
	/**
	 * CN00004 -Realizar um cadastro de um cliente adicionando mais de um telefone
	 */
	public void AUT_CN00004_VA_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035() {
		cadastrosVA.autCadastroClienteMultiplosTelefonesVA(AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
	}
	
	
	//@Test
	/**
	 * CN00005 - Realizar um cadastro de um cliente com um CPF que já cadastrado
	 */
	public void AUT_CN00005_VA_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CONDOMINIO);
				//Feh fazendo				###################################################
	}
	
	
	//@Test
	/**
	 * CN00006 - Realizar um cadastro de um cliente com um CNPJ que já cadastrado
	 */
	public void AUT_CN00006_VA_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO() {
				//Feh fazendo				###################################################			
	}
	
	
	//@Test
	/**
	 * CN00007 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 */
	public void AUT_CN00007_VA_CADASTRO_CLIENTE_NAO_SEI_CEP() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.COBRANCA, AUT_VA_TIPO_RESIDENCIA.BOX_OU_STAND);
	}
	
	
	//@Test
	/**
	 * CN00008 - Realizar cadastro de cliente por um cpf invalido
	 */
	public void AUT_CN00008_VA_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO() {
				//Fazendo				###################################################			
	}
	
	
	//@Test
	/**
	 * CN00009 - Realizar cadastro de cliente por cep invalido
	 */
	public void AUT_CN00009_VA_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO() {
				//Fazendo				###################################################			
	}
	

	@Test
	/**
	 * CN00010 - Realizar cadastro com mais de um endereço
	 */
	public void AUT_CN00010_VA_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS() {
		cadastrosVA.autCadastroClienteMultiplosEnderecosVA(AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.RESIDENCIAL, AUT_VA_TIPO_RESIDENCIA.CASA, AUT_VA_TIPO_ENDERECO.COBRANCA, AUT_VA_TIPO_RESIDENCIA.APARTAMENTO);
	}
	
	
	//@Test
	/**
	 * CN00011 - Cadastrar um cliente PJ e classificá-lo como Exceção
	 */
	public void AUT_CN00011_VA_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO() {
				//Fazendo				###################################################			
	}
	
	
	//@Test
	/**
	 * CN00012 - Classificar um cliente PJ já cadastrado como Exceção
	 */
	public void AUT_CN00012_VA_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO() {
				//Fazendo				###################################################			
	}
	
	
	//@Test
	/**
	 *  CN00013 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	public void AUT_CN00013_VA_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
				//Fazendo				###################################################			
	}
	
	
}
