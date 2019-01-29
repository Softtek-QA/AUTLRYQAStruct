package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00051;

import org.junit.Test;

public class CN00051 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00051.CTP00001 cn00051CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00051
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00051() {
	
		cn00051CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00051.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00051 - Realizar um pedido com encomenda
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess51() {
		
		autInitConfigurationCN00051();
		cn00051CTP00001.autCriaPedidoComEncomenda();
	}

}
