package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00022;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00022  extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00022.CTP00001 cn00022CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00022
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00022() {
	
		cn00022CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00022.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00022 - Pedido com desconto na seção em reais com itens não elegiveis
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess22() {
		
		autInitConfigurationCN00022();
		cn00022CTP00001.autCriaPedidoDescontoSecaoReaisItemNaoElegivel_Cn001();
	}

}
