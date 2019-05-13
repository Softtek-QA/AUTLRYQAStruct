package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;


public class CTR00001 extends AUTVABaseComponent {
	

	public static String AUT_NUMERO_PEDIDO;
	/**
	 * 
	 * 
	 * CTR00001 - Criação de pedido Televendas
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoTelevendas() {
		 autGetDataFlow().autInitDataFlow();
		 
		 autGetDataFlow().autInitDataFlow();
			java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
			parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00008_CTR00001);
			parameters.remove("AUT_NUMERO_PEDIDO");
			parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		 
		 
		 CMP00002(parameters);
		 CMP00037(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 CMP00012(parameters);
		 CMP00004(parameters);
		 CMP00014(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(parameters);
		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 
		 String pedido = CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00008_CTR00001)).AUT_NUMERO_PEDIDO;
		 autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00001_CN00008_CTP00001, "AUT_NUMERO_PEDIDO", pedido);
		
		 AUTProjectsFunctions.aguardaTempo(5000);
		 
		 CMP00022();		
	}
}