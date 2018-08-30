/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001;

import org.junit.After;
import org.junit.Test;

import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.va.AUTVALogin;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;

import com.borland.silktest.jtf.win32.AccessibleControl;

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


public class AUTVA02GeradorPedido extends AUTVALogin {

	private Desktop AUT_AGENT_SILK4J = new Desktop();


	public enum AUT_VA_MEIOS_PAGAMENTO{
		CARTAO_CREDITO,
		CARTAO_CELEBRE,
		POS_CREDITO,
		FINANCEIRA_CDC,
		DINHEIRO,
		CARTAO_DEBITO,
		POS_DEBITO,
		CHEQUE,
		VOUCHER,
		VALE_TROCA;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			switch(this) {
			case CARTAO_CREDITO: {
				return "C. CRÉDITO";
			}
			case CARTAO_CELEBRE: {
				return "CARTAO CELEBRE";
			}
			case POS_CREDITO: {
				return "POS CRÉDITO";
			}
			case FINANCEIRA_CDC: {
				return "FINANCEIRA CDC";
			}
			case DINHEIRO: {
				return "DINHEIRO";
			}
			case CARTAO_DEBITO: {
				return "C. DÉBITO";
			}
			case POS_DEBITO: {
				return "POS DÉBITO";
			}
			case CHEQUE: {
				return "CHEQUE";
			}
			case VOUCHER: {
				return "VOUCHER";
			}
			case VALE_TROCA: {
				return "VALE TROCA";
			}
			}
			
			return super.toString();
		}
	}

	
	public enum AUT_VA_PLANO_PAGAMENTO{
		A_VISTA,
		SEM_JUROS_1X,
		SEM_JUROS_CELEBRE_2X;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			switch(this) {
			case A_VISTA: {
				return "A VISTA";
			}
			case SEM_JUROS_1X: {
				return "1X SEM JUROS";
			}
			case SEM_JUROS_CELEBRE_2X: {
				return "2X SEM JUROS CELEBRE";
			}
			}
			return super.toString();
		}
	}
	
	
	//Test
	public enum AUT_VA_TIPO_RETIRADA{
		REITRADA_EXTERNA_AGENDADA,
		REITRADA_EXTERNA_IMEDIATA,
		REITRADA_INTERNA_AGENDADA,
		REITRADA_INTERNA_IMEDIATA;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			switch (this) {
			case REITRADA_EXTERNA_AGENDADA: {
				return "Retira externa agendada";
			}
			case REITRADA_EXTERNA_IMEDIATA: {
				return "Retira externa imediata";
			}
			case REITRADA_INTERNA_AGENDADA: {
				return "Retira interna agendada";
			}
			case REITRADA_INTERNA_IMEDIATA: {
				return "Retira interna imediata";
			}
			}
			return super.toString();
		}
	}
	
	String usuario = autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_USUARIO_LOJA").toString();
	String senha = autGetCurrentParameter("AUT_SENHA").toString();
	String quantidadeItem = autGetCurrentParameter("AUT_QUANTIDADE_ITEM").toString();
	String codigoItem = autGetCurrentParameter("AUT_CODIGO_ITEM").toString();
	String cpfCliente = autGetCurrentParameter("AUT_CPF_CLIENTE_CADASTRADO").toString();

	
	
	

	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA CAIXA E MEIO DE PAGAMENTO DINHEIRO
	 */
	public void autCaixaPagDinheiro() {

		autStartLoginDefault(usuario, senha);

		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoCaixa").select();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento")
				.select(AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento")
				.select(AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
	}
	

	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA CAIXA E MEIO DE PAGAMENTO CARTAO CELEBRE
	 */
	public void autCaixaPagCartaoCelebre() {

		autStartLoginDefault(usuario, senha);

		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoCaixa").select();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento")
				.select(AUT_VA_MEIOS_PAGAMENTO.CARTAO_CELEBRE.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento")
				.select(AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
	}
	
	
	
	
	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA CAIXA E MEIO DE PAGAMENTO CARTAO CREDITO
	 */
	public void autCaixaPagCartaoCredito() {
		
		autStartLoginDefault(usuario, senha);
		
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoCaixa").select();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");	
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();	
	}
	

	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA INTERNA IMEDIATA E MEIO DE PAGAMENTO DINHEIRO
	 */
	public void autRetiraInternaImediataPagDinheiro() {
		
		autStartLoginDefault(usuario, senha);
		
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoRetirada").select();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.TipoRetirada").select(AUT_VA_TIPO_RETIRADA.REITRADA_INTERNA_IMEDIATA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");	
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();	
	}
	

	

	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA INTERNA IMEDIATA E MEIO DE PAGAMENTO CARTAO CELEBRE
	 */
	public void autRetiraInternaImediataPagCartaoCelebre() {

		autStartLoginDefault(usuario, senha);
		
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoRetirada").select();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.TipoRetirada").select(AUT_VA_TIPO_RETIRADA.REITRADA_INTERNA_IMEDIATA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.CARTAO_CELEBRE.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");	
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
	}
	
	
	
	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA INTERNA IMEDIATA E MEIO DE PAGAMENTO CARTAO CREDITO
	 */
	public void autRetiraInternaImediataPagCartaoCredito() {
		
		autStartLoginDefault(usuario, senha);
		
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoRetirada").select();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.TipoRetirada").select(AUT_VA_TIPO_RETIRADA.REITRADA_INTERNA_IMEDIATA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");	
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
	}
	
	

	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA EXTERNA IMEDIATA E MEIO DE PAGAMENTO DINHEIRO
	 */
	public void autRetiraExternaImediataPagDinheiro() {
		
		autStartLoginDefault(usuario, senha);
		
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoRetirada").select();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.TipoRetirada").select(AUT_VA_TIPO_RETIRADA.REITRADA_EXTERNA_IMEDIATA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");	
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
	}
	
	
	@Test
		/*
		 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA EXTERNA IMEDIATA E MEIO DE PAGAMENTO CARTAO CREDITO
		 */
		public void autRetiraExternaImediataPagCartaoCelebre() {
			
			autStartLoginDefault(usuario, senha);
			
			AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
			AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
			AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
			AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
			AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
			AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
			AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
			AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
			AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
			AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
			AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
			AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
			AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
			AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
			AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoRetirada").select();
			AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.TipoRetirada").select(AUT_VA_TIPO_RETIRADA.REITRADA_EXTERNA_IMEDIATA.toString());
			AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
			AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
			AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.CARTAO_CELEBRE.toString());
			AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
			AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString());
			AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
			AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
			AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
			AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");	
			AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
			AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
		}	
	

	@Test
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA EXTERNA IMEDIATA E MEIO DE PAGAMENTO CARTAO CREDITO
	 */
	public void autRetiraExternaImediataPagCartaoCredito() {
		
		autStartLoginDefault(usuario, senha);
		
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaInicialLoja.FecharPopUpAprovacaoComercial").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA02.TelaInicialLoja.CriarCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.QuantidadeItem").setText(quantidadeItem);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.TelaInicialLoja.CodigoItem").setText(codigoItem);
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaInicialLoja.PesquisarProduto").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").clearText();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Usuario").setText(usuario);
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.ConfirmacaoLogin.Senha").setText(senha);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.ConfirmacaoLogin.Avancar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.IconeModoDePesquisa").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ItemCPF_CNPJ").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA02.PesquisaClienteCadastrado.CampoPesquisaCliente").setText(cpfCliente);
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.BotaoPesquisarCliente").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.PesquisaClienteCadastrado.ClientePesquisado").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaCliente.AvancarTelaCliente").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.Avancar").click();
		AUT_AGENT_SILK4J.<DomRadioButton>find("VA02.FluxoSaida.OpcaoRetirada").select();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.TipoRetirada").select(AUT_VA_TIPO_RETIRADA.REITRADA_EXTERNA_IMEDIATA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.FluxoSaida.Avancar").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADORPEDIDOS001");	
		AUT_AGENT_SILK4J.<DomElement>find("VA02.FinalizarAplicacao.Sair").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("VA02.Fechar").click();
	}	
	
	
}
