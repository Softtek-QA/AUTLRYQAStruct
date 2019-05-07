package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085;

import org.junit.Test;

public class CN00085 {

	@Test
	public void autStartProcess85() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085.CTR00001();
//		ctr1.ctr85();
//		ctp1.AUT_NUMERO_PEDIDO= ctr1.AUT_NUMERO_PEDIDO;	
		
		//Não cria pedido. Colocar no  Dataflow um pedido Devolvido
		ctp1.ctp85();
		
	}
	
}
