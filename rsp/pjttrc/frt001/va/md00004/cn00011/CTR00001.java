package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00011;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTR00001 - Pedido Televendas pag Cart Créd e Vale Troca
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTR00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;

	public void ctr000011() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00011_CTR00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);


		CMP00002(parameters);
		CMP00037(parameters); // incluído		
		CMP00009(parameters);
		CMP00008(parameters);
		CMP00012(parameters);
		CMP00014_CPF(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		CMP00024(parameters).autDescontoSecao(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		
		CMP00016(parameters);
		
		CMP00020(parameters).autVAMultiplosMeiosPagamentoTelevendas(parameters);
		
		String numPedido = CMP00034(parameters).AUT_NUMERO_PEDIDO;
		
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00011_CTR00001, "AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
	    
		CMP00022();		

	}
}
