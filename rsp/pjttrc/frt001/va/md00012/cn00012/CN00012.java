package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00012;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00012{

	
	@Test
	public void autStartProcess12() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00012.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00012.CTP00001();	
		
		ctp1.GeraVoucherEst(); //Gera voucher para pessoa estrangeira;
	}
}
