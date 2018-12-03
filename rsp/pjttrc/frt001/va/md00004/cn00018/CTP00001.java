package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00018;

import org.junit.Test;

import com.borland.silktest.jtf.win32.AccessibleControl;
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
	 * CTP00001 - Pedido do canal televendas com opção de pagamento "Pagar na loja"
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */

	public void autPedidoTelevendasPagarLoja() {
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));
		 CMP00009(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));
		 CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click(); 
		 CMP00016(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));
		 AUT_AGENT_SILK4J.<DomCheckBox>find("VA.AtualizacaoDados.FlagPagamentoLoja").click(); 
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();	 
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00018_CTP00001));	
		 CMP00022();
	}
}
