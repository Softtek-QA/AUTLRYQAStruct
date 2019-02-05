package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00052;

import org.junit.Test;

public class CN00052 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00052.CTP00001 cn00052CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00052
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00052() {
	
		cn00052CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00052.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00052 - Realizar pedido sem cliente cadastro e efetuar cadastro PF
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess52() {
		
		autInitConfigurationCN00052();
		cn00052CTP00001.ctp52();
	}

}
