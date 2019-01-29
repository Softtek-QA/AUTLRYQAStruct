package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055;

import org.junit.Test;

import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVACadastros.AUT_VA_ESTADOS;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import com.borland.silktest.jtf.xbrowser.DomLink;

/**
 * 
 * 
 * CTP00001 - Pedido Televendas pagamento Cart Créd e Apro. Auto. antifraude
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp55() {

		autGetDataFlow().autInitDataFlow();

		CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));
		AUT_AGENT_SILK4J.<DomElement>find("Boitata.MenuLogOff.estado").click();
		AUT_AGENT_SILK4J.<DomElement>find("Boitata.MenuLogOff.Opcao1").click();
		CMP00069(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00055_CTP00001));
		AUT_AGENT_SILK4J.<AccessibleControl>find("Boitata.Fechar2").click();

	}
}
