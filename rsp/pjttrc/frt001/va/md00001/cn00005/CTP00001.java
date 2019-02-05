package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CN00008;

public class CTP00001 extends AUTVABaseComponent {
	
	
	/**
	 * 
	 * 
	 * CTP00001 - Criar carrinho no VA Hybris 
	 * parametro - Parametros de entrada do sistema
	 * @param
	 * @return
	 */
	@Test
	public void autRecuperarCarrinho() {

		 autGetDataFlow().autInitDataFlow();
		 autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001).remove("AUT_NUMERO_CARRINHO");
	     autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001).put("AUT_NUMERO_CARRINHO", CN00005.getNumeroCarrinho());
	     System.out.println("Parametros do cenário"+autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
	     System.out.println("Numero do carrinho no CTP"+ CN00005.getNumeroCarrinho());
	     System.out.println("Numero Carrinho no CTP 0111"+autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001,"AUT_NUMERO_CARRINHO"));
		 java.util.HashMap<String,Object> parametros = new java.util.HashMap<String,Object>();
		 parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001);
		 CMP00001(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
		 CMP00036(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
		 CMP00007(parametros);
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
		 CMP00004(autGetDataFlow().autGetParameters(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
		 CMP00014(autGetDataFlow().autGetParameters(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));		 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
		 AUT_AGENT_SILK4J.<DomCheckBox>find("VA.AtualizacaoDados.FlagPagamentoLoja").click();  
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();	 
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001));
		 CMP00022();		
	}
}