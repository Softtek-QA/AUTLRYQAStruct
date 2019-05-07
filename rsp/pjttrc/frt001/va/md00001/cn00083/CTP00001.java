package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083;

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
	
	public void ct00083(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp83();
	}
	
	
	@Test
	public void ctp83() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00083_CTP00001);

		
		CMP00002(parameters);
		
		CMP00009(parameters);
		
		CMP00005(parameters);
		
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		//Fluxo de  saida
		CMP00016(parameters);
				
		//Meio de pagamento
		CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	    String numPedido = CMP00034(parameters).AUT_NUMERO_PEDIDO;
	    
	    autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00083_CTP00001, "AUT_NUMERO_PEDIDO", numPedido);
	  			
		CMP00022();

	}
}
