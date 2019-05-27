package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00024;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTP0001 extends AUTVABaseComponent {
	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
		public void cn24() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00024_CTP00001);
			
		 
		CMP00002(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 
		 CMP00061(parameters);
		 CMP00004(parameters);
		 CMP00014_CPF(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00024(parameters).descontoNormal(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(parameters); 
		
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click(); // meio de pagto
		
		 //CMP00020(parameters);
		
		CMP00034(parameters);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00024_CTP00001, "AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO); 
		 
		 CMP00022();
	}
}
