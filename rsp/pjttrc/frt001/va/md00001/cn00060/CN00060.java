package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060;

import org.junit.Test;

public class CN00060 {
	
	

	/**
	 * 
	 * 
	 * CN00060 - Realizar pedido sem cliente cadastro e efetuar cadastro PF
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess60() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060.CTP00001 cn60 = new  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060.CTP00001();
		//autInitConfigurationCN00060();
		cn60.autCriaPedidoEmLojaSemProduto();
	}

}
