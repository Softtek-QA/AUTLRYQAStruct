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
	 * 
	 * Executa os procedimentos de cadastro
	 * 
	 */
	@Test
	public void AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035() {
		AUT_LOJA_CADASTRO = "0035";
		cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);
	}
	
	
	/*
	public enum AUT_VA_TIPO_ENDERECO{
		RESIDENCIAL,
		COMERCIAL,
		ENTREGA,
		COBRANCA,
		OBRA;}
		
		public enum AUT_VA_TIPO_RESIDENCIA{
			CASA,
			APARTAMENTO,
			CONDOMINIO,
			LOJA_OU_SOBRELOJA,
			SALA_OU_CONJUNTO_COMERCIAL,
			RURAL_CHACARA_FAZENDA_OU_SITIO,
			DEPOSITO_OU_GALPAO,
			TERRENO_OU_LOTEAMENTO,
			BOX_OU_STAND,
			OUTROS;}
			
			public enum AUT_VA_TIPO_CONTATO{
				TELEFONE_FIXO,
				CELULAR;}
				
				public static enum AUT_VA_CADASTROS{
					FISICA,
					JURIDICA,
					ESTRANGEIRO;}
				*/
	
	
	@Test
	/**
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 */
	public void AUT_CN00001_VA_CADASTRO_CLIENTE_PF_LOJA0035() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.FISICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
		
	}
	
	@Test
	public void AUT_CN00001_VA_CADASTRO_CLIENTE_PJ_LOJA0035() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.JURIDICA, AUT_VA_TIPO_CONTATO.CELULAR, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
		
	}
	
	@Test
	public void AUT_CN00001_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		cadastrosVA.autCadastroClienteVA(AUT_VA_CADASTROS.ESTRANGEIRO, AUT_VA_TIPO_CONTATO.TELEFONE_FIXO, AUT_VA_TIPO_ENDERECO.COMERCIAL, AUT_VA_TIPO_RESIDENCIA.DEPOSITO_OU_GALPAO);
		
	}

	
	
	
	
	
	
	
}
