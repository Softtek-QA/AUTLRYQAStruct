package br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001;

import org.junit.Test;

import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00001 {

	@Test
	public void autStartProcess01() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001.CTR0001  ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001.CTR0001();
		
		ctr1.ctr01();
		
		ctp1.AUT_NUMERO_PEDIDO = ctr1.AUT_NUMERO_PEDIDO;
		
		//ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00006_CN00001_CTR00001,"AUT_NUMERO_PEDIDO");
		
		ctp1.ctp1();
		
	}
	
}

