package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00002;

import org.junit.Test;

import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import com.borland.silktest.jtf.xbrowser.DomElement;


public class CTP00001 extends  AUTVABaseComponent {

	public  static String AUT_NUMERO_PEDIDO;
	
	/**
	 * 
	 * 
	 * CTP00001 - Pedido do canal televendas com tipo de pagamento cartão de crédito e com a opção ignorar antifraude (monitor de aprovação) ativa
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */

	public void autIgnorarAntiFraude() {
		 autGetDataFlow().autInitDataFlow();

		 java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		 parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00002_CTP00001);
		 parameters.remove("AUT_NUMERO_PEDIDO");
		 parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
			
		 CMP00002(parameters);
		 CMP00037(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 CMP00012(parameters);
		 CMP00014_CPF(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 //AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
		 CMP00016(parameters);
		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		 AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.IgnAntiFraude").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();			 

		 autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00002_CTP00001, "AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		 
		 CMP00034(parameters);	
		 CMP00022();		 
	}

}
