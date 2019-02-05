package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00028;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00028 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00028.CTP00001 cn00028CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento e incluir observação no orçamento
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00028() {
	
		cn00028CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00028.CTP00001();}
	


	/**
	 * 
	 * CN00028 - Realizar orçamento e incluir observação no orçamento
	 * Agrupamento de todos os casos de testes do CN00028
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess28() {
		
		autInitConfigurationCN00028();
		cn00028CTP00001.cn28();

	}

}
