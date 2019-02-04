package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00012;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00012 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00012.CTP0001 cn00012CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar um pedido com recuperação de OrçamentoRealizar orçamento com serviço e desconto
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00012() {
	
		cn00012CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00012.CTP0001();}
	


	/**
	 * 
	 * CN00012 - Realizar orçamento com serviço e desconto não eleg. para rateio
	 * Agrupamento de todos os casos de testes do CN00010
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess12() {
		
		autInitConfigurationCN00012();
		cn00012CTP00001.cn12();

	}

}
