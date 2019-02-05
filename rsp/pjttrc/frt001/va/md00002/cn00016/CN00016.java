package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00016;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00016 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00016.CTP00001 cn00016CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento com serviço avulso
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00016() {
	
		cn00016CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00016.CTP00001();}
	


	/**
	 * 
	 * CN00016 - Realizar orçamento com serviço avulso
	 * Agrupamento de todos os casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess16() {
		
		autInitConfigurationCN00016();
		cn00016CTP00001.cn16();

	}

}
