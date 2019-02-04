package br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003;

import org.junit.Test;

public class CN00003 {

	@Test
	public void autStartProcess03() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003.CTR0001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003.CTR0001();
		
		ctr1.ctr03();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp3();
		
	}
	
}
