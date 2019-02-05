package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00018;

import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00018 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00018.CTP00001 cn00018CTP00001;

	
	/**
	 * 
	 * 
	 * CTP00001 - Realizar orçamento, desc. pont fora da alçada e seção do usuário
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00018() {
	
		cn00018CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00018.CTP00001();}
	


	/**
	 * 
	 * CN00018 - Realizar orçamento, desc. pont fora da alçada e seção do usuário
	 * Agrupamento de todos os casos de testes do CN00018
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess18() {
		
		autInitConfigurationCN00018();
		cn00018CTP00001.cn18();

	}

}
