package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CN00008;

public class CTP00001 extends AUTVABaseComponent {
	
	public String AUT_NUMERO_PEDIDO;
	public String AUT_NUMERO_CARRINHO;
	
	public <TGeradorPedido extends br.lry.components.va.AUTVAGeradorPedido> TGeradorPedido ct00006V1() {		
		return (TGeradorPedido)new AUTVAGeradorPedido();
	}
	
	public void ct00006(String pedido) {
		AUT_NUMERO_PEDIDO = pedido;
		autRecuperarCarrinho();
	}
	
	/**
	 * 
	 * 
	 * CTP00001 - Criar carrinho no VA Hybris 
	 * parametro - Parametros de entrada do sistema
	 * @param
	 * @return
	 */
	@Test
	public void autRecuperarCarrinho() {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTP00001);

		parametros.remove("AUT_NUMERO_CARRINHO");		
		parametros.put("AUT_NUMERO_CARRINHO", AUT_NUMERO_CARRINHO );
		//parametros.put("AUT_NUMERO_PEDIDO", autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTP00001, "AUT_NUMERO_PEDIDO"));

	     
		 CMP00001(parametros);
		//CMP00036(parametros);
		 CMP00007(parametros);
		 CMP00012(parametros);
		 CMP00004(parametros);
		 CMP00014(parametros);		 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00016(parametros);
		// AUT_AGENT_SILK4J.<DomCheckBox>find("VA.AtualizacaoDados.FlagPagamentoLoja").click();  
		 CMP00020(parametros).autSelecaoMeioPagamento(parametros);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();	 
		 CMP00034(parametros);
		 CMP00022();		
	}
}