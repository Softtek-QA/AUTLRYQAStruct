package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CN00016;
public class CTP00001 extends AUTVABaseComponent {

/**
 * 
 * 
 * CTP00001 - Pedido Televendas com loja diferente do pedido e depois editando
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
	
	public void autCopiaPedido() {
	 autGetDataFlow().autInitDataFlow();
     String numeroPedido = CN00015.cn00015CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTP00001,"AUT_NUMERO_PEDIDO").toString();
     CN00015.cn00015CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
	 CMP00001(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTR00001));
	 CMP00036(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTR00001));
	 CMP00005(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTP00001));
	 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTR00001));
	 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTR00001));
	 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	 AUT_AGENT_SILK4J.<DomCheckBox>find("VA02.FluxoSaida.DataMaisProxima").click();
	 DomListBox listComboDep=  AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.SelecionaDep");
	 selectValor(listComboDep);
	 DomListBox listComboEntrega= AUT_AGENT_SILK4J.<DomListBox>find("VA02.ConfirmacaoLogin.Turno");
	 selectValor(listComboEntrega);
	 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00002_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00002_CTP00001));
	 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTP00001));
	 CMP00022();	
	}
}
