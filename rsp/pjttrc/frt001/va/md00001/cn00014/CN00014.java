package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00014;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00014  extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00014.CTP00001 cn00014CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00014
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00014() {
	
		cn00014CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00014.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00014 - Pedido que não tenha estoque e item avs na filial de compra
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess14() {
		
		autInitConfigurationCN00014();
		cn00014CTP00001.autCriaPedidoItemAvulsoFilialCompra();
	}

}
