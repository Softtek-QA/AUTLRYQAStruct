package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;

/**
 * 
 * 
 * CTR00001 - Pedido Televendas pag Cart Créd e Vale Troca
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTR00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;
	
	
	public void ct00013() {
	autGetDataFlow().autInitDataFlow();
	
	java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
	parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00013_CTR00001);
	parameters.remove("AUT_NUMERO_PEDIDO");
	parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
	
	CMP00002(parameters);
	CMP00009(parameters);
	CMP00008(parameters);
	CMP00012(parameters);
	CMP00004(parameters);
	CMP00014_CPF(parameters);
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

	CMP00016(parameters);
	
	CMP00020(parameters).autSelecaoMeioPagamento(parameters);
	AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
	
	//if (AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento").exists("CaixaConfirmarVT" , 5000)) {
	//	AUT_AGENT_SILK4J.<DomElement>find("VA.TelaMeioPagamento.ConfirmarValeTroca").click();
	//}
	
    String numPedido = CMP00034(parameters).AUT_NUMERO_PEDIDO;
    
    autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00013_CTR00001, "AUT_NUMERO_PEDIDO", numPedido);
    
    AUTProjectsFunctions.aguardaTempo(5000);
    
	CMP00022();
	}
}


