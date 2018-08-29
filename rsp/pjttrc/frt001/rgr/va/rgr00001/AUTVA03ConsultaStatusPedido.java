/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001;

import com.borland.silktest.jtf.Desktop;
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

	private Desktop desktop = new Desktop();

	@Test
	public void AUTVA03ConsultaStatusPedido() {

		//start recording 
		desktop.<DomElement>find("VA.TelaInicialLoja.BotaoFecharAprovacaoComercial").click();
		desktop.<DomElement>find("VA.TelaInicialLoja.BotaoRecuperarCarrinho").click();
		desktop.<DomElement>find("VA.PesquisarCarrinhos.BotaoFiltroCarrinho").click();
		desktop.<DomElement>find("VA.PesquisarCarrinhos.OpcoesDeFiltro").click();
		desktop.<DomTextField>find("VA.PesquisarCarrinhos.OpcoesDeFiltro.InformacoesDeFiltro").setText("0000218387");
		desktop.<DomButton>find("VA.PesquisarCarrinhos.OpcoesDeFiltro.Buscar").click();
		DomElement emEdição = desktop.<DomElement>find("VA.CadastroClientesDados.Em edição");
		Assert.assertEquals("Em edição", emEdição.getText());
		//end recording
		
		
		
		

	}
	

}
