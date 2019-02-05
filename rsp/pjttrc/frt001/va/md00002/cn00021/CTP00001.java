package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00021;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;



public class CTP00001 extends AUTVABaseComponent {

public  static String AUT_NUMERO_PEDIDO;

/**
* 
* 
* CTP00001 - Realizar orçament desc pont R$ na seção e 1item não eleg p rateio
* @param parametro - Parametros de entrada do sistema
* @return
*/
	@Test
	public void cn21() 
{autCriaPedidoDescontoSecaoPorcentagem(); 
autGetDataFlow().autInitDataFlow();
CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
//CMP00036(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
 
// CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
CMP00070(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001)).autVAIncluirItensNoCarrinho(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
CMP00024(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001)).autDescontoItem(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

 CMP00080(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00021_CTP00001));
 
 CMP00022();
 CMP00023();
}

private void autCriaPedidoDescontoSecaoPorcentagem() {
	// TODO Auto-generated method stub
	
}
}

