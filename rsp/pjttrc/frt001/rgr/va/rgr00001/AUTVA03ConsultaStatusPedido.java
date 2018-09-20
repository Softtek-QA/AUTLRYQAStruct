/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001;

import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.win32.AccessibleControl;

import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTBaseComponent;
import br.lry.components.va.AUTVALogin;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import org.junit.Assert;

/**
 * 
 * Objetivo principal :
 * 
 *  - Consulta status do pedido - VA
 *  - Fazer levantamento de todos os status possíveis que um pedido pode ter
 * 
 * 
 * @author Softtek - QA
 *
 */
public class AUTVA03ConsultaStatusPedido extends AUTVALogin{

	/**
	 * SCRIPT DE CONSULTA DE STATUS DE PEDIDO
	 */
	@Test
	public void AUTVA03ConsultaStatusPedido(String numeroPedido, String statusPedido) {
		autStartLoginDefault();
		AUT_AGENT_SILK4J.<DomElement>find("VA.TelaInicialLoja.BotaoRecuperarPedido").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.TelaPedidos.BotaoFiltroPedido").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.TelaPedidos.OpcoesDeFiltro").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA.TelaPedidos.OpcoesDeFiltro.OpcaoNumeroPedidoVenda").select();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPedidos.OpcoesDeFiltro.InformacoesDeFiltro").setText(numeroPedido);
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaPedidos.OpcoesDeFiltro.Buscar").click();

		DomElement status = AUT_AGENT_SILK4J.<DomElement>find("VA.Validacao.Status");

		Assert.assertTrue(status.getText().contains(statusPedido));
		if(status.getText().contains(statusPedido)) {
			status.waitForProperty("Text",status.getText(), 20000);
		}
		
		AUT_AGENT_SILK4J.<DomElement>find("VA.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA.Fechar").click();
	}

}
