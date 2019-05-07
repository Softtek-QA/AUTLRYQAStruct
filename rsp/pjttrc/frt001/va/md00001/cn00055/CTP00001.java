package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055;

import org.junit.Test;

import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVACadastros.AUT_VA_ESTADOS;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;

/**
 * 
 * 
 * CTP00001 - Pedido Televendas pagamento Cart Créd e Apro. Auto. antifraude
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp55() {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001);
		
		CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		CMP00037(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		CMP00009(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").mouseMove();	
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").mouseMove();	
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	
		CMP00016(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));
//		AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.SelecionaDep").setFocus();
//		AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.SelecionaDep").select(1);		

		CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").mouseMove();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").mouseMove();
//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	
//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").mouseMove();
//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").click();

		 CMP00034(parameters);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001, "AUT_NUMERO_PEDIDO", "");

		 CMP00022();
	}
}
