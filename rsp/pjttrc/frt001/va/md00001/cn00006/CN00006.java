package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00006 extends AUTVABaseComponent{
	
	public static String numeroCarrinho;
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006.CTR00001 cn00006CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006.CTP00001 cn00006CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00006
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00006() {
	
		cn00006CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006.CTR00001();
		cn00006CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006.CTP00001();
	}
	
	
	public static String getNumeroCarrinho() {
		return numeroCarrinho;
	}


	public void setNumeroCarrinho(String numeroCarrinho) {
		this.numeroCarrinho = numeroCarrinho;
	}


	/**
	 * 
	 * CN00006 -  Realizar um pedido através da recuperação do carrinho
	 * Agrupamento de todos os casos de testes do CN00006
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess06() {
		
		autInitConfigurationCN00006();
		cn00006CTR00001.autCriaCarrinho();
		System.out.println("Numero de carrinho no cenario"+ cn00006CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTP00001,"AUT_NUMERO_CARRINHO"));
		numeroCarrinho = cn00006CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTP00001,"AUT_NUMERO_CARRINHO").toString();
		System.out.println("Numero do carrinho no CTR"+numeroCarrinho);
		cn00006CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTP00001,"AUT_NUMERO_PEDIDO",numeroCarrinho);
		cn00006CTP00001.autRecuperarCarrinho();
	}

}