package br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR0001 extends AUTVABaseComponent {
	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
		public void ctr01() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00003_CN00001_CTR00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);	
		 
		 CMP00002(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 CMP00012(parameters);
		 CMP00004(parameters);
		 CMP00014_CPF(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00024(parameters).autDescontoSecao(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00020(parameters);
		 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.TelaResumo.Finalizar").click();
		 
		 if(AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.PopUpConfirmar").isVisible()) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.ConfirmarSim").click();
			}
		 
		 AUT_NUMERO_PEDIDO = AUT_AGENT_SILK4J.<DomElement>find("VA.TelaFinalPedidos.NumeroPedido").getText();

			System.out.println("O número do pedido é "+ AUT_NUMERO_PEDIDO);
			autInsertScreenByScenario();
			java.util.regex.Pattern padrao = java.util.regex.Pattern.compile("\\d+");
			java.util.regex.Matcher analise = padrao.matcher(AUT_NUMERO_PEDIDO);
			if(analise.find()) {
				AUT_NUMERO_PEDIDO = analise.group();
			}
			else {
				AUT_NUMERO_PEDIDO= "00000000000";
			}
		
			autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00003_CN00001_CTR00001, "AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
			
		 CMP00022();
	}
}
