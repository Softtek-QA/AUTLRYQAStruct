package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00035;

import org.junit.Test;

public class CN00035 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00035.CTP00001 cn00035CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00035
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00035() {
	
		cn00035CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00035.CTP00001();
	}
	

	/**
	 * 
	 * 
	 *  CN00035 - Realizar um pedido com Aprovação de alçada
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess35() {
		
		autInitConfigurationCN00035();
		cn00035CTP00001.ctp35();
	}

}
