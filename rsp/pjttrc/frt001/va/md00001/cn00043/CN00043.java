package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00043;

import org.junit.Test;

public class CN00043 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00043.CTP00001 cn00043CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00043
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00043() {
	
		cn00043CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00043.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00043 - Realizar um pedido com pagamento Cartão de Crédito
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess43() {
		
		autInitConfigurationCN00043();
		cn00043CTP00001.ctp43();
	}

}
