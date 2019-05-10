
package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat016.AUTFinalizarPedidoVA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;


public class CTR00001 extends AUTVABaseComponent {
	
	public  static String AUT_NUMERO_PEDIDO;
	
	/**
	 * 
	 * 
	 * CTR00001 - Realizar um pedido no VA Hybris
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void ctr00017() {
		 autGetDataFlow().autInitDataFlow();
		 
			java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
			parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001);
			parameters.remove("AUT_NUMERO_PEDIDO");
			parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
			 
			CMP00002(parameters);
			CMP00009(parameters);
			CMP00008(parameters);
			CMP00012(parameters);
			CMP00004(parameters);
			CMP00014_CPF(parameters);
			AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		    AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		    CMP00016(parameters);
			CMP00020(parameters).autSelecaoMeioPagamento(parameters);
			AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
			
			String pedido = CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001)).AUT_NUMERO_PEDIDO;
			autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001, "AUT_NUMERO_PEDIDO", pedido);
		    
		    AUTProjectsFunctions.aguardaTempo(5000);			
			
			CMP00022();		
				
	}	

}
