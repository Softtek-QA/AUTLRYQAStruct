package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00022;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00022 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00022.CTP00001 cn00022CTP00001;

	
	/**
	 * 
	 * 
	 *CN00022 - Realizar orçamento desc pont R$ na seção com itens eleg p rateio
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00022() {
	
		cn00022CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00022.CTP00001();}
	


	/**
	 * 
	 * CN00022 - Realizar orçamento desc pont R$ na seção com itens eleg p rateio
	 * Agrupamento de todos os casos de testes do CN00020
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess22() {
		
		autInitConfigurationCN00022();
		cn00022CTP00001.cn22();

	}

}
