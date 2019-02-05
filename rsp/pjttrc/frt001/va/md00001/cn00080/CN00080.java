package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080;

import org.junit.Test;

public class CN00080 {

	@Test
	public void autStartProcess80() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTR00001();
		ctr1.ctr80();
		ctp1.AUT_NUMERO_PEDIDO= ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp80();
		
	}
	
}
