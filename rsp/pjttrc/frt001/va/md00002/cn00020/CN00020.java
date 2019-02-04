package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00020;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00020 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00020.CTP00001 cn00020CTP00001;

	
	/**
	 * 
	 * 
	 *CN00020 - Realizar orçamento desc pontual % na seção e itens eleg p rateio
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00020() {
	
		cn00020CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00020.CTP00001();}
	


	/**
	 * 
	 * CN00020 - Realizar orçamento desc pontual % na seção e itens eleg p rateio
	 * Agrupamento de todos os casos de testes do CN00020
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess20() {
		
		autInitConfigurationCN00020();
		cn00020CTP00001.cn20();

	}

}
