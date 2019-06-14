package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00004_3 {
	
	@Test
	public void autStartProcess04(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CTP00005 ctp5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CTP00005();	
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CTP00006 ctp6 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CTP00006();
			
		ctp5.DevolucaoPedidoPDV(numPedido); //DEVOLVUCAO_PEDIDO_PF;
	
		ctp6.AUT_NUMERO_PEDIDO=ctp5.AUT_NUMERO_PEDIDO;	
		ctp6.AUT_STATUS_ESPERADO=ctp5.AUT_STATUS_ESPERADO;
			
		ctp6.ValidaStatusVA(); //VALIDA_STATUS_PEDIDO_DEVOLUCAO_PF;	
	}
}