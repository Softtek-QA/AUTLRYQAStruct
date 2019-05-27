package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00053;

import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat016.AUTFinalizarPedidoVA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTP00001 extends AUTVABaseComponent {

	private Object AUT_NUMERO_PEDIDO;
	
		/**
		 * 
		 * CN00053 - Realizar um pedido através do canal de Televendas
		 * 
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */	
	@Test	
	public void autCopiaPedido() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00053_CTP00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		 CMP00002(parameters);

		 CMP00037(parameters);

		 CMP00009(parameters);

		 CMP00008(parameters);

		 CMP00012(parameters);

		 CMP00014(parameters);

		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		 CMP00016(parameters);

		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);

		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").click();

		 CMP00034(parameters);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00053_CTP00001, "AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		 CMP00022();
	}
}
