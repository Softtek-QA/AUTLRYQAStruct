package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00002;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTP00002 - Pedido do canal televendas com tipo de pagamento cartão de crédito e com a opção ignorar antifraude (monitor de aprovação) ativa
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends  AUTVABaseComponent {
	
	
	@Test
	public void cn00002() {
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00002_CTP00001));
		 CMP00009(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00002_CTP00001));
		 CMP00008();
		 CMP00012();
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00002_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AvancarPagina.Avacar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AvancarPagina.Avacar").click();
			
	
	}

}
