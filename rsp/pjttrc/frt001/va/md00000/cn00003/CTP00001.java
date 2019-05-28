package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00003;

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

public class CTP00001 extends AUTVABaseComponent {
	
	
	/**
	 * 
	 * 
	 * CTP00001 - Pedido Televendas com loja diferente do pedido e depois copiando *  
	 * parametro - Parametros de entrada do sistema
	 * @param
	 * @return
	 */
	@Test
	public void autCadastroEstrangeiro() {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow()
				.autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00000_CN00001_CTR00001);

		autGetDataFlow().autInitDataFlow();
		CMP00001(parametros);

		
		//start recording 
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.FechaJanelaComentario").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.AtualizacaoDados.menu-trigger relativ").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.TelaInicialLoja.SubMenuClientes").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA.CadastroClientesDados.AdicionarNovo").click();
		//end recording
		
		CMP00072(parametros);
		//CMP00022();

	}
}