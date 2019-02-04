package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00076;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00076 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00076.CTP00001 cn00076CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00076() {
	
		cn00076CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00076.CTP00001();
	}
	


	/**
	 * 
	 * CN00076 - Pedido com voucher e cartão de crédito
	 * Agrupamento de todos os casos de testes do CN00076
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess76() {
		
		autInitConfigurationCN00076();
		cn00076CTP00001.cn76();

	}

}
