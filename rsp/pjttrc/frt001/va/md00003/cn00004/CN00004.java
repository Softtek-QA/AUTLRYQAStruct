package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00004;

import org.junit.Test;

public class CN00004 {

	@Test
	public void autStartProcess04() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00004.CTP0001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00004.CTP0001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00004.CTR0001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00004.CTR0001();
		
		ctr1.ctr04();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp4();
		
	}
	
}
