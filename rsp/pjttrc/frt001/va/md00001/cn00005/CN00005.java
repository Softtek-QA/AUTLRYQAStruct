package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00005 extends AUTVABaseComponent{
	
	public static String numeroCarrinho;
	
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
		cn00005CTR00001.AUT_NUMERO_PEDIDO = cn00005CTP00001.AUT_NUMERO_PEDIDO;	
		cn00005CTP00001.autRecuperarCarrinho();
	}
}