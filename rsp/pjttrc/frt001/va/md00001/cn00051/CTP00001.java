package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00051;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;



public class CTP00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTP00001 - Realizar um pedido com encomenda
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoComEncomenda() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00051_CTP00001);

		 CMP00002(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 CMP00012(parameters);
		 CMP00004(parameters);		 		 	 
		 CMP00014(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 boolean status = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.AtualizacaoDados").exists("ConfirmarEncomenda",10000);
			if(status) {
				
				AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.ConfirmarEncomenda").click();
				autInsertScreenByScenario();
			}	
		 CMP00016(parameters);
		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00034(parameters);	
		 CMP00022();		
	}
}
