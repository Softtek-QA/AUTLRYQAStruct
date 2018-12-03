
package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat016.AUTFinalizarPedidoVA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR00001 extends AUTVABaseComponent {
	
	/**
	 * 
	 * 
	 * CTR00001 - Realizar um pedido no VA Hybris
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoVAHybris() {
		 autGetDataFlow().autInitDataFlow();
		 CMP00001(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001));
		 CMP00036(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001));
		 CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001));
		 CMP00011(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001));
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001));
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 String pedido = CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTR00001)).AUT_NUMERO_PEDIDO;
		 autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001, "AUT_NUMERO_PEDIDO", pedido);
		 CMP00022();		
	}	

}
