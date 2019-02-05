package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00003;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00003 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00003.CTP00001 cn00003CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com retirada na loja
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00003() {
	
		cn00003CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00003.CTP00001();}
	


	/**
	 * 
	 * CN00003 - Realizar orçamento com retirada na loja
	 * Agrupamento de todos os casos de testes do CN00003
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess03() {
		
		autInitConfigurationCN00003();
		cn00003CTP00001.cn03();

	}

}
