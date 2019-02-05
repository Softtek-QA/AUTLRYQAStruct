package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00032;

import org.junit.Test;

public class CN00032 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00032.CTP00001 cn00032CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00032
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00032() {
	
		cn00032CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00032.CTP00001();
	}
	

	/**
	 * 
	 * 
	 *  CN00032 - Pedido com desconto dentro do mundo do usuário e fora da seção
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess32() {
		
		autInitConfigurationCN00032();
		cn00032CTP00001.ct00032();
	}

}
