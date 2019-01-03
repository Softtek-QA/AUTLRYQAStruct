package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00011;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00011 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00011.CTP00001 cn00011CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00011
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00011() {
	
		cn00011CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00011.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CTP00001 - Realizar um pedido com item que tenha registro no Top
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess11() {
		
		autInitConfigurationCN00011();
		cn00011CTP00001.autCriaPedidoItemTop();
	}

}
