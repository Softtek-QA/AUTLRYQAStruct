package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00006_5 {
	
	@Test
	public void autStartProcess01(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CTP00003 ctp3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CTP00003();	
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CTP00004 ctp4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CTP00004();
			
		ctp3.PagaPedidoPDV(numPedido); //PAGAMENTO_PEDIDO_PF;
	
		ctp4.AUT_NUMERO_PEDIDO=ctp3.AUT_NUMERO_PEDIDO;	
		ctp4.AUT_STATUS_ESPERADO=ctp3.AUT_STATUS_ESPERADO;
			
		ctp4.ValidaStatusVA(); //VALIDA_STATUS_PEDIDO_PAGO_PF;
	}
}
