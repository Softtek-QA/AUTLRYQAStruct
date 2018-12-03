package br.lry.qa.rsp.pjttrc.frt001.va.cat011;

import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;

import br.lry.components.AUTVABaseComponent;

public class AUTLogOffVA extends AUTVABaseComponent {

	
	/**
	 * Realiza LogOff no sistema VA
	 * @return - Verdadeiro para LogOff realizado
	 */
	public boolean autRealizarLogOff() {
		try {
			
			AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
			AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
			
			
			boolean status = AUT_AGENT_SILK4J.<BrowserApplication>find("VA02").exists("Fechar", 1000*5);
			if(status) {
				
				AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
				
			}
			
			return true;
		}
		catch(java.lang.Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}
}
