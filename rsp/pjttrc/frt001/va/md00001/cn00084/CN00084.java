package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084;

import org.junit.Test;

public class CN00084 {

	@Test
	public void autStartProcess84() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084.CTR00001();
		ctr1.ctr84();
		ctp1.AUT_NUMERO_PEDIDO= ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp84();
		
	}
	
}
