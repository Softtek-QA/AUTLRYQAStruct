package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00011;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00011.CN00011.CTP00001;

public class CN00011{

	
	public class CTP00001 {

	}

	@Test
	public void autStartProcess11() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00011.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00011.CTP00001();	
		
		ctp1.GeraVoucherPF(); //VALIDA_VALE_TROCA_ESTRANGEIRA;
	}
}
