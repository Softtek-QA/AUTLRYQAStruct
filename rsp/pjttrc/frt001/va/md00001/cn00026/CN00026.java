package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00026;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00026 extends AUTVABaseComponent {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00026.CTP00001 cn00026CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00026
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00026() {
	
		cn00026CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00026.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00026 - Pedido com desconto no total em reais com itens não elegiveis
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess26() {
		
		autInitConfigurationCN00026();
		cn00026CTP00001.autCriaPedidoDescontoTotalReaisProdutoNaoElegivel();
	}

}
