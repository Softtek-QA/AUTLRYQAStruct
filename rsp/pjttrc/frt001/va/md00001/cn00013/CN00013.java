package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00013;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00013 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00013.CTP00001 cn000013CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN000013() {
	
		cn000013CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00013.CTP00001();
	}
	


	/**
	 * 
	 * CN000013 - Realizar um pedido com desconto e um serviço atrelado
	 * Agrupamento de todos os casos de testes do CN000013
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess013() {
		
		autInitConfigurationCN000013();
		cn000013CTP00001.cn13();

	}

}
