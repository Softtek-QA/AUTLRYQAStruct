package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00012;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00012  extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00012.CTP00001 cn00012CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00012
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00012() {
	
		cn00012CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00012.CTP00001();
	}
	

	/**
	 * 
	 * CN00012 - Realizar um pedido e inserir desconto em um item
	 * Agrupamento de todos os casos de testes do CN00012
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess12() {
		
		autInitConfigurationCN00012();
		cn00012CTP00001.autCriaPedidoDescontoItemReais();
	}

}
