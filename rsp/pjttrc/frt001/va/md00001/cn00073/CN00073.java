package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00073;

import org.junit.Test;

public class CN00073 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00073.CTP00001 cn00073CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00073
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00073() {
	
		cn00073CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00073.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00073 - Pedido de um item plataforma para uma loja plataforma
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess73() {
		
		autInitConfigurationCN00073();
		cn00073CTP00001.autCriaPedidoItemPlataformaParaLojaPlataforma();
	}

}
