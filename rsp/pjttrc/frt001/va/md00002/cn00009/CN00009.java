package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00009;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00009 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00009.CTP00001 cn00009CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com serviço e rateio de desconto no serviço
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00009() {
	
		cn00009CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00009.CTP00001();}
	


	/**
	 * 
	 * CN00009 - Realizar orçamento com serviço e rateio de desconto no serviço
	 * Agrupamento de todos os casos de testes do CN00009
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess09() {
		
		autInitConfigurationCN00009();
		cn00009CTP00001.cn09();

	}

}
