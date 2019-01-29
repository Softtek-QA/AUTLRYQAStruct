package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00057;

import org.junit.Test;

public class CN00057 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00057.CTP00001 cn00057CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00057
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00057() {
	
		cn00057CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00057.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00057 - Realizar pedido sem cliente cadastro e efetuar cadastro PF
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess57() {
		
		autInitConfigurationCN00057();
		cn00057CTP00001.autCriaPedidoComCadastroPJ();
	}

}
