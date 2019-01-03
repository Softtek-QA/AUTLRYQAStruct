package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00029;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00029 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00029.CTP00001 cn00029CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00029
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00029() {
	
		cn00029CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00029.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00029 - Pedido com desconto pontual sobre promoção complexa
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess29() {
		
		autInitConfigurationCN00029();
		cn00029CTP00001.autCriaPedidoDescontoPontualPromocaoComplexa();
	}

}
