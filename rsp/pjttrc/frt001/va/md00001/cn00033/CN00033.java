package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00033;

import org.junit.Test;

public class CN00033 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00033.CTP00001 cn00033CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00033
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00033() {
	
		cn00033CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00033.CTP00001();
	}
	

	/**
	 * 
	 * 
	 *  CN00033 - Pedido com desconto dentro da seção
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess33() {
		
		autInitConfigurationCN00033();
		cn00033CTP00001.ct00033();
	}

}
