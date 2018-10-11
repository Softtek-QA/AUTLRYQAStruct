package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVATelevendas;

/**
 * 
 *Regressivo de testes Cadatros de Cliente - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTSprint3 {
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVATelevendas televendasVA;
	public static AUTVACadastros cadastrosVA;
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	String hostExec = "192.168.0.116";
	
	/**
	 * 
	 * Configura os parametros de inicialização para realização de cadastros no HMC
	 * 
	 */
	@Test
	public void AUT_CN00000_CONFIG() {
		
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
	}
	
	
	/**
	 * Executa os procedimentos de cadastro de usuário no HMC
	 * 
	 */
	//@Test
	public void AUT_CN00001_HMC_CADASTRO_USUARIO_LOJA0035() {
		
		cadastrosHMC.autCadastrarUsuarioTelevendasHMC();
		//cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);
	}

	/**
	 * Realizar a troca de loja utilizando usuario televenda 
	 */
	@Test
	public void AUT_CN00001_REALIZAR_TROCA_LOJA_USUARIO_TELEVENDA() {
		televendasVA.realizarTrocaLojaTelevendas();
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e com a opção ignorar antifraude (monitor de aprovação) ativa
	 */
	@Test
	public void AUT_CN00002_PEDIDO_TELEVENDAS_PAG_CARTCRED_ING_ANTIFRAUDE() {
		televendasVA.pedidoTelevendasCARTCREDingAntifraude();
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito com valor que envie para antifraude (clearsale)
	 */
	@Test
	public void AUT_CN00003_PEDIDO_TELEVENDAS_PAG_CARTCRED_VALOR_ENV_ANTIFRAUDE() {
		televendasVA.pedidoTelevendasCARTCREDenvAntifraude();
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e voucher, com falha na transação do cartão 
	 */
	@Test
	public void AUT_CN00005_PEDIDO_TELEVENDAS_PAG_CARTCRED_VOUCHER_FALHA_TRANS() {
		televendasVA.pedidoTelevendasCARTCREDeVoucherFalhaTrans();
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e voucher, com cartão caindo na antifraude (clearsale) e reprovando
	 */
	@Test
	public void AUT_CN00006_PEDIDO_TELEVENDAS_PAG_CARTCRED_VOUCHER_ANTIFRAUDE_REPROVADO() {
		// NÃO INICIADO
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e voucher, com ignorar antifraude ativo e reprovado pelo usuário
	 */
	@Test
	public void AUT_CN00007_PEDIDO_TELEVENDAS_PAG_CARTCRED_VOUCHER_ING_ANTIFRAUDE_ATIVO_REPROVADO() {
		// NÃO INICIADO
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e voucher, com pedido caindo em aprovação comercial
	 */
	@Test
	public void AUT_CN00008_PEDIDO_TELEVENDAS_PAG_CARTCRED_VOUCHER_PEDIDO_APROV_COMERCIAL() {
		// NÃO INICIADO
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e voucher, com pedido sendo editado novamente após a finalização
	 */
	@Test
	public void AUT_CN00009_PEDIDO_TELEVENDAS_PAG_CARTCRED_VOUCHER_PEDIDO_REEDITADO() {
		// NÃO INICIADO
	}
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e vale crédito, com falha na transação do cartão 
	 */
	@Test
	public void AUT_CN00010_PEDIDO_TELEVENDAS_PAG_CARTCRED_VALECRED_FALHA_TRANS() {
		// NÃO INICIADO
	}
	
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e vale crédito, com cartão caindo na antifraude (clearsale) e reprovando
	 */
	@Test
	public void AUT_CN00011_PEDIDO_TELEVENDAS_PAG_CARTCRED_VALECRED_ANTIFRAUDE_REPROVADO() {
		//NÃO INICIADO
	}
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e vale crédito, 
	 * com ignorar antifraude ativo e reprovado pelo usuário
	 */
	@Test
	public void AUT_CN00012_PEDIDO_TELEVENDAS_PAG_CARTCRED_VALECRED_ING_ANTIFRAUDE_REPROVA() {
		//NÃO INICIADO
	}
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e vale crédito, 
	 * com pedido caindo em aprovação comercial
	 */
	@Test
	public void AUT_CN00013_PEDIDO_TELEVENDAS_PAG_CARTCRED_VALECRED_APROV_COMERCIAL() {
		//NÃO INICIADO
	}
	
	/**
	 * Pedido do canal televendas com tipo de pagamento cartão de crédito e vale crédito,
	 *  com pedido sendo editado novamente após a finalização
	 */
	@Test
	public void AUT_CN00014_PEDIDO_TELEVENDAS_PAG_CARTCRED_VALECRED_PEDIDO_REEDITADO() {
		//NÃO INICIADO
	}
	
	/**
	 * Pedido do canal televendas, com usuário trocando a loja para uma diferente do pedido e depois acionando funcionalidade para editá-lo
	 */
	@Test
	public void AUT_CN00015_PEDIDO_TELEVENDAS_LOJA_DIFERENTE_DO_PEDIDO_DEPOIS_EDITAR() {
		//NÃO INICIADO
	}
	
	/**
	 * Pedido do canal televendas, com usuário trocando a loja para uma diferente do pedido e depois acionando funcionalidade para copiá-lo
	 */
	@Test
	public void AUT_CN00016_PPEDIDO_TELEVENDAS_LOJA_DIFERENTE_DO_PEDIDO_DEPOIS_COPIANDO() {
		//NÃO INICIADO
	}
	
	/**
	 * Usuário televendas copiando um pedido do canal Loja
	 */
	@Test
	public void AUT_CN00017_USUARIO_TELEVENDAS_COPIANDO_PEDIDO_CANAL_LOJA() {
		//NÃO INICIADO
	}
	
	/**
	 * Pedido do canal televendas com opção de pagamento "Pagar na loja"
	 */
	@Test
	public void AUT_CN00018_PEDIDO_TELEVENDAS_PAGAMENTO_PAGAR_NA_LOJA() {
		//NÃO INICIADO
	}



}

