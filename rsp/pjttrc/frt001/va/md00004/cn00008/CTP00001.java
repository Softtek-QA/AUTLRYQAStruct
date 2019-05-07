package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008;

import com.borland.silktest.jtf.xbrowser.DomButton;

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
	public <TGeradorPedido extends br.lry.components.va.AUTVAGeradorPedido> TGeradorPedido ct00006V1() {		
		return (TGeradorPedido)new AUTVAGeradorPedido();
	}
	
	public void ct00011(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp00008();
	}
	
	
	public void ctp00008() {
		autGetDataFlow().autInitDataFlow();
		
		java.util.HashMap<String,Object> parametros = new java.util.HashMap<String,Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00008_CTP00001);
		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		parametros.put("AUT_USER", parametros.get("AUT_USER_EDITOR").toString()).toString();
		CMP00002(parametros);
		CMP00037(parametros);
		CMP00005_2(parametros);

		CMP00024(parametros).autDescontoSecao(parametros);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		//Fluxo de  saida
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		//Meio de pagamento
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	    CMP00034(parametros);
	
		CMP00022();	
		
	}
	
	
	
}

