package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00010;

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
	 * CTP00001 - Realiza cadastro de cliente com um cpf invalido  
	 * parametro - Parametros de entrada do sistema
	 * @param
	 * @return
	 */
	@Test
	public void autCadastroClienteCPFInvalido() {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();

		parametros = autGetDataFlow()
				.autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00000_CN00010_CTP00001);

		CMP00001(parametros);

		CMP00066();
	
		CMP00013(parametros).autCadastroClienteCPFInvalido(parametros);
		
		CMP00022();

	}
}