package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00005_1 {

	
	@Test
	public String autStartProcess05() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CTP00001();	
		br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CTP00002 ctp2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CTP00002();
			
		ctp1.CriaPedido(); //RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_ESTRANGEIRO;
		
		ctp2.AUT_NUMERO_PEDIDO=ctp1.AUT_NUMERO_PEDIDO;	
		ctp2.AUT_STATUS_ESPERADO=ctp1.AUT_STATUS_ESPERADO;
			
		ctp2.ValidaStatusVA(); //VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO;
		
		return ctp1.AUT_NUMERO_PEDIDO;
	}
}
