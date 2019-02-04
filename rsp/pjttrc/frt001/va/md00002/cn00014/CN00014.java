package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00014;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00014 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00014.CTP00001 cn00014CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com garantia estendida eleg p rateio e entrega
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00014() {
	
		cn00014CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00014.CTP00001();}
	


	/**
	 * 
	 * CN00014 - Realizar orçamento com garantia estendida eleg p rateio e entrega
	 * Agrupamento de todos os casos de testes do CN00010
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess14() {
		
		autInitConfigurationCN00014();
		cn00014CTP00001.cn14();

	}

}
