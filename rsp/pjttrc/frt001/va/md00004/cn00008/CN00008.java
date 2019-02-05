package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;

public class CN00008  extends AUTBaseComponent{

	@Test
	public void autStartProcess08() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008.CTR00001();
		ctr1.ctr000008();
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
		ctp1.ctp00008();
		
	}
	
}
