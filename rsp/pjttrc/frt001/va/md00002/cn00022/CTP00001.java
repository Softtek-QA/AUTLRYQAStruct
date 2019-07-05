package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00022;

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
* CTP00001 - Realizar orçamento desc pont R$ na seção com itens eleg p rateio
* @param parametro - Parametros de entrada do sistema
* @return
*/
	@Test
	public void cn22() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00022_CTP00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		CMP00002(parameters);
		CMP00009(parameters);
		CMP00008(parameters);		
		//CMP00011(parameters);
		CMP00061(parameters);
		CMP00004(parameters);
		
		CMP00014_CPF(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		CMP00024(parameters).autDescontoSecao(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		CMP00016(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		
		
		CMP00034(parameters);
		
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00022_CTP00001, "AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		 		
		CMP00022();
		
}


}

