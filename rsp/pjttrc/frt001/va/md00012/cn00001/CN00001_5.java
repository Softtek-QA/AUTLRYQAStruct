package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00001_5 {
	
	@Test
	public void autStartProcess01(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CTP00009 ctp9 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CTP00009();	
			
		ctp9.CarregarValeTroca(); //VALIDA_VALE_TROCA_PF;
	
	}
}
