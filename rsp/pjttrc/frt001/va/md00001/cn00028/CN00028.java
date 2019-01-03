package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00028;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00028 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00028.CTP00001 cn00028CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00028
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00028() {
	
		cn00028CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00028.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00028 - Pedido com desconto pontual sobre administrado elegivel
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess28() {
		
		autInitConfigurationCN00028();
		cn00028CTP00001.autCriaPedidoDescontoPontualAdministradoElegivel();
	}

}
