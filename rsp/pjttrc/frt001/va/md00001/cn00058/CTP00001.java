package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00058;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;



public class CTP00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTP00001 - Realizar um pedido sem um cliente cadastrado e efetuar o cadastro de Pessoa Jurídica
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoComCadastroEstrangeiro() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00058_CTP00001);
		
		 CMP00002(parameters);
		 CMP00009(parameters);
		 CMP00008(parameters);
		 CMP00012(parameters);
		 CMP00004(parameters);

		 CMP00072(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		
		 CMP00016(parameters);
		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
		// AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00034(parameters);	
		 CMP00022();
		 
		 
	}
}
