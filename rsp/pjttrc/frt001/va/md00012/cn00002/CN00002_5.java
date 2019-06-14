package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00009;

public class CN00002_5 {
	
	@Test
	public void autStartProcess02(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00009 ctp9 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00009();	
			
		ctp9.CarregarValeTroca(); //VALIDA_VALE_TROCA_PF;

	}
}
