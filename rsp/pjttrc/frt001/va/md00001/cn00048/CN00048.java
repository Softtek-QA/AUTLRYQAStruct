package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00048;

import org.junit.Test;

public class CN00048 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00048.CTP00001 cn00048CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00048
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00048() {
	
		cn00048CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00048.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00048 - Realizar um pedido com pagamento Cheque
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess48() {
		
		autInitConfigurationCN00048();
		cn00048CTP00001.ctp48();
	}

}
