package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00013;

import java.awt.Button;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.BrowserWindow;
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

	@Test
	public void cn13() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00013_CTP00001);
	
		
		CMP00002(parameters);
		CMP00009(parameters);
		CMP00008(parameters);
		
		AUT_AGENT_SILK4J.<DomButton>find("VA.Pedidos.MaisQtd").click();
		CMP00012(parameters);
		CMP00004(parameters);
		CMP00014(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		//Fecha janela de aviso de falta de estoque Top0 e/ou AVS
		if(AUT_AGENT_SILK4J.<BrowserWindow>find("VA.LiberacaoPendentes").exists("Pedido", 5000)) {
			String msg = AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.Pedido").getText();
			
			if(msg.matches(".*sem estoque.*")) {
				autInsertScreenByScenario();
				AUT_AGENT_SILK4J.<DomButton>find("VA.Desconto.OkDesconto").click();
			}		
		}
		
		CMP00022();

		}
	}
	

