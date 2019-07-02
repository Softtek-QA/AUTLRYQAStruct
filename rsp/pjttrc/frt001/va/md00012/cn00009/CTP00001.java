package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009;

import java.util.HashMap;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;

public class CTP00001 extends AUTVABaseComponent {
	
	public  static String AUT_NUMERO_PEDIDO;
	public static String AUT_STATUS_ESPERADO;
	
	/**
	 * CTP00001 - Cria pedido de acordo com o que cenário solicita
	 * parametro - Parametros de entrada do sistema
	 * @param
	 * @return
	 */
	@Test
	public void CriaPedido() {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00009_CTP00001);

		CMP00002(parametros);
		CMP00009(parametros);
		CMP00008(parametros);
		CMP00012(parametros);
		CMP00004(parametros);
		
		CMP00014_CPF(parametros);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 
		CMP00016(parametros);
		
		CMP00020(parametros).autSelecaoMeioPagamento(parametros);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
			
		AUT_NUMERO_PEDIDO = CMP00034(parametros).AUT_NUMERO_PEDIDO;
		
		AUT_STATUS_ESPERADO = "Aguardando liberação de pagamento";
		 
		CMP00022();	

	}
}