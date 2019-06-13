package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00003_3 {
	
	@Test
	public void autStartProcess03(String numPedido) {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00005 ctp5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00005();	
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00006 ctp6 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CTP00006();
			
<<<<<<< HEAD
		ctp5.FaturaPedidoSAP(numPedido); //FATURA_PEDIDO_PF;
=======
		ctp5.FaturaPedidoSAP(numPedido); //FATURA_PEDIDO_PJ;
>>>>>>> branch 'new_develop' of https://github.com/Softtek-QA/AUTLRYQAStruct.git
	
		ctp6.AUT_NUMERO_PEDIDO=ctp5.AUT_NUMERO_PEDIDO;	
		ctp6.AUT_STATUS_ESPERADO=ctp5.AUT_STATUS_ESPERADO;
			
		ctp6.ValidaStatusVA(); //VALIDA_STATUS_PEDIDO_FATURADO_PJ;
	}
}
