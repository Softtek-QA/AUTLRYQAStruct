package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00004;

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
	public void autCadastroPF() {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
<<<<<<< HEAD
		parametros = autGetDataFlow()
				.autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00000_CN00001_CTP00001);
=======
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00000_CN00004_CTP00001);
>>>>>>> branch 'new_develop' of https://github.com/Softtek-QA/AUTLRYQAStruct.git

		CMP00001(parametros);

		
		CMP00066();
		
		CMP00015(parametros);
		//CMP00022();

	}
}