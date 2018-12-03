package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006;

import org.junit.Test;

public class CN00006 {

	@Test
	public void autStartProcess06() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006.CTR00001();
		ctr1.ctr000006();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp00006();
		
	}
	
}
