package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00030;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00030 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00030.CTP00001 cn00030CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento e adicionar ocorrência
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00030() {
	
		cn00030CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00030.CTP00001();}
	


	/**
	 * 
	 * CN00030 - Realizar orçamento e adicionar ocorrência
	 * Agrupamento de todos os casos de testes do CN00030
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess30() {
		
		autInitConfigurationCN00030();
		cn00030CTP00001.cn30();

	}

}
