package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00002;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00002 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00002.CTP00001 cn00002CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com pagamento caixa
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00002() {
	
		cn00002CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00002.CTP00001();}
	


	/**
	 * 
	 * CN00002 - Realizar orçamento com pagamento caixa
	 * Agrupamento de todos os casos de testes do CN00002
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess02() {
		
		autInitConfigurationCN00002();
		cn00002CTP00001.cn02();

	}

}
