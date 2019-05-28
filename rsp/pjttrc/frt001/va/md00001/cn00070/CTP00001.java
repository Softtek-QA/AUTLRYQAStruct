package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


import com.borland.silktest.jtf.xbrowser.BrowserWindow;


/**
 * 
 * 
 * CTP00001 - Pedido que usa mais de uma filial de saída 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp70() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001);
		
		CMP00002(parameters);

		CMP00037(parameters);

		CMP00009(parameters);

		CMP00008(parameters);

		CMP00012(parameters);

		CMP00004(parameters);

		CMP00014(parameters);

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	    AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	    CMP00016(parameters);

//	    AUT_AGENT_SILK4J.<DomCheckBox>find("VA.TelaMeioPagamento.PagarNaLoja").click();
	    CMP00020(parameters).autSelecaoMeioPagamento(parameters);

	    AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	 
		CMP00034(parameters);

		CMP00022();		 

	}
}
