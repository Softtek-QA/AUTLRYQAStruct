/**
 * 
 */
package br.lry.qa.rsp.pjttrc.entregas;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;


/**
 * 
 *Regressivo de testes integrados - Vendas Assistidas - Televendas
 * 
 * @author Softtek-QA
 *
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega002_RGR001{	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00001.CN00001 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00002.CN00002 cn00002;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00003.CN00003 cn00003;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00004.CN00004 cn00004;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00005.CN00005 cn00005;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00006.CN00006 cn00006;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00007.CN00007 cn00007;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00008.CN00008 cn00008;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00009.CN00009 cn00009;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00010.CN00010 cn00010;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00011.CN00011 cn00011;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00012.CN00012 cn00012;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00013.CN00013 cn00013;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00014.CN00014 cn00014;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00015.CN00015 cn00015;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016A.CN00016A cn00016A;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016B.CN00016B cn00016B;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00017.CN00017 cn00017;
	

	String hostExec = "192.168.0.116";
	
	
	public void AUT_INIT() {
		 AUT_CFG_ID00009_FRT009_CN00000();
	}
	
	/**
	 * 
	 * 
	 * Mapeamento das configurações para execução dos cenários do módulo de Cadastro (Entrega 02)
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void AUT_CFG_ID00009_FRT009_CN00000() {	
		//Não Utilizados Mais
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00002.CN00002();

		//Cadastros VA	
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00003.CN00003();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00004.CN00004();
//		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00005.CN00005();
//		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00006.CN00006();
//		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00007.CN00007();
//		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00008.CN00008();
//		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00009.CN00009();
//		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00010.CN00010();
//		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00011.CN00011();
//		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00012.CN00012();
//		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00013.CN00013();
//		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00014.CN00014();
//		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00015.CN00015();
//		cn00016A = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016A.CN00016A();
//		cn00016B = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016B.CN00016B();
//		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00017.CN00017();		
	}

	
	
	//@Test
	/**
	 * 01
	 * 
	 * CN00001 - Executa os procedimentos de cadastro de usuário no HMC
	 */
	public void AUT_IT00001_STHMC_ID00004_FRT004_CN00001_CADASTRO_USUARIO_LOJA0035() {
			
	}
	
	//@Test
	/**
	 * 02
	 * 
	 * CN00002 - Configura os parametros de inicialização para cadastros de clientes-VA
	 */
	public void AUT_IT00002_STCFG_ID00004_FRT004_CN00002_VA_CADASTRO_CLIENTES() {
			
	}
	
	
	@Test
	/**
	 * 03
	 * 
	 * CN00003 - Realizar um cadastro de um cliente Pessoa Juridica
	 */
	public void AUT_IT00003_STVA_ID00004_FRT004_CN00003_CADASTRO_CLIENTE_PJ_LOJA0035() {
		
		//Ajustar para  chamar o cn00003 e ficar com o nome coerente
		cn00001.autStartProcess01();
	}

	
	@Test
	/**
	 * 
	 * 
	 * CN00004 - Realizar um cadastro de um cliente Pessoa Fisica
	 */
	
	public void AUT_IT00004_STVA_ID00004_FRT004_CN00004_CADASTRO_CLIENTE_PF_LOJA0035() {
		//Ajustar para  chamar o cn00004 e ficar com o nome coerente
		cn00003.autStartProcess03();
		
	}
	
	
	@Test
	/**
	 * 
	 * CN00003 - Realizar um cadastro de um cliente Estrangeiro
	 */
	
	public void AUT_IT00005_STVA_ID00004_FRT004_CN00005_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
		//cn00005.autStartProcess05();
		
	}
	
	
	@Test
	/**
	 * 
	 * CN00004 - Realizar um cadastro de um cliente adicionando mais de um telefone
	 */
	
	public void AUT_IT00006_STVA_ID00004_FRT004_CN00006_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035() {
	
		
	}
	
	@Test
	/**
	 * 
	 * CN00005 - Realizar um cadastro de um cliente com um CPF que já cadastrado
	 */
	
	public void AUT_IT00007_STVA_ID00004_FRT004_CN00007_REQUISITO_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO() {
	
		
	}
	
	@Test
	/**
	 * 
	 * CN00006 - Realizar um cadastro de um cliente com um CNPJ que já cadastrado
	 */
	
	public void AUT_IT00008_STVA_ID00004_FRT004_CN00008_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO() {
	
		
	}

	
	@Test
	/**
	 * 
	 * CN00007 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 */
	
	public void AUT_IT00009_STVA_ID00004_FRT004_CN00009_CADASTRO_CLIENTE_NAO_SEI_CEP() {
	
		
	}


	@Test
	/**
	 * 
	 * CN00008 - Realizar cadastro de cliente por um cpf invalido
	 */
	
	public void AUT_IT00010_STVA_ID00004_FRT004_CN00010_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO() {
	
		
	}
	
	
	@Test
	/**
	 * 
	 * CN00009 - Realizar cadastro de cliente por cep invalido
	 */
	
	public void AUT_IT00011_STVA_ID00004_FRT004_CN00011_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO() {
	
		
	}
	
	
	@Test
	/**
	 * 
	 * CN00010 - Realizar cadastro com mais de um endereço
	 */
	
	public void AUT_IT00012_STVA_ID00004_FRT004_CN00012_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS() {
	
		
	}
	
	

	@Test
	/**
	 * 
	 * CN00011 - Realizar cadastro cliente pj e classificar como excecao
	 */
	
	public void AUT_IT00013_STVA_ID00004_FRT004_CN00013_REQUISITO_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO(){
	
		
	}
	


	@Test
	/**
	 * 
	 * CN00012 - Cadastrar um cliente PJ e classificá-lo como Exceção
	 */
	
	public void AUT_IT00014_STVA_ID00004_FRT004_CN00014_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO() {
	
		
	}
	

	@Test
	/**
	 * 
	 * CN00013 - Classificar um cliente PJ já cadastrado como Exceção
	 */
	
	public void AUT_IT00015_STVA_ID00004_FRT004_CN00015_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO() {
	
		
	}
	
	
	@Test
	/**
	 * 
	 * CN00014 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	
	public void AUT_IT00016_STVA_ID00004_FRT004_CN00016A_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
	
		
	}

	@Test
	/**
	 * 
	 * CN00015 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	
	public void AUT_IT00017_STVA_ID00004_FRT004_CN00016B_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
	
		
	}

	
	@Test
	/**
	 * 
	 * CN00016 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	
	public void AUT_IT00018_STVA_ID00004_FRT004_CN00017_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
	
		
	}


	
	


	
	
	
}
	