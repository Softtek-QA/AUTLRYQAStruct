package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071;

import org.junit.Test;

public class CN00071 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071.CTP00001 cn00071CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00071
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00071() {
	
		cn00071CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00071 - Pedido que usa mais de uma modalidade de frete
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess71() {
		
		autInitConfigurationCN00071();
		cn00071CTP00001.ctp71();
	}

}
