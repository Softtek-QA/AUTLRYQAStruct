package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * CTP00001 - Cartão caindo na antifraude e reprovando
 * 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */	
public class CTP00001 extends AUTVABaseComponent{

	public String AUT_NUMERO_PEDIDO;
	public <TGeradorPedido extends br.lry.components.va.AUTVAGeradorPedido> TGeradorPedido ct00012V1() {		
		return (TGeradorPedido)new AUTVAGeradorPedido();
	}
	
	public void ct00011(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp00012();
	}
	
	
	public void ctp00012() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parametros = new java.util.HashMap<String,Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00012_CTP00001);
		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		
		CMP00001(parametros);
		CMP00043(parametros);
		
	}
	
	
	
}

