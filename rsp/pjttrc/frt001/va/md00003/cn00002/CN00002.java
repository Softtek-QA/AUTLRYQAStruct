package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00002;

import org.junit.Test;

public class CN00002 {

	@Test
	public void autStartProcess02() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00002.CTP0001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00002.CTP0001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00002.CTR0001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00002.CTR0001();
		
		ctr1.ctr02();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp2();
		
	}
	
}
