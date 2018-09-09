/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.internal.runners.TestMethod;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.*;
import com.borland.silktest.jtf.internal.JunitUtil;
import com.borland.silktest.silk4j.playback.TestResult;
import com.borland.silktest.silk4j.playback.TestRunResultProcessor;

import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_FLUXO_SAIDA;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_MEIOS_PAGAMENTO;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_PLANO_PAGAMENTO;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001.AUTVA01CadastroCliente;


/**
 * 
 *Regressivo de testes integrados - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTSprint1{	
	public static AUTHMCCadastros cadastrosHMC = null;	
	public static  AUTVACadastros cadastrosVA = null;
	public static  AUTVAGeradorPedido geradorPedidos = null;	
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	
	/**
	 * 
	 * Configura os parametros de inicialização para realização de cadastros no HMC 
	 * 
	 */
	@Test
	public void AUT_CT00000_CONFIG() {
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosVA = new AUTVACadastros();
		geradorPedidos = new AUTVAGeradorPedido();		
	}
	
	
	/**
	  * 
	  * Executa os procedimentos de cadastro
	  * 
	  */
	  @Test
	 public void AUT_CT00001_HMC_CADASTRO_USUARIO_LOJA0035() {
	  AUT_LOJA_CADASTRO = "0035";
	  cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);
	 }
	/**
	  * 
	  * Configura os parametros de inicialização para cadastros de clientes-VA
	  * 
	  */
	 @Test
	 public void AUT_CT00002_VA_CONFIG_CADASTRO_CLIENTES() {
	  cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
	  cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);  
	 
	 }
	/**
	  * 
	  * Executa procedimentos para cadastro de cliente - Pessoa Física
	  * 
	  */
	 @Test
	 public void AUT_CT00003_VA_CADASTRO_CLIENTE_PF_LOJA0035() {
	  cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_TIPO_CADASTRO", AUT_VA_CADASTROS.FISICA);
	  cadastrosVA.autInitClientMenuCadastroPF();
	 }
	/**
	  * 
	  * Executa procedimentos para cadastro de cliente - Pessoa Jurídica
	  * 
	  */
	 @Test
	 public void AUT_CT00004_VA_CADASTRO_CLIENTE_PJ_LOJA0035() {
	  cadastrosVA.autInitClientMenuCadastroPJ();
	 }
	/**
	  * 
	  * Executa procedimentos para cadastro de cliente - Estrangeiro
	  * 
	  */
	 @Test
	 public void AUT_CT00005_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LOJA0035() {
	  cadastrosVA.autInitClientMenuCadastroExtrangeiro();
	 }
		/**
	  * 
	  * Configura os parametros de inicialização do gerador de pedidos
	  * 
	  */
	 @Test
	 public void AUT_CT00006_VA_CONFIG_GERADOR_PEDIDOS_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.AUT_CLIENT_DOC_CNPJ = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CPF").toString();
	  geradorPedidos.AUT_CLIENT_DOC_CPF = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_CNPJ").toString();
	  geradorPedidos.AUT_CLIENT_DOC_PASSAPORT = cadastrosVA.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS, "AUT_PASSAPORTE").toString();;
	    
	  geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
	  geradorPedidos.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_GERACAO_PEDIDOS, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);    
	 }

	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00007_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00008_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }	 
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00009_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00010_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00011_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00012_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00013_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00014_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00015_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_CPF_OUTPUT);
	 }
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00016_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00017_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Caixa - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00018_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00019_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Interna Imediata - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00020_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Interna Imediata - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00021_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00022_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Externa Imediata - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00023_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para pessoa jurídica - Fluxo de saída - Retirada Externa Imediata - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00024_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_PJ_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.JURIDICA;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_CNPJ_OUTPUT.toString());
	 }


	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Caixa - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00025_VA_PEDIDO_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Caixa - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00026_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Caixa - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00027_VA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.CAIXA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00028_VA_RETIRADA_INTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Retirada Interna Imediata - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00029_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Retirada Interna Imediata - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00030_VA_RETIRADA_INTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_INTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	  * 
	  */
	 @Test
	 public void AUT_CT00031_VA_RETIRADA_EXTERNA_IMEDIATA_SD_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.toString(), AUT_VA_PLANO_PAGAMENTO.A_VISTA.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Retirada Externa Imediata - Cartão de Crédito
	  * 
	  */
	 @Test
	 public void AUT_CT00032_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CREDITO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CREDITO.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_1X.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }
	/**
	  * 
	  * Executa procedimentos de criação de pedido para estrangeiro - Fluxo de saída - Retirada Externa Imediata - Cartão de Celebre ou próprio
	  * 
	  */ 
	 @Test
	 public void AUT_CT00033_VA_RETIRADA_EXTERNA_IMEDIATA_PEDIDO_SD_CAIXA_PAG_CARTAO_CELEBRE_PROPRIO_ESTRANGEIRO_LOJA0035() {
	  geradorPedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.ESTRANGEIRO;
	  geradorPedidos.autVAGeracaoPedidos(cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT, cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT, AUT_VA_FLUXO_SAIDA.REITRADA_EXTERNA_IMEDIATA.toString(), AUT_VA_MEIOS_PAGAMENTO.DINHEIRO.CARTAO_CELEBRE.toString(), AUT_VA_PLANO_PAGAMENTO.SEM_JUROS_CELEBRE_2X.toString(),cadastrosVA.AUT_NUMERO_DOC_PASSAPORTE_OUTPUT.toString(),AUT_VA_CADASTROS.ESTRANGEIRO.toString());
	 }

	 
}
