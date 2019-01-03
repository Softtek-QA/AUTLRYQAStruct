package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00020;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00020 extends AUTVABaseComponent {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00020.CTP00001 cn00020CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00020
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00020() {
	
		cn00020CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00020.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00020 - Pedido com desconto na seção em reais
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess20() {
		
		autInitConfigurationCN00020();
		cn00020CTP00001.autCriaPedidoDescontoSecaoReais();
	}

}
