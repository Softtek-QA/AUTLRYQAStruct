package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00032;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTR00001 - Pedido com desconto fora do mundo
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void ct00032() {
	autGetDataFlow().autInitDataFlow();
	java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
	parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001);
	parameters.remove("AUT_NUMERO_PEDIDO");
	parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
	
	
	CMP00002(parameters);
	CMP00009(parameters);
	CMP00008(parameters);
	CMP00012(parameters);
	CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001));
	CMP00014(parameters);
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	CMP00024(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001)).autDescontoItem(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001));
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	CMP00016(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001));
	CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001));
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00032_CTP00001));	
	CMP00022();
//	String conteudoElemento = AUT_AGENT_SILK4J.<DomElement>find("VA.TelaFinalPedidos.NumeroPedido").getText();
//	java.util.regex.Pattern padrao = java.util.regex.Pattern.compile("\\d+");
//	java.util.regex.Matcher analise = padrao.matcher(conteudoElemento);
//	if(analise.find()) {
//	AUT_NUMERO_PEDIDO = analise.group();
//	}
//	else {
//		AUT_NUMERO_PEDIDO= "00000000000";
//}
//	
//	CMP00022();
	}
}


