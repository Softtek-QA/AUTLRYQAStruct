package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00024;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00024 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00024.CTP00001 cn00024CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00024
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00024() {
	
		cn00024CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00024.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00024 - Pedido com desconto no total em reais
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess24() {
		
		autInitConfigurationCN00024();
		cn00024CTP00001.autCriaPedidoDescontoTotalReais();
	}

}
