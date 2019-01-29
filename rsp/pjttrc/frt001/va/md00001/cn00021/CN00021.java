package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00021;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00021  extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00021.CTP00001 cn00021CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00021
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00021() {
	
		cn00021CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00021.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00021 - Pedido com desconto na seção em porcentagem itens não elegiveis
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess21() {
		
		autInitConfigurationCN00021();
		cn00021CTP00001.autCriaPedidoDescontoSecaoPorcentagemItemNaoElegivel();
	}

}
