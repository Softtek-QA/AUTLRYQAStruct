package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00007;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00007 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00007.CTP00001 cn00007CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00007() {
	
		cn00007CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00007.CTP00001();
	}
	


	/**
	 * 
	 * CN00007 - Realizar um pedido através da inclusão em Massa
	 * Agrupamento de todos os casos de testes do CN00007
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess07() {
		
		autInitConfigurationCN00007();
		cn00007CTP00001.cn7();

	}

}
