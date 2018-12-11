package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;

public class CN00013 extends AUTBaseComponent{

	@Test
	public void autStartProcess()  {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013.CTR00001();
		ctr1.ct00013();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp00013();
		
	}
	
}
