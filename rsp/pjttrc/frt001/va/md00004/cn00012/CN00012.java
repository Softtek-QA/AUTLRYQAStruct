package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00012  extends AUTBaseComponent{

	@Test
	public void autStartProcess12() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CTR00001();

		ctr1.ctr000012();
		
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	

		//ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00012_CTR00001,"AUT_NUMERO_PEDIDO");
		//System.out.println("O número do pedido é "+autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00012_CTR00001,"AUT_NUMERO_PEDIDO"));
		
		ctp1.ctp00012();
		
	}
	
}
