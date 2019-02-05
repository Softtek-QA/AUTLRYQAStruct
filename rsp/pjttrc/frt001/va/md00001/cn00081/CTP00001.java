package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTP00001 extends AUTVABaseComponent{

	public String AUT_NUMERO_PEDIDO;
	public <TGeradorPedido extends br.lry.components.va.AUTVAGeradorPedido> TGeradorPedido ct00080V1() {		
		return (TGeradorPedido)new AUTVAGeradorPedido();
	}
	
	public void ct00081(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp81();
	}
	
	
	@Test
	public void ctp81() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00081_CTP00001);

	
		
		
		
		CMP00002(parameters);
		CMP00071(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		CMP00016(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		CMP00020(parameters).autVAMultiplosMeiosPagamentoTelevendas(parameters);
		CMP00034(parameters);
		CMP00022();	

	}
}
