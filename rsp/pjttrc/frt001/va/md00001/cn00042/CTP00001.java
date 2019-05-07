package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00042;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat007.AUTFluxoSaida;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTP00001 - Pedido com entrega expressa
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp42() {
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00042_CTP00001);
		
		
		autGetDataFlow().autInitDataFlow();
		CMP00002(parameters);

		CMP00037(parameters);

		CMP00009(parameters);

		CMP00008(parameters);

		CMP00012(parameters);

		CMP00004(parameters);

		CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00042_CTP00001));

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	    AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	    AUT_AGENT_SILK4J.<DomRadioButton>find("VA.FluxoSaida.Entrega").select();

	    AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.ListaEndereco").click();

		AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.PopUpFreteAdicional").click();

		AUT_AGENT_SILK4J.<DomListBox>find("VA.Desconto.Motivo_ITEM").click();

		AUT_AGENT_SILK4J.<DomListBox>find("VA.Desconto.Motivo_ITEM").select(AUTFluxoSaida.AUT_VA_TIP_FRETE.ECONOMICA.toString());

		AUT_AGENT_SILK4J.<DomListBox>find("VA.Desconto.Motivo_ITEM").click();

		AUT_AGENT_SILK4J.<DomListBox>find("VA.ConfirmacaoLogin.Horario").select(1);

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	    CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00041_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00041_CTP00001));

	    AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00041_CTP00001));

		CMP00022();	 
	}
}
