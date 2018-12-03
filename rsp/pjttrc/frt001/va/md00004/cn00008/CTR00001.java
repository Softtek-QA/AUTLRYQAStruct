package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTR00001 - Pedido Televendas pag Cart Créd e Voucher
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTR00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;
	
	public void ctr000008() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00008_CTR00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		CMP00002(parameters);
		CMP00009(parameters);
		CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00008_CTR00001));
		CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00008_CTR00001));
		CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00008_CTR00001));
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		CMP00016(parameters);
		CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00008_CTR00001)).autVAMultiplosMeiosPagamentoTelevendas(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00006_CTR00001));
		AUT_AGENT_SILK4J.<DomCheckBox>find("VA02.TelaMeioPagamento.IgnAntiFraude").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		String conteudoElemento = AUT_AGENT_SILK4J.<DomElement>find("VA.TelaFinalPedidos.NumeroPedido").getText();
		java.util.regex.Pattern padrao = java.util.regex.Pattern.compile("\\d+");
		java.util.regex.Matcher analise = padrao.matcher(conteudoElemento);
			if(analise.find()) {
				AUT_NUMERO_PEDIDO = analise.group();
			}
			else {
				AUT_NUMERO_PEDIDO= "00000000000";
			}
	
	}
}

