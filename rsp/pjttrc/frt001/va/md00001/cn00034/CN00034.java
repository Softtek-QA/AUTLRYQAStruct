package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00034;

import org.junit.Test;

public class CN00034 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00034.CTP00001 cn00034CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00034
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00034() {
	
		cn00034CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00034.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00034 - Pedido com desconto no frete
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess34() {
		
		autInitConfigurationCN00034();
		cn00034CTP00001.ct00034();
	}

}
