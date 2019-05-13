package br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001;

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
	
	public void ct00001(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp1();
	}
	
	@Test
	public void ctp1() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parametros = new java.util.HashMap<String,Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00006_CN00001_CTP00001);
		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		
		CMP00001(parametros);
		
		CMP00043_3(parametros);
		
//		AUT_AGENT_SILK4J.<DomElement>find("VA.PesquisaCEP.Fechar").click();
//		AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.menu").click();
//		AUT_AGENT_SILK4J.<DomLink>find("VA.LiberacaoPendentes.MenuLiberacaoPendentes").click();
//		AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AntiFraude").click();
//		AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumeroPedido").setFocus();
//		AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumeroPedido").typeKeys(parametros.get("AUT_NUMERO_PEDIDO").toString());
////		AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumPedido").setText("/n");
//		AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.BotaoPesquisar").click();
//		AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AprovarSemAntiFraude").setFocus();
//		AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AprovarSemAntiFraude").click();
//			if(AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.PopDesconto").isVisible()) {
//				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.SimDesconto").click();
//			}
		
			CMP00022();
		
	}
	
	
	
}

