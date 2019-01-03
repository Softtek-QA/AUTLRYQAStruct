package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00017;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00017 extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00017.CTP00001 cn00017CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00017
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00017() {
	
		cn00017CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00017.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00017 - Pedido com desconto funcionario
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess17() {
		
		autInitConfigurationCN00017();
		cn00017CTP00001.autCriaPedidoDescontoFuncionario();
	}

}
