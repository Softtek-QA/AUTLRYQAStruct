package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00058;

import org.junit.Test;

public class CN00058 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00058.CTP00001 cn00058CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00058
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00058() {
	
		cn00058CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00058.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00058 - Realizar pedido sem cliente cadast e efet. o cadast Cliente Estr.	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess58() {
		
		autInitConfigurationCN00058();
		cn00058CTP00001.autCriaPedidoComCadastroEstrangeiro();
	}

}
