package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00007;
import br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00008;

public class CN00002_4 {
	
	@Test
	public void autStartProcess02(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00007 ctp7 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00007();	
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00008 ctp8 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CTP00008();
			
		ctp7.DevolucaoPedidoPDV(numPedido); //DEVOLVUCAO_PEDIDO_ESTRANGEIRO;
		
		ctp8.AUT_NUMERO_PEDIDO=ctp7.AUT_NUMERO_PEDIDO;	
		ctp8.AUT_STATUS_ESPERADO=ctp7.AUT_STATUS_ESPERADO;
			
		ctp8.ValidaStatusVA(); //VALIDA_STATUS_PEDIDO_DEVOLUCAO_ESTRANGEIRO;
	}
}
