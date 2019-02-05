package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00003;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00003 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00003.CTP00001 cn00003CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00003() {
	
		cn00003CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00003.CTP00001();
	}
	


	/**
	 * 
	 * CN00003 - Realizar pedido com serviço atrelado e outro sem serviço atrelado
	 * Agrupamento de todos os casos de testes do CN00003
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess03() {
		
		autInitConfigurationCN00003();
		cn00003CTP00001.cn3();

	}

}
