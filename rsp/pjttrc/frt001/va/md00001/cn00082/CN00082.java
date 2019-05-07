package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082;

import org.junit.Test;

public class CN00082 {

	@Test
	public void autStartProcess82() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082.CTR00001();
		//ctr1.ctr82();
		//ctp1.AUT_NUMERO_PEDIDO= ctr1.AUT_NUMERO_PEDIDO;	
		
		//Não cria pedido. Colocar no  Dataflow um pedido cancelado
		ctp1.ctp82();
		
	}
	
}
