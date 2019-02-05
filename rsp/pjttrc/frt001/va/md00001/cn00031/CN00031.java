package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00031;

import org.junit.Test;

public class CN00031 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00031.CTP00001 cn00031CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00031
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00031() {
	
		cn00031CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00031.CTP00001();
	}
	

	/**
	 * 
	 * 
	 *  CN00031 - Pedido com desconto dentro do mundo do usuário e fora da seção
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess31() {
		
		autInitConfigurationCN00031();
		cn00031CTP00001.ctp31();
	}

}
