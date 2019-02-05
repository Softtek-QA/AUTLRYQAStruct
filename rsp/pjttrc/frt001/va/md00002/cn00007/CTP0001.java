package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00007;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTP0001 extends AUTVABaseComponent {
	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
		public void cn07() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00007_CTP00001);
			
		 
		 CMP00002(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 CMP00061(parameters);
		 CMP00004(parameters);
		 CMP00014_CPF(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00024(parameters).autDescontoSecao(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.TelaResumo.Finalizar").click();
		 if(AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.PopUpConfirmar").isVisible()) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.ConfirmarSim").click();
			}
		 
		 
		 CMP00022();
	}
}