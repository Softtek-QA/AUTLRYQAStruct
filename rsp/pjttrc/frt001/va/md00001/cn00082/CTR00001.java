package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR00001 extends AUTVABaseComponent {
	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
		public void ctr82() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00082_CTP00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
				
		CMP00002(parameters);

		CMP00009(parameters);

		AUT_AGENT_SILK4J.<DomElement>find("VA.TelaInicialLoja.BotaoRecuperarPedido").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.PesquisaPedid").mouseMove();
		AUT_AGENT_SILK4J.<DomElement>find("VA.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.ResultadoPopupStatus").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.ResultadoPopupStatus").typeKeys("Eliminado");		
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.ResultadoPopupStatus").typeKeys("\n\t");
		//AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.ResultadoPopupStatus").typeKeys("/t");
		//AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.ResultadoPopupStatus").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.PesquisaCEP.Buscar").click();
		//AUT_AGENT_SILK4J.<DomElement>find("VA.PesquisaCEP.Buscar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.CopiaPedido").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.ManterCondicoes").click();
		//AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.Confirmar").click();
		autInsertScreenByScenario();

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		CMP00080(parameters);	

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		CMP00020(parameters).autMeioDePagamentoSimples(parameters);
	
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").click();

		CMP00034(parameters);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00082_CTP00001, "AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);

		CMP00022();
	}
}
