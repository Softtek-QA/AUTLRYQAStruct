package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00025;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00025 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00025.CTP00001 cn00025CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00025
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00025() {
	
		cn00025CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00025.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00025 - Pedido com desconto no total em porcentagem itens não elegiveis
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess25() {
		
		autInitConfigurationCN00025();
		cn00025CTP00001.autCriaPedidoDescontoTotalPorcentagemProdutoNaoElegivel();
	}

}
