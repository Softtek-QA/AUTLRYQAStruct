package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR00001 extends AUTVABaseComponent {
	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void ctr88() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTR00001);
		
		 
		 CMP00002(parameters);
	//	 CMP00037(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 CMP00012(parameters);
		 CMP00004(parameters);
		 CMP00014(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00020(parameters).autMeioDePagamentoSimples(parameters);
		 String pedido = CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTR00001)).AUT_NUMERO_PEDIDO;
		 autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001, "AUT_NUMERO_PEDIDO", pedido);
		 System.out.println("Pedido na tabela no CTP"+autGetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001, "AUT_NUMERO_PEDIDO"));
		 System.out.println("Pedido na tabela no CTP"+autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTR00001,"AUT_NUMERO_PEDIDO"));		 
		 CMP00022();	
	}
}
