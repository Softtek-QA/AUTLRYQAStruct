package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00038;

import org.junit.Test;

public class CN00038 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00038.CTP00001 cn00038CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00038
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00038() {
	
		cn00038CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00038.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00038 - Realizar pedido de item com lote e centro de distrib. Diferente
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess38() {
		
		autInitConfigurationCN00038();
		cn00038CTP00001.ctp38();
	}

}
