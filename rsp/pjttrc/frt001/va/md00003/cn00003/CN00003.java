package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003;

import org.junit.Test;

import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00003 {

	@Test
	public void autStartProcess03() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003.CTP0001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003.CTP0001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003.CTR0001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003.CTR0001();
		
		ctr1.ctr03();
		
		
		ctp1.AUT_NUMERO_PEDIDO = ctr1.AUT_NUMERO_PEDIDO;
		
		//ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00003_CN00003_CTP00001,"AUT_NUMERO_PEDIDO");
		
		ctp1.ctp3();
		
	}
	
}
