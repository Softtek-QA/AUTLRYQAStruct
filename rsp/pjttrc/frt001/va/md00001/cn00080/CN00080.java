package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080;

import org.junit.Test;

import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00080 {

	@Test
	public void autStartProcess80() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CTR00001();
		//ctr1.ctr80();
		//ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00080_CTR00001,"AUT_NUMERO_PEDIDO");

		//Não cria pedido. Colocar no  Dataflow um pedido eliminado
		ctp1.ctp80();
		
	}
	
}
