package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00013;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00013 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00013.CTP00001 cn00013CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com garantia estendida, desconto e rateio
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00013() {
	
		cn00013CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00013.CTP00001();}
	


	/**
	 * 
	 * CN00013 - Realizar orçamento com garantia estendida, desconto e rateio
	 * Agrupamento de todos os casos de testes do CN00013
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess13() {
		
		autInitConfigurationCN00013();
		cn00013CTP00001.cn13();

	}

}
