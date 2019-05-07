package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00052;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTP00001 - Pedido Televendas pagamento Cart Créd 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp52() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00052_CTP00001);;

		
		CMP00002(parameters);
		CMP00009(parameters);
		CMP00008(parameters);
		CMP00012(parameters);
		CMP00004(parameters);
		CMP00014_CPF(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	
		AUT_AGENT_SILK4J.<DomTextField>find("VA.AtualizacaoDados.eanOrCode").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.AtualizacaoDados.eanOrCode").setText(parameters.get("AUT_EAN_OR_CODE").toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaInicialLoja.ItemMassa").click();
		
	    AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();			
	    CMP00016(parameters);
	    AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();			
	    CMP00020(parameters).autSelecaoMeioPagamento(parameters);
	    CMP00034(parameters);
	    CMP00022();	

	}
}
