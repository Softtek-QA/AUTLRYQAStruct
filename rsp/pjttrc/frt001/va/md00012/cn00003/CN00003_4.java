package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00003_4 {
	
	@Test
	public void autStartProcess03(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00007 ctp7 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00007();	
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00008 ctp8 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00008();
			
		ctp7.DevolucaoPedidoPDV(numPedido); //DEVOLVUCAO_PEDIDO_PJ;
		
		ctp8.AUT_NUMERO_PEDIDO=ctp7.AUT_NUMERO_PEDIDO;	
		ctp8.AUT_STATUS_ESPERADO=ctp7.AUT_STATUS_ESPERADO;
			
		ctp8.ValidaStatusVA(); //VALIDA_STATUS_PEDIDO_DEVOLUCAO_PJ;
	}
}
