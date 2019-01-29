package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00045;

import org.junit.Test;

public class CN00045 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00045.CTP00001 cn00045CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00045
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00045() {
	
		cn00045CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00045.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00045 - Realizar pedido pgto Cart Créd. vlr menor R$100 divido 2X ou mais
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess45() {
		
		autInitConfigurationCN00045();
		cn00045CTP00001.autCriaPedidoComParcelaInferior();
	}

}
