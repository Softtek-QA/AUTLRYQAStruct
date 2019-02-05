package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00019;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00019 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00019.CTP00001 cn00019CTP00001;

	
	/**
	 * 
	 * 
	 * CN00019 - Realizar orçam desc pontual % na seção e 1 item não eleg p rateio
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00019() {
	
		cn00019CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00019.CTP00001();}
	


	/**
	 * 
	 * CN00019 - Realizar orçam desc pontual % na seção e 1 item não eleg p rateio
	 * Agrupamento de todos os casos de testes do CN00018
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess19() {
		
		autInitConfigurationCN00019();
		cn00019CTP00001.cn19();

	}

}
