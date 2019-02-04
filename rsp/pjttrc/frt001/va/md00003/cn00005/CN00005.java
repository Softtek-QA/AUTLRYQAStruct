package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00005;

import org.junit.Test;

public class CN00005 {

	@Test
	public void autStartProcess05() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00005.CTP0001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00005.CTP0001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00005.CTR0001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00005.CTR0001();
		
		ctr1.ctr05();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp5();
		
	}
	
}
