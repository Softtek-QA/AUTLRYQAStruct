package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.microfocus.silktest.jtf.swing.JFrame;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVACadastros.AUT_VA_ESTADOS;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.win32.AccessibleControl;

/**
 * 
 * 
 * CTP00001 - REALIZAR_PEDIDO_ATRAVES_DO_ECOMMERCE
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp54() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00054_CTP00001);
		
		CMP00002(parameters);
	
		//pesquisa material no boitata
		CMP00009_2(parameters);
	
		//Seleciona loja no boitata	
		CMP00082(parameters);

		//Cria pedido no Boitata - Ecommerce
		CMP00068(parameters);

		//Logout
		CMP00023_2();

}
}