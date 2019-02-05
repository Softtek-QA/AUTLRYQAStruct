package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00023;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00023 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00023.CTP00001 cn00023CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com desconto pontual no total
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00023() {
	
		cn00023CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00023.CTP00001();}
	


	/**
	 * 
	 * CN00023 - Realizar orçamento com desconto pontual no total
	 * Agrupamento de todos os casos de testes do CN00023
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess23() {
		
		autInitConfigurationCN00023();
		cn00023CTP00001.cn23();

	}

}
