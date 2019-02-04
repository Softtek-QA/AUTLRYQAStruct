package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083;

import org.junit.Test;

public class CN00083 {

	@Test
	public void autStartProcess83() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083.CTR00001();
		ctr1.ctr83();
		ctp1.AUT_NUMERO_PEDIDO= ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp83();
		
	}
	
}
