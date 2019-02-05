package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00059;

import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat007.AUTFluxoSaida.AUT_VA_FLUXO_SAIDA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTP00001 - Realizar o pedido em uma loja e retirar em outra
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void cn00059() {
	autGetDataFlow().autInitDataFlow();
	java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
	parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00059_CTP00001);
	parameters.remove("AUT_NUMERO_PEDIDO");
	parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);		
	CMP00002(parameters);
	CMP00009(parameters);
	CMP00008(parameters);
	CMP00012(parameters);
	CMP00004(parameters);
	CMP00014(parameters);
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	AUT_AGENT_SILK4J.<DomRadioButton>find("VA.FluxoSaida.Entrega").click();
	CMP00004(parameters);
	AUT_AGENT_SILK4J.<DomLink>find("VA.FluxoSaida.ListaEndereco").click();
	AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.PopUpFreteAdicional").click();	
	AUT_AGENT_SILK4J.<DomCheckBox>find("VA.FluxoSaida.FlagEncomenda").click();	
//	AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.FilialEstoque").select("0014 - CD SAO BERNARDO");
	DomListBox listTurno = AUT_AGENT_SILK4J.<DomListBox>find("VA.ConfirmacaoLogin.Turno");
	selectValor(listTurno);		
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	CMP00020(parameters).autSelecaoMeioPagamento(parameters);
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	CMP00034(parameters);	
	CMP00022();

	}
}


