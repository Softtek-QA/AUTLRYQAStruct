package br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00002;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomTextField;

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
public class CTP00001 extends AUTVABaseComponent {

	public String AUT_NUMERO_PEDIDO;
	public <TGeradorPedido extends br.lry.components.va.AUTVAGeradorPedido> TGeradorPedido ct00001V1() {		
		return (TGeradorPedido)new AUTVAGeradorPedido();
	}
	
	public void ct00002(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp2();
	}
	
	@Test
	public void ctp2() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parametros = new java.util.HashMap<String,Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00006_CN00002_CTP00001);
		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		
		CMP00001(parametros);
		
		CMP00043(parametros);
		CMP00022();
	}
	
	
	
}

