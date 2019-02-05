package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00018;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00018  extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00018.CTP00001 cn00018CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00018
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00018() {
	
		cn00018CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00018.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00018 - Pedido com desconto funcionario e MDH - 20% desconto automatico
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess18() {
		
		autInitConfigurationCN00018();
		cn00018CTP00001.autCriaPedidoDescontoFuncionarioMDH();
	}

}
