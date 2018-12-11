package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00010;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;

public class CN00010  extends AUTBaseComponent{

	@Test
	public void autStartProcess10() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00010.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00010.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00010.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00010.CTR00001();
		ctr1.ctr000011();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp00011();
		
	}
	
}
