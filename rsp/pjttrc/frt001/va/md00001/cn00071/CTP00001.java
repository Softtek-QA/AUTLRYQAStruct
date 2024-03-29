package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071;

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
 * CTP00001 - Pedido que usa mais de uma modalidade de frete 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp71() {
		
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001));
		 CMP00070(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001)).autVAIncluirItensNoCarrinho(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001));
		 CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00024(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001)).autDescontoSecao(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
			boolean statusListaEndereco = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.FluxoSaida")
					.exists("ListaEndereco", 10000);
			if (statusListaEndereco) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.ListaEndereco").click();
				autInsertScreenByScenario();
			}

			boolean statusPopUpFrete = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.FluxoSaida")
					.exists("PopUpFreteAdicional", 10000);
			if (statusPopUpFrete) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.PopUpFreteAdicional").click();
				autInsertScreenByScenario();
			}
			AUT_AGENT_SILK4J.<DomRadioButton>find("VA.AtualizacaoDados.//INPUT[@id='itementrega-0']").click();		
			AUT_AGENT_SILK4J.<DomListBox>find("VA.AtualizacaoDados.//SELECT[@id='deliveryOptionType-0']").select(1);
			AUT_AGENT_SILK4J.<DomListBox>find("VA.AtualizacaoDados.//SELECT[@id='deliveryOptionDeposit-0']").select(1);
			AUT_AGENT_SILK4J.<DomCheckBox>find("VA.AtualizacaoDados.//INPUT[@id='nearDate-0-delivery']").click();
			AUT_AGENT_SILK4J.<DomListBox>find("VA.AtualizacaoDados.//SELECT[@id='deliveryOptionShift-0']").select(2);

			AUT_AGENT_SILK4J.<DomRadioButton>find("VA.AtualizacaoDados.//INPUT[@id='itementrega-1']").click();		
			AUT_AGENT_SILK4J.<DomListBox>find("VA.AtualizacaoDados.//SELECT[@id='deliveryOptionType-1']").select(2);
			AUT_AGENT_SILK4J.<DomListBox>find("VA.AtualizacaoDados.//SELECT[@id='deliveryOptionDeposit-1']").select(1);
			AUT_AGENT_SILK4J.<DomCheckBox>find("VA.AtualizacaoDados.//INPUT[@id='nearDate-1-delivery']").click();
			AUT_AGENT_SILK4J.<DomListBox>find("VA.AtualizacaoDados.//SELECT[@id='deliveryOptionShift-1']").select(1);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001));	
		 CMP00022();		

	}
}
