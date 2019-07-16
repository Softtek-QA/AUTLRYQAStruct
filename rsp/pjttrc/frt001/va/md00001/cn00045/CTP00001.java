package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00045;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat009.AUTMeiosPagamento;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;



public class CTP00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTP000001 - Realizar um pedido com pagamento Cartão de Crédito (especifiação)
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoComParcelaInferior() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00045_CTP00001);

		 
		 CMP00002(parameters);

		 CMP00009(parameters);

		 CMP00008(parameters);

		 CMP00012(parameters);

		 CMP00004(parameters);

		 CMP00014(parameters);

		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		 CMP00016(parameters);

		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.TelaMeioPagamento.Avancar").click();

		 //Fecha janela informativa sobre valor acima do permitido e seleciona pagto em 1x para passar
		 if(AUT_AGENT_SILK4J.<BrowserWindow>find("VA.TelaMeioPagamento").exists("PopUPValorMinimo", 5000)) {
			 AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.PopUPValorMinimo").click();
			 AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.PlanoPagamento").select(AUTMeiosPagamento.AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString());
			 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 }
		 
		 
		 CMP00034(parameters);

		 CMP00022();		
	}
}
