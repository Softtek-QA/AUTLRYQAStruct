package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00089;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00089 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00089.CTP00001 cn00089CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00089() {
	
		cn00089CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00089.CTP00001();
	}
	


	/**
	 * 
	 * CN00089 - Realizar edição de pedido com status pago com usuário com permiss
	 * Agrupamento de todos os casos de testes do CN00089
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess89() {
		
		autInitConfigurationCN00089();
		cn00089CTP00001.cn9();

	}

}
