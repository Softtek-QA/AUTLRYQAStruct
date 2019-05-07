package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


import com.borland.silktest.jtf.xbrowser.BrowserWindow;


/**
 * 
 * 
 * CTP00001 - Pedido que usa mais de uma modalidade de frete 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp71() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001);
		
		CMP00002(parameters);

		//CMP00009(parameters);

		//CMP00008(parameters);

		//CMP00011(parameters);
		
		 //incluido
		 CMP00070(parameters).autVAIncluirItensNoCarrinho(parameters);
		
		//CMP00004(parameters);
    
		//CMP00014(parameters);
    
		CMP00012(parameters);
    
		CMP00004(parameters);
    
		CMP00014(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 

		CMP00080(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
	
//		AUT_AGENT_SILK4J.<DomRadioButton>find("VA.AtualizacaoDados.//INPUT[@id='itementrega-0']").click();		
//		boolean statusListaEndereco = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.FluxoSaida")
//				.exists("ListaEndereco", 10000);
//		if (statusListaEndereco) {
//			AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.ListaEndereco").click();
//			autInsertScreenByScenario();
//		}
//		DomListBox listComboFrete= AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.SelecionarFrete");
//		selectValor(listComboFrete);		 
//		AUT_AGENT_SILK4J.<DomButton>find("VA.FluxoSaida.BotaoSalvar").click();
//		autInsertScreenByScenario();
//
//		 DomListBox listComboSelecaoFrete= AUT_AGENT_SILK4J.<DomListBox>find("VA.Desconto.Motivo_ITEM");
//		 selectValor(listComboSelecaoFrete);		 
//		 AUT_AGENT_SILK4J.<DomCheckBox>find("VA.FluxoSaida.DataMaisProxima").click();	
//
//		 DomListBox listComboSelecaoSaida= AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.FilialSaida");
//		 selectValor(listComboSelecaoSaida);		 
//		 DomListBox listComboEntrega= AUT_AGENT_SILK4J.<DomListBox>find("VA.ConfirmacaoLogin.Horario");
//		 selectValor(listComboEntrega);		 
//		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();	

		CMP00020(parameters).autSelecaoMeioPagamento(parameters);
			 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.TelaInicialLoja.Avancar").click();


		String numPedido = CMP00034(parameters).AUT_NUMERO_PEDIDO;
	    
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00071_CTP00001, "AUT_NUMERO_PEDIDO", numPedido);

		CMP00022();
			

	}
}
