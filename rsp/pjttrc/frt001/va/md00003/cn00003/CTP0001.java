package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTP00001 - Cartão caindo na antifraude e reprovando
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP0001 extends AUTVABaseComponent {

	public String AUT_NUMERO_PEDIDO;
	public <TGeradorPedido extends br.lry.components.va.AUTVAGeradorPedido> TGeradorPedido ct00003V1() {		
		return (TGeradorPedido)new AUTVAGeradorPedido();
	}
	
	public void ctp03(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp3();
	}
	
	
	public void ctp3() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parametros = new java.util.HashMap<String,Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00003_CN00003_CTP00001);
		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		
		CMP00001(parametros);
		CMP00044(parametros);
		CMP00022();
	}
	
	
	
}

