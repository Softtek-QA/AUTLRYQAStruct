package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00019;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00019 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00019.CTP00001 cn00019CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00019
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00019() {
	
		cn00019CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00019.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00019 - Pedido com desconto na seção em porcentagem
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess19() {
		
		autInitConfigurationCN00019();
		cn00019CTP00001.autCriaPedidoDescontoSecaoPorcentagem();
	}

}
