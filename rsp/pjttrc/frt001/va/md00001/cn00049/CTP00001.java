package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00049;

import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat009.AUTMeiosPagamento;
import br.lry.components.va.cat016.AUTFinalizarPedidoVA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTP00001 extends AUTVABaseComponent {

		/**
		 * 
		 * CTP000001 - Realizar um pedido com pagamento Vale Troca
		 * 
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */	
	@Test	
	public void autCopiaPedido() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00049_CTP00001);

		 CMP00002(parameters);

		 CMP00037(parameters);

		 CMP00009(parameters);

		 CMP00008(parameters);

		 CMP00012(parameters);

		 CMP00004(parameters);

		 CMP00014_CPF(parameters);

		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		 CMP00016(parameters);

//		 AUT_AGENT_SILK4J.<DomListBox>find("VA.Desconto.Motivo_ITEM").select(AUTMeiosPagamento.AUT_VA_MEIOS_PAGAMENTO.VALE_TROCA.toString());
//		 AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.Codigo_Voucher_VALETROCA_01").select(1);

		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").mouseMove();
//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
//
//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Confirmar").click();
//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").click();

		 CMP00034(parameters);
		 autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00049_CTP00001, "AUT_NUMERO_PEDIDO","");
		 CMP00022();
	}
}
