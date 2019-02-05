package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00041;

import org.junit.Test;

public class CN00041 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00041.CTP00001 cn00041CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00041
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00041() {
	
		cn00041CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00041.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00041 - Realizar um pedido com saída de Fluxo Entrega expressa
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess41() {
		
		autInitConfigurationCN00041();
		cn00041CTP00001.ctp41();
	}

}
