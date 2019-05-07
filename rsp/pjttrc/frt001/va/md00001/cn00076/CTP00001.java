package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00076;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


/**
 * Realizar um pedido com solicitação de serviço
 * @param parametros de entrada 
 * 
 */

public class CTP00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void cn76() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00076_CTP00001);
		
		CMP00002(parameters);

		CMP00009(parameters);

		CMP00008(parameters);

		CMP00012(parameters);

		CMP00004(parameters);

		CMP00014(parameters);

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		CMP00016(parameters);		 
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.MeioPagamento").doubleClick();
		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.MeioPagamento").select(parameters.get("AUT_MEIO_PAGAMENTO").toString());

		DomListBox listCombo = AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.Codigo_Voucher_VALETROCA");				
		listCombo.getItemCount();
		selectValor(listCombo, parameters.get("AUT_CODE_VALE_TROCA").toString());

		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaMeioPagamento.PlanoPagamento").select(parameters.get("AUT_PLANO_PAGAMENTO").toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").click();
			 
		autInsertScreenByScenario();


		 CMP00034(parameters);

		 CMP00022();
		 
	}
	}
	

