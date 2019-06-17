package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00007_4 {
	
	@Test
	public void autStartProcess07(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CTP00007 ctp7 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CTP00007();	
		
		ctp7.CarregarValeTroca(); //VALIDA_VALE_TROCA_PF;
	}
}
