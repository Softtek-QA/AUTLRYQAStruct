package br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00001;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


/**
 * Excluir item do carrinho de compras
 * 
 */

public class CTP0001 extends AUTVABaseComponent {
	
	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void ctp01() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parameters = new java.util.HashMap<String, Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00007_CN00001_CTP00001);

		CMP00002(parameters);
		CMP00009(parameters);
		CMP00008(parameters);

		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.RemoverItem").click();
		
		 if(AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.PopUpConfirmar").isVisible()) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.Sim").click();
			}
			
	    CMP00022();

	}
}
