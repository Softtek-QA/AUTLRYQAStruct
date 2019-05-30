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


	String hostExec = "192.168.0.116";
	
	
	public void AUT_INIT() {
		 AUT_CFG_ID00009_FRT009_CN00000();
	}
	
	/**
	 * 
	 * 
	 * Mapeamento das configurações para execução dos cenários do módulo de Televendas
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void AUT_CFG_ID00009_FRT009_CN00000() {	
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00002.CN00002();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00003.CN00003();
	}

	
	@Test
	/**
	 * 01
	 * 
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 */
	public void AUT_IT00003_STVA_ID00004_FRT004_CN00003_CADASTRO_CLIENTE_PJ_LOJA0035() {
			
		cn00001.autStartProcess01();
	}
	
	//@Test
	/**
	 * 01
	 * 
	 * CN00001 - Realizar a troca de loja utilizando usuario televenda
	 */
	public void AUT_IT00001_STVA_ID00009_FRT009_CN00001_TROCA_LOJA_LOJA0045() {
			
		cn00002.autStartProcess02();
	}
	
	//@Test
	/**
	 * 
	 * 
	 * CN00002 - Realizar um cadastro de um cliente Pessoa Fisica
	 */
	
	public void AUT_IT00004_STVA_ID00004_FRT004_CN00004_CADASTRO_CLIENTE_PF_LOJA0035() {
		cn00003.autStartProcess03();
		
	}
	
	
	//@Test
	/**
	 * 
	 * CN00003 - Realizar um cadastro de um cliente Estrangeiro
	 */
	
	public void AUT_IT00005_STVA_ID00004_FRT004_CN00005_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
	
		
	}
	
	
	//@Test
	/**
	 * 
	 * CN00004 - Realizar um cadastro de um cliente adicionando mais de um telefone
	 */
	
	public void AUT_IT00006_STVA_ID00004_FRT004_CN00006_CADASTRO_CLIENTE_VARIOS_TELEFONES_LOJA00035() {
	
		
	}
	
	//@Test
	/**
	 * 
	 * CN00005 - Realizar um cadastro de um cliente com um CPF que já cadastrado
	 */
	
	public void AUT_IT00007_STVA_ID00004_FRT004_CN00007_REQUISITO_CADASTRO_CLIENTE_PF_PREVIAMENTE_CADASTRADO() {
	
		
	}
	
	//@Test
	/**
	 * 
	 * CN00006 - Realizar um cadastro de um cliente com um CNPJ que já cadastrado
	 */
	
	public void AUT_IT00008_STVA_ID00004_FRT004_CN00008_CADASTRO_CLIENTE_PJ_PREVIAMENTE_CADASTRADO() {
	
		
	}

	
	//@Test
	/**
	 * 
	 * CN00007 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 */
	
	public void AUT_IT00009_STVA_ID00004_FRT004_CN00009_CADASTRO_CLIENTE_NAO_SEI_CEP() {
	
		
	}


	//@Test
	/**
	 * 
	 * CN00008 - Realizar cadastro de cliente por um cpf invalido
	 */
	
	public void AUT_IT00010_STVA_ID00004_FRT004_CN00010_CADASTRO_CLIENTE_PF_COM_CPF_INVALIDO() {
	
		
	}
	
	
	//@Test
	/**
	 * 
	 * CN00009 - Realizar cadastro de cliente por cep invalido
	 */
	
	public void AUT_IT00011_STVA_ID00004_FRT004_CN00011_CADASTRO_CLIENTE_PF_COM_CEP_INVALIDO() {
	
		
	}
	
	
	//@Test
	/**
	 * 
	 * CN00010 - Realizar cadastro com mais de um endereço
	 */
	
	public void AUT_IT00012_STVA_ID00004_FRT004_CN00012_CADASTRO_CLIENTE_PF_COM_VARIOS_ENDERECOS() {
	
		
	}
	
	

	//@Test
	/**
	 * 
	 * CN00011 - Realizar cadastro cliente pj e classificar como excecao
	 */
	
	public void AUT_IT00013_STVA_ID00004_FRT004_CN00013_REQUISITO_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO(){
	
		
	}
	


	//@Test
	/**
	 * 
	 * CN00012 - Cadastrar um cliente PJ e classificá-lo como Exceção
	 */
	
	public void AUT_IT00014_STVA_ID00004_FRT004_CN00014_CADASTRO_CLIENTE_PJ_E_CLASSIFICAR_COMO_EXCECAO() {
	
		
	}
	

	//@Test
	/**
	 * 
	 * CN00013 - Classificar um cliente PJ já cadastrado como Exceção
	 */
	
	public void AUT_IT00015_STVA_ID00004_FRT004_CN00015_CLASSIFICAR_CLIENTE_PJ_COMO_EXCECAO() {
	
		
	}
	
	
	//@Test
	/**
	 * 
	 * CN00014 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	
	public void AUT_IT00016_STVA_ID00004_FRT004_CN00016A_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
	
		
	}

	//@Test
	/**
	 * 
	 * CN00015 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	
	public void AUT_IT00017_STVA_ID00004_FRT004_CN00016B_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
	
		
	}

	
	//@Test
	/**
	 * 
	 * CN00016 - Realizar um cadastro "filho" para um PJ Exceção
	 */
	
	public void AUT_IT00018_STVA_ID00004_FRT004_CN00017_REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO() {
	
		
	}


	
	


	
	
	
}
	