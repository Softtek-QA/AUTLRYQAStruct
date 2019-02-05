package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00046;

import org.junit.Test;

public class CN00046 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00046.CTP00001 cn00046CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00046
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00046() {
	
		cn00046CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00046.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00046 - Realizar um pedido com pagamento Cartão de Crédito Visa
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess46() {
		
		autInitConfigurationCN00046();
		cn00046CTP00001.ctp46();
	}

}
