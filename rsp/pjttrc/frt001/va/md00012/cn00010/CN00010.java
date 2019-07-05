package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00010;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CN00010{

	
	public class CTP00001 {

	}

	@Test
	public void autStartProcess10() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00010.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00010.CTP00001();	
		
		ctp1.GeraVoucherPF(); //Gera Voucher para Pessoa Física
	}
}
