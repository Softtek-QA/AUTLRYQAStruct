package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00036;

import org.junit.Test;

public class CN00036 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00036.CTP00001 cn00036CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00036
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00036() {
	
		cn00036CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00036.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00036 - Pedido com aprovação de alçada de multiplas lojas
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess36() {
		
		autInitConfigurationCN00036();
		cn00036CTP00001.ctp36();
	}

}
