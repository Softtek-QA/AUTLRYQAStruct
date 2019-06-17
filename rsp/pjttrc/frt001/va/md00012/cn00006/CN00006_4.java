package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00006_4 {
	
	@Test
	public void autStartProcess06(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CTP00007 ctp7 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CTP00007();	
		
		ctp7.CarregarValeTroca(); //VALIDA_VALE_TROCA_ESTRANGEIRO;
	}
}
