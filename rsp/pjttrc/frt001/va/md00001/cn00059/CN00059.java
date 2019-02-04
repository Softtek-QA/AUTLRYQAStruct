package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00059;

import org.junit.Test;

public class CN00059 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00059.CTP00001 cn00059CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00059
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00059() {
	
		cn00059CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00059.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00059 - Realizar o pedido em uma loja e retirar em outra
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess59() {
		
		autInitConfigurationCN00059();
		cn00059CTP00001.cn00059();
	}

}
