package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00030;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;



public class CTP00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CN00030 - Pedido com promoção complexa sobre desconto
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoDescontoPontualPromocaoComplexa() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00030_CTP00001);
		
		 CMP00002(parameters);

		 CMP00009(parameters);

		 CMP00008(parameters);

		 CMP00012(parameters);

		 CMP00004(parameters);

		 CMP00014(parameters);

		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00024(parameters).autDescontoItem(parameters);

		 AUT_AGENT_SILK4J.<DomButton>find("VA.FluxoSaida.Avancar").click();	
		 AUT_AGENT_SILK4J.<DomButton>find("VA.FluxoSaida.Avancar").click();	

		 CMP00016(parameters);
	
		
		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 
		 autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00030_CTP00001, "AUT_NUMERO_PEDIDO", "");
		 CMP00034(parameters);

		 CMP00022();
	}
}
