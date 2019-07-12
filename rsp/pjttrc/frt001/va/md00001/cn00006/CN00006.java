package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00006 extends AUTVABaseComponent{
	
	public static String numeroCarrinho;
	public static String AUT_NUMERO_CARRINHO;
	public static String AUT_NUMERO_PEDIDO;
	
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
		cn00006CTR00001.autCriaPedido();
		
		cn00006CTR00001.AUT_NUMERO_CARRINHO=cn00006CTR00001.AUT_NUMERO_CARRINHO;	

		//cn00006CTP00001.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTR00001,"AUT_NUMERO_PEDIDO");
		
		cn00006CTP00001.autRecuperarCarrinho();
	}

}