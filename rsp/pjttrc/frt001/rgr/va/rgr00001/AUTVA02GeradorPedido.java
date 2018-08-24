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
		SEM_JUROS_1X;
		
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
			}
			return super.toString();
		}
	}
	
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
	public void AUTVA02GeradorPedido() {
		autFluxoSaidaCaixaPagamentoDinheiro();
		autFluxoSaidaCaixaPagamentoCartao();
		autFluxoSaidaRetiraInternaImediataPagamentoDinheiro();
		autFluxoSaidaRetiraInternaImediataPagamentoCartao();
		autFluxoSaidaRetiraExternaImediataPagamentoDinheiro();
		autFluxoSaidaRetiraExternaImediataPagamentoCartao();
		
	}
	
	
	
	
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA CAIXA E MEIO DE PAGAMENTO DINHEIRO
	 */
	public void autFluxoSaidaCaixaPagamentoDinheiro() {
		
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
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.MeioPagamento").select(AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString());
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA02.TelaMeioPagamento.PlanoPagamento").select(AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaMeioPagamento.Avancar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA02.TelaResumo.Finalizar").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA02.TelaResumo.FecharPopUp").click();
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADOR_PEDIDO001");	
	}
	

	
	
	
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA CAIXA E MEIO DE PAGAMENTO CARTAO
	 */
	public void autFluxoSaidaCaixaPagamentoCartao() {
		
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
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADOR_PEDIDO001");	
		
	}
	

	
	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA INTERNA IMEDIATA E MEIO DE PAGAMENTO DINHEIRO
	 */
	public void autFluxoSaidaRetiraInternaImediataPagamentoDinheiro() {
		
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
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADOR_PEDIDO001");	
		
	}
	

	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA INTERNA IMEDIATA E MEIO DE PAGAMENTO CARTAO
	 */
	public void autFluxoSaidaRetiraInternaImediataPagamentoCartao() {
		
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
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADOR_PEDIDO001");	
		
	}
	
	

	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA EXTERNA IMEDIATA E MEIO DE PAGAMENTO DINHEIRO
	 */
	public void autFluxoSaidaRetiraExternaImediataPagamentoDinheiro() {
		
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
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADOR_PEDIDO001");	
		
	}
	

	/*
	 *  GERACAO PEDIDO FLUXO DE SAIDA RETIRADA EXTERNA IMEDIATA E MEIO DE PAGAMENTO CARTAO
	 */
	public void autFluxoSaidaRetiraExternaImediataPagamentoCartao() {
		
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
		AUT_AGENT_SILK4J.verifyAsset("CHECKPOINT-AUTVA02GERADOR_PEDIDO001");	
		
	}	
	
	
	
}
