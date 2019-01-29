package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00040;

import org.junit.Test;

public class CN00040 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00040.CTP00001 cn00040CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00040
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00040() {
	
		cn00040CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00040.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00040 - Realizar um pedido com itens que tenha lote sem estoque
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess40() {
		
		autInitConfigurationCN00040();
		cn00040CTP00001.ctp40();
	}

}
