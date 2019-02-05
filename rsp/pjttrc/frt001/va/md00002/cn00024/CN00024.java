package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00024;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00024 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00024.CTP0001 cn00024CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento através do portal de Venda Assistida
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00001() {
	
		cn00024CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00024.CTP0001();}
	


	/**
	 * 
	 * CN00001 - Realizar orçamento através do portal de Venda Assistida
	 * Agrupamento de todos os casos de testes do CN00001
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess24() {
		
		autInitConfigurationCN00001();
		cn00024CTP00001.cn24();

	}

}
