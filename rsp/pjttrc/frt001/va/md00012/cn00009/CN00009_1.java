package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00009_1 {

	
	@Test
	public String autStartProcess09() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CTP00001();	
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CTP00002 ctp2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CTP00002();
			
		ctp1.CriaPedido(); //CAIXA_PAG_DINHEIRO_PJ;
		
		ctp2.AUT_NUMERO_PEDIDO=ctp1.AUT_NUMERO_PEDIDO;	
		ctp2.AUT_STATUS_ESPERADO=ctp1.AUT_STATUS_ESPERADO;
			
		ctp2.ValidaStatusVA(); //VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ;
		
		return ctp1.AUT_NUMERO_PEDIDO;
	}
}
