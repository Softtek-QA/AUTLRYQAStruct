package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012;

import org.junit.Test;

public class CN00012 {

	@Test
	public void autStartProcess12() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTR00001();
		ctr1.ctr000012();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp00012();
		
	}
	
}
