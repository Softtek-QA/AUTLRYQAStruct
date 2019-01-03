package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00010;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00010 extends AUTVABaseComponent{
	
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00010.CTP00001 cn000010CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN000010() {
	
		cn000010CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00010.CTP00001();
	}
	


	/**
	 * 
	 * CN00010 - Realizar um pedido com Garantia Estendida para um Cliente PJ
	 * Agrupamento de todos os casos de testes do CN000010
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess010() {
		
		autInitConfigurationCN000010();
		cn000010CTP00001.cn10();

	}

}
