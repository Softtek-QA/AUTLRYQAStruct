package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060;

import org.junit.Test;

public class CN00060 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060.CTP00001 cn00060CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00060
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00060() {
	
		cn00060CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00060 - Realizar pedido sem cliente cadastro e efetuar cadastro PF
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess60() {
		
		autInitConfigurationCN00060();
		cn00060CTP00001.autCriaPedidoEmLojaSemProduto();
	}

}
