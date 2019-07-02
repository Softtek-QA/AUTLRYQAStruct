package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00013;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTSafeBaseComponent;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CTP00001 extends AUTSafeBaseComponent {
	
	public static String AUT_NUMERO_PEDIDO;
	public static String AUT_STATUS_ESPERADO;
	
	/**
	 * 
	 * 
	 *  
	 * parametro - Parametros de entrada do sistema
	 * @param
	 * @return
	 */
	@Test
	public void GeraVoucherPJ() {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_SAFE_MD00012_CN00013_CTP00001);
		
		CMP00093(parametros);
		
		CMP00098(parametros).autIniCadastroClienteConveniadoPJ(parametros);

		CMP00099(parametros).autIniAssocClienteConveniadoPJ( parametros ); // Gera voucher
		
		CMP00095();

	}
}