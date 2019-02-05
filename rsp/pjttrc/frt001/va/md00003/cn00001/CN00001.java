package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001;

import org.junit.Test;

public class CN00001 {

	@Test
	public void autStartProcess01() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTP0001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTP0001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTR0001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTR0001();
		
		ctr1.ctr01();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp1();
		
	}
	
}
