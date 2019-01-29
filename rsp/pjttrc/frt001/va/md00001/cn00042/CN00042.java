package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00042;

import org.junit.Test;

public class CN00042 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00042.CTP00001 cn00042CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00042
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00042() {
	
		cn00042CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00042.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00042 - Realizar um pedido com saída de Fluxo Entrega economica
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess42() {
		
		autInitConfigurationCN00042();
		cn00042CTP00001.ctp42();
	}

}
