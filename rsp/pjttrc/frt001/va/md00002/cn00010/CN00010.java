package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00010;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00010 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00010.CTP00001 cn00010CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com serviço com rateio de frete e entrega
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00010() {
	
		cn00010CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00010.CTP00001();}
	


	/**
	 * 
	 * CN00010 - Realizar orçamento com serviço com rateio de frete e entrega
	 * Agrupamento de todos os casos de testes do CN00010
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess10() {
		
		autInitConfigurationCN00010();
		cn00010CTP00001.cn10();

	}

}
