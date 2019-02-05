package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00015;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00015 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00015.CTP00001 cn00015CTP00001;

	
	/**
	 * 
	 * 
	 * CN00015 - Realizar orçamento com garantia estendida, desc não eleg p rateio
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00015() {
	
		cn00015CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00015.CTP00001();}
	


	/**
	 * 
	 * CN00015 - Realizar orçamento com garantia estendida, desc não eleg p rateio
	 * Agrupamento de todos os casos de testes do CN00015
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess15() {
		
		autInitConfigurationCN00015();
		cn00015CTP00001.cn15();

	}

}
