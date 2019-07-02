package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003;

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

import br.lry.components.AUTPDVBaseComponent;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CTP00003 extends AUTPDVBaseComponent {
	
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
	public void PagaPedidoPDV(String numPedido) {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_PDV_MD00012_CN00003_CTP00003);

		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", numPedido);
		
		CMP00090(parametros);
		
		CMP00091(parametros);
		
		AUT_STATUS_ESPERADO = "Pago";
		AUT_NUMERO_PEDIDO = numPedido;
		 
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00003_CTP00004, "AUT_STATUS_ESPERADO",AUT_STATUS_ESPERADO);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00003_CTP00004, "AUT_NUMERO_PEDIDO",AUT_NUMERO_PEDIDO);
		
		CMP00096(parametros);
	}
}