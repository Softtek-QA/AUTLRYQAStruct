package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074;

import org.junit.Test;

public class CN00074 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074.CTP00001 cn00074CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00074
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00074() {
	
		cn00074CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00074 - Pedido com frete adicional 
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess74() {
		
		autInitConfigurationCN00074();
		cn00074CTP00001.ctp74();
	}

}
