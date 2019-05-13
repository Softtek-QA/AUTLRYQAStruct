package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;

/**
 * 
 * 
 * CTR00001 - Pedido Televendas pag Cart Créd e Voucher
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTR00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;
	
	public void ctr000006() {
		autGetDataFlow().autInitDataFlow();
		
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTR00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		
		CMP00002(parameters);
		CMP00037(parameters);		
		CMP00009(parameters);
		CMP00008(parameters);
		CMP00012(parameters);
		
		CMP00004(parameters); // incluído
		
		CMP00014_CPF(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		CMP00016(parameters);
		//CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00006_CTR00001)).autVAMultiplosMeiosPagamentoTelevendas(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00006_CTR00001));
		//AUT_AGENT_SILK4J.<DomCheckBox>find("VA.TelaMeioPagamento.IgnAntiFraude").click();
		CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		    
	    String numPedido = CMP00034(parameters).AUT_NUMERO_PEDIDO;
	    
	    autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00006_CTR00001, "AUT_NUMERO_PEDIDO", numPedido);
	    	    
	    AUTProjectsFunctions.aguardaTempo(5000);
        
		CMP00022();	
	
	}
}

