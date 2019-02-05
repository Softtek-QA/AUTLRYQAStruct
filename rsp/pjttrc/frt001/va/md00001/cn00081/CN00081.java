package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081;

import org.junit.Test;

public class CN00081 {

	@Test
	public void autStartProcess81() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081.CTR00001();
		ctr1.ctr81();
		ctp1.AUT_NUMERO_PEDIDO= ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp81();
		
	}
	
}
