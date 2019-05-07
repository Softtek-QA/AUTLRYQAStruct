package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006;

import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat002.AUTRecuperacao;
import br.lry.components.va.cat016.AUTFinalizarPedidoVA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTR00001 - Criar carrinho no VA Hybris
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void autCriaPedido() {
		 autGetDataFlow().autInitDataFlow();
		
			java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
			parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTR00001);
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
		// AUT_AGENT_SILK4J.<DomCheckBox>find("VA.TelaMeioPagamento.PagarNaLoja").click();
		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		 String pedido = CMP00034(parameters).AUT_NUMERO_PEDIDO;
		 
		 autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTP00001, "AUT_NUMERO_PEDIDO", pedido);
		 
		 CMP00022();		
	}
}