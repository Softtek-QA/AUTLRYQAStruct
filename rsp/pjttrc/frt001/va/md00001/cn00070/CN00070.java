package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070;

import org.junit.Test;

public class CN00070 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070.CTP00001 cn00070CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00070
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00070() {
	
		cn00070CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00070 - Pedido que usa mais de uma filial de saída
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess70() {
		
		autInitConfigurationCN00070();
		cn00070CTP00001.ctp70();
	}

}
