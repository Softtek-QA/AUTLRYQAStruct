package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00014 extends AUTBaseComponent{
	
	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00014
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	
	@Test
	public void autStartProcess() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTR00001();
		ctr1.ctr00014();
		
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
	
		ctp1.ctp00014();

	}

}
