package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;


/**
 * 
 * 
 * CTP00001 - Pedido com frete adicional 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp74() {
		
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00070(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001)).autVAIncluirItensNoCarrinho(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 

		
		 AUT_AGENT_SILK4J.<DomRadioButton>find("VA.AtualizacaoDados.//INPUT[@id='itementrega-0']").click();		
			boolean statusListaEndereco = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.FluxoSaida")
					.exists("ListaEndereco", 10000);
			if (statusListaEndereco) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.ListaEndereco").click();
				autInsertScreenByScenario();
			}
		 DomListBox listComboFrete= AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.SelecionarFrete");
		 selectValor(listComboFrete);		 
		 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.FluxoSaida.BotaoSalvar").click();

		 DomListBox listComboSelecaoFrete= AUT_AGENT_SILK4J.<DomListBox>find("VA.Desconto.Motivo_ITEM");
		 selectValor(listComboSelecaoFrete);
		 
		 AUT_AGENT_SILK4J.<DomCheckBox>find("VA.FluxoSaida.DataMaisProxima").click();
	
		 
		 DomListBox listComboSelecaoSaida= AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.FilialSaida");
		 selectValor(listComboSelecaoSaida);
		 
		 DomListBox listComboEntrega= AUT_AGENT_SILK4J.<DomListBox>find("VA.ConfirmacaoLogin.Turno");
		 selectValor(listComboEntrega);
		 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));	
		 CMP00022();		

	}
}
