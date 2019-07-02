package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00013;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00013 {

	
	@Test
	public void autStartProcess13() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00013.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00013.CTP00001();	
		
		ctp1.GeraVoucherPJ(); //Gera Voucher para pessoa jurídica
	}
}
