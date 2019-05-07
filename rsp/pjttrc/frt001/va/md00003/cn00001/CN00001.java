package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001;

import org.junit.Test;

import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00001 {

	@Test
	public void autStartProcess01() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTP0001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTP0001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTR0001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CTR0001();
		
		ctr1.ctr01();
		ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00003_CN00001_CTP00001,"AUT_NUMERO_PEDIDO");
		ctp1.ctp1();
		
	}
	
}
