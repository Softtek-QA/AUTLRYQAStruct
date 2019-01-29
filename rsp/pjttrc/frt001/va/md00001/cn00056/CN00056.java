package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00056;

import org.junit.Test;

public class CN00056 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00056.CTP00001 cn00056CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00056
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00056() {
	
		cn00056CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00056.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00056 - Realizar pedido sem cliente cadastro e efetuar cadastro PF
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess56() {
		
		autInitConfigurationCN00056();
		cn00056CTP00001.autCriaPedidoComCadastroPF();
	}

}
