package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00005 extends AUTVABaseComponent{
	
	public static String numeroCarrinho;
	public static String AUT_NUMERO_CARRINHO;
	public static String AUT_NUMERO_PEDIDO;
	
	
	/**
	 * 
	 * CN00005 -  Realizar um pedido através da recuperação do carrinho
	 * Agrupamento de todos os casos de testes do CN00005
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess05() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005.CTR00001	cn00005CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005.CTR00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005.CTP00001 cn00005CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005.CTP00001();
		
	
		cn00005CTR00001.autCriaCarrinho();
		
		cn00005CTR00001.AUT_NUMERO_CARRINHO=cn00005CTR00001.AUT_NUMERO_CARRINHO;	

		//cn00005CTR00001.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTR00001,"AUT_NUMERO_CARRINHO");
		
		cn00005CTP00001.autRecuperarCarrinho();
		
	}
}