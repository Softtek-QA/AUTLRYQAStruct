package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00047;

import org.junit.Test;

public class CN00047 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00047.CTP00001 cn00047CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00047
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00047() {
	
		cn00047CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00047.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00047 - Realizar um pedido com pagamento Cartão de Crédito Mastercard
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess47() {
		
		autInitConfigurationCN00047();
		cn00047CTP00001.ctp47();
	}

}
