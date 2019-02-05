package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00072;

import org.junit.Test;

public class CN00072 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00072.CTP00001 cn00072CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00072
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00072() {
	
		cn00072CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00072.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00072 - Pedido de um item plataforma para uma loja não plataforma
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess72() {
		
		autInitConfigurationCN00072();
		cn00072CTP00001.autCriaPedidoItemPlataforma();
	}

}
