package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00004;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;

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
	public void cn4() {
		
				
		 
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00004_CTP00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		
		CMP00002(parameters);
		CMP00009(parameters);
		CMP00008(parameters);
		CMP00011(parameters);
		
		
		CMP00012(parameters);
		CMP00004(parameters);
		CMP00014(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		CMP00017();
		CMP00024(parameters).autDescontoSecao(parameters);
		
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		
		CMP00016(parameters);
		CMP00019(parameters);
		
		CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00011_CTP00001));	
		 CMP00022();
		}
	}
	

