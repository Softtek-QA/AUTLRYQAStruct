package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00004;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00004 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00004.CTP00001 cn00004CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00004() {
	
		cn00004CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00004.CTP00001();
	}
	


	/**
	 * 
	 * CN00004 - Realizar um pedido com desconto e um serviço atrelado
	 * Agrupamento de todos os casos de testes do CN00004
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess04() {
		
		autInitConfigurationCN00004();
		cn00004CTP00001.cn4();

	}

}
