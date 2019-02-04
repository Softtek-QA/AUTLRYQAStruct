package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00021;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00021 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00021.CTP00001 cn00021CTP00001;

	
	/**
	 * 
	 * 
	 *CN00021 - Realizar orçament desc pont R$ na seção e 1item não eleg p rateio
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00021() {
	
		cn00021CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00021.CTP00001();}
	


	/**
	 * 
	 * CN00021 - Realizar orçament desc pont R$ na seção e 1item não eleg p rateio
	 * Agrupamento de todos os casos de testes do CN00020
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess21() {
		
		autInitConfigurationCN00021();
		cn00021CTP00001.cn21();

	}

}
