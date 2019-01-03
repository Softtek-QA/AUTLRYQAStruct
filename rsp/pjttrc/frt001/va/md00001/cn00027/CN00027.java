package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00027;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00027 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00027.CTP00001 cn00027CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00027
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00027() {
	
		cn00027CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00027.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00027 - Pedido com desconto pontual sobre administrado elegivel
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess27() {
		
		autInitConfigurationCN00027();
		cn00027CTP00001.autCriaPedidoDescontoPontualAdministradoNaoElegivel();
	}

}
