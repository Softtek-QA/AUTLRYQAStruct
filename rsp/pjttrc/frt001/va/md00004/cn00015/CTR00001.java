
package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015;
import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR00001 extends AUTVABaseComponent {
	
	public  static String AUT_NUMERO_PEDIDO;
/**
 * 
 * 
 * CTR00001 - Criação de pedido Televendas
 * @param parametro - Parametros de entrada do sistema
 * @return
 */

	public void ctr00015() {
		autGetDataFlow().autInitDataFlow();
		 
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTR00001);
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

	    CMP00016(parameters);
		CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		String pedido = CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTR00001)).AUT_NUMERO_PEDIDO;
	   
		autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTP00001, "AUT_NUMERO_PEDIDO", pedido);
	    
		CMP00022();			 	
	}
}