/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001;

import com.borland.silktest.jtf.Desktop;

import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTBaseComponent;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

/**
 * 
 * Gerador de pedidos no VA, objetivos principais:
 * 
 * -Deve gerar pedidos no com fluxo de saída variável -  Caixa, Interna Imediata e Externa Imediata
 * -Deve variar as formas de pagamento - Dinheiro e cartão
 * 
 * @author Softtek - QA
 *
 */
public class AUTVA02GeradorPedido extends AUTBaseComponent {

	private Desktop desktop = new Desktop();

	

	
	@Test
	public void AUTVA02GeradorPedido() {
		//Ajustar a configuração da massa p/ buscar do DataFlow

		String usuario = "51011683";
		String senha = "1234";
		String quantidadeItem = "1";
		String codigoItem = "85438605";
		String cpfCliente = "78651738811";

		//autInitWebApplication();

		desktop.<DomTextField>find("VA02.Login.Usuario").setText(usuario);
		desktop.<DomTextField>find("VA02.Login.Senha").setText(senha);
		desktop.<DomElement>find("VA02.Login.Avancar").click();
		desktop.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		desktop.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		desktop.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		desktop.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		desktop.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		desktop.<DomButton>find("VA02.Pedidos.ConverterPedido").click();

		desktop.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		desktop.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		desktop.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		desktop.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();

		desktop.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		desktop.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		desktop.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		desktop.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		desktop.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		desktop.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		desktop.<DomButton>find("VA02.Pedidos.Avancar").click();

		desktop.<DomRadioButton>find("VA02.FluxoSaidaCaixa.OpcaoCaixa").select();
		desktop.<DomButton>find("VA02.FluxoSaidaCaixa.Avancar").click();
		
		//desktop.<DomListBox>find("VA02.TelaMeioPagamento.Dinheiro").select(itemIndex); //colocar enum no select
		
		
		
		
		
	}

	
	
}
