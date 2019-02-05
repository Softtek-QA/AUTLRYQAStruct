package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00075;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00075 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00075.CTP00001 cn00075CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00075() {
	
		cn00075CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00075.CTP00001();
	}
	


	/**
	 * 
	 * CN00075 - Pedido com voucher e cartão de crédito
	 * Agrupamento de todos os casos de testes do CN00075
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess75() {
		
		autInitConfigurationCN00075();
		cn00075CTP00001.cn75();

	}

}
