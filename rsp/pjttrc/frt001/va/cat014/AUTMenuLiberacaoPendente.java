package br.lry.qa.rsp.pjttrc.frt001.va.cat014;

import java.util.HashMap;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;

import br.lry.components.AUTVABaseComponent;
import com.borland.silktest.jtf.xbrowser.DomTextField;

public class AUTMenuLiberacaoPendente extends AUTVABaseComponent {
	
	


	/**
	 * Menu Liberação Pendentes 
	 * @return - Verdadeiro caso clicar no menu Liberação Pendentes
	 */
	public boolean autBuscaAntifraude(HashMap<String, Object> parametros) {
		try {
			AUT_AGENT_SILK4J.<DomElement>find("VA.TelaInicialLoja.Menu").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendetes.MenuLiberacaoPendentes").click();
			AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendetes.NumeroPedido").typeKeys(parametros.get("AUT_NUMERO_ANTIFRAUDE").toString());
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacasoPendetes.BotaoPesquisar").click();
			
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
	}	
		
		/**
		 * Acessar o monitor liberação Antifraude - Aprovação
		 * @return  Verdadeiro para a aprovação antifraude
		 */
		public boolean autMonitorAntiFraudeAprovacao(HashMap<String, Object> parametros) {
			try {
				
				AUT_AGENT_SILK4J.<DomElement>find("VA.PesquisaCEP.Fechar").click();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.menu").click();
				AUT_AGENT_SILK4J.<DomLink>find("VA.LiberacaoPendentes.MenuLiberacaoPendentes").click();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AntiFraude").click();
				AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumPedido").setFocus();
				AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumPedido").setText(parametros.get("AUT_NUMERO_PEDIDO").toString());
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.BotaoPesquisar").click();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AprovarSemAntiFraude").setFocus();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AprovarSemAntiFraude").click();
					if(AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.PopDesconto").isVisible()) {
						AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.SimDesconto").click();
					}
			return true;
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return false;
			}
		}
		
		
		/**
		 * Acessar o monitor liberação Antifraude - Reprovação
		 * @return Verdadeiro para Reprovação antifraude
		 */
		public boolean autMonitorAntiFraudeReprovacao(HashMap<String, Object> parametros) {

			try {
				AUT_AGENT_SILK4J.<DomElement>find("VA.PesquisaCEP.Fechar").click();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.menu").click();
				AUT_AGENT_SILK4J.<DomLink>find("VA.LiberacaoPendentes.MenuLiberacaoPendentes").click();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AntiFraude").click();
				AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumPedido").setFocus();
				AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumPedido").setText(parametros.get("AUT_NUMERO_PEDIDO").toString());
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.BotaoPesquisar").click();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.Reprovar").setFocus();
				AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.Reprovar").click();
					if(AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.PopDesconto").isVisible()) {
						AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.SimDesconto").click();
					}
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				return false;
			}
		}

		/**
	 * Acessa o monitor liberação Antifraude - Reprovação
	 * @return true Reprovação
	 */
	public boolean monitorAprovacaoComercialAprovar(HashMap<String, Object> parametros) {

		try {
			AUT_AGENT_SILK4J.<DomElement>find("VA.PesquisaCEP.Fechar").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.menu").click();
			AUT_AGENT_SILK4J.<DomLink>find("VA.LiberacaoPendentes.MenuLiberacaoPendentes").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.Desconto").click();
			AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumPedido").setFocus();
			AUT_AGENT_SILK4J.<DomTextField>find("VA.LiberacaoPendentes.NumPedido").setText(parametros.get("AUT_NUMERO_PEDIDO").toString());
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.BotaoPesquisar").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.Pedido").setFocus();
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.Pedido").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AprovarDesconta").setFocus();
			AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.AprovarDesconta").click();
			//if(AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes").exists("PopDesconto", 10000)){
				if(AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.PopDesconto").isVisible()) {
					AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.SimDesconto").click();
					//AUT_AGENT_SILK4J.<DomElement>find("VA.LiberacaoPendentes.SimDesconto").click();
					
				}
				
				
		//	}
			
			

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	

}

	

