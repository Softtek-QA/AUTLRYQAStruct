package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00044;

import org.junit.Test;

public class CN00044 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00044.CTP00001 cn00044CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00044
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00044() {
	
		cn00044CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00044.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00044 - Realizar pedido com pgto Cartão de Crédito e Aprovação Antifraude
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess44() {
		
		autInitConfigurationCN00044();
		cn00044CTP00001.ctp44();
	}

}
