package br.lry.qa.rsp.pjttrc.entregas;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.components.va.AUTVACadastros.AUT_VA_PROPRIEDADE_RESIDENCIA;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_CLIENTE_INVALIDO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_CONTATO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_ENDERECO;
import br.lry.components.va.AUTVACadastros.AUT_VA_TIPO_RESIDENCIA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;
import br.stk.framework.tests.AUTFWKTestObjectBase;

/**
 * 
 *Regressivo de testes Cadatros de Cliente - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega005_RGR001 {
	
	
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00030.CN00030 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00031.CN00031 cn00002;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00033.CN00033 cn00003;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00035.CN00035 cn00004;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00036.CN00036 cn00005;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054.CN00054 cn00006;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00040.CN00040 cn00007;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00041.CN00041 cn00008;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00042.CN00042 cn00009;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00043.CN00043 cn00010;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00044.CN00044 cn00011;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00045.CN00045 cn00012;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00046.CN00046 cn00013;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00047.CN00047 cn00014;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00048.CN00048 cn00015;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00049.CN00049 cn00016;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00050.CN00050 cn00017;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055.CN00055 cn00018;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00056.CN00056 cn00019;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00057.CN00057 cn00020;


	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";
	
	public void AUT_INIT() {
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00030.CN00030();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00031.CN00031();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00033.CN00033();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00035.CN00035();
		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00036.CN00036();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054.CN00054();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00040.CN00040();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00041.CN00041();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00042.CN00042();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00043.CN00043();
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00044.CN00044();
		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00045.CN00045();
		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00046.CN00046();
		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00047.CN00047();
		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00048.CN00048();
		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00049.CN00049();
		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00050.CN00050();
		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055.CN00055();
		cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00056.CN00056();
		cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00057.CN00057();

		gerTests = new AUTFWKTestObjectBase();	
		gerTests.autInitConfigurationProjectExecution(AUTEntrega005_RGR001.class,AUT_TEST_STATUS_EXECUCAO.WAIT);
		
	}
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização dos testes de geração de pedidos	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00015_FRT015_CN00000_CONFIG() {
		
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00030.CN00030();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00031.CN00031();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00033.CN00033();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00035.CN00035();
		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00036.CN00036();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054.CN00054();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00040.CN00040();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00041.CN00041();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00042.CN00042();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00043.CN00043();
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00044.CN00044();
		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00045.CN00045();
		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00046.CN00046();
		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00047.CN00047();
		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00048.CN00048();
		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00049.CN00049();
		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00050.CN00050();
		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055.CN00055();
		cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00056.CN00056();
		cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00057.CN00057();

		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega005_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	

	

			
	@Test
	/**
	 * CN00030 - Pedido com promoção complexa sobre desconto
	 */
	public void AUT_IT00001_STVA_ID00015_FRT015_CN00030_PEDIDO_PROMOCAO_COMPLEXA_SOBRE_DESCONTO_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00001.autStartProcess30();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);		
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * CN00031 - Pedido com desconto dentro do mundo do usuário e fora da seção
	 */
	public void AUT_IT00002_STVA_ID00015_FRT015_CN00031_PEDIDO_COM_DESCONTO_DENTRO_DO_MUNDO_E_FORA_DA_SECAO_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00002.autStartProcess31();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		}
	}
	
		
	@Test
	/**
	 * CN00033 - Pedido com desconto dentro da seção
	 */
	public void AUT_IT00003_STVA_ID00015_FRT015_CN00033_PEDIDO_COM_DESCONTO_DENTRO_DA_SECAO_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00003.autStartProcess33();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00035 - Realizar um pedido com Aprovação de alçada
	 */
	public void AUT_IT00004_STVA_ID00015_FRT015_CN00035_REALIZAR_PEDIDO_FORA_ALCADA_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00004.autStartProcess35();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}	
	
	
	@Test
	/**
	 * CN00036 - Pedido com aprovação de alçada de multiplas lojas - Televendas
	 */
	public void AUT_IT00005_STVA_ID00015_FRT015_CN00036_PEDIDO_COM_APROVACAO_DE_ALCADAS__DE_MULTIPLAS_LOJAS_LOJAS0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00005.autStartProcess36();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00054 - Realizar um pedido através do canal Ecommerce
	 */
	public void AUT_IT00006_STVA_ID00015_FRT015_CN00054_REALIZAR_PEDIDO_ATRAVES_DO_ECOMMERCE_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00006.autStartProcess54();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	
	@Test
	/**
	 * CN00040 - Realizar um pedido com itens que tenha lote sem estoque
	 */
	public void AUT_IT00007_STVA_ID00015_FRT015_CN00040_REALIZAR_PEDIDO_COM_ITENS_COM_LOTE_SEM_ESTOQUE_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00007.autStartProcess40();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	
	@Test
	/**
	 * CN00041 - Realizar um pedido com saída de Fluxo Entrega expressa
	 */
	public void AUT_IT00008_STVA_ID00015_FRT015_CN00041_REALIZAR_PEDIDO_COM_ENTREGA_EXPRESSA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00008.autStartProcess41();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	
	@Test
	/**
	 * CN00042 - Realizar um pedido com saída de Fluxo Entrega economica
	 */
	public void AUT_IT00009_STVA_ID00015_FRT015_CN00042_REALIZAR_PEDIDO_COM_ENTREGA_ECONOMICA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00009.autStartProcess42();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	
	@Test
	/**
	 * CN00043 - Realizar um pedido com pagamento Cartão de Crédito
	 */
	public void AUT_IT00010_STVA_ID00015_FRT015_CN00043_REALIZAR_PEDIDO_COM_PAGAMENTO_CARTAO_CREDITO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00010.autStartProcess43();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	@Test
	/**
	 * CN00044 - Realizar pedido com pgto Cartão de Crédito e Aprovação Antifraude
	 */
	public void AUT_IT00011_STVA_ID00015_FRT015_CN00044_REALIZAR_PEDIDO_COM_PAGAMENTO_CARTAO_CREDITO_APROVACAO_ANTIFRAUDE_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00011.autStartProcess44();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	@Test
	/**
	 * CN00045 - Realizar pedido pgto Cart Créd. vlr menor R$100 divido 2X ou mais
	 */
	public void AUT_IT00012_STVA_ID00015_FRT015_CN00045_REALIZAR_PEDIDO_COM_PAGAMENTO_CARTAO_CREDITO_COM_VALOR_INFERIOR_E_PARCELADO_EM_2X_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00012.autStartProcess45();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	

	
	@Test
	/**
	 * CN00046 - Realizar um pedido com pagamento Cartão de Crédito Visa
	 */
	public void AUT_IT00013_STVA_ID00015_FRT015_CN00046_REALIZAR_PEDIDO_COM_PAGAMENTO_CARTAO_CREDITO_VISA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00013.autStartProcess46();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	
	@Test
	/**
	 * CN00047 - Realizar um pedido com pagamento Cartão de Crédito Mastercard
	 */
	public void AUT_IT00014_STVA_ID00015_FRT015_CN00047_REALIZAR_PEDIDO_COM_PAGAMENTO_CARTAO_CREDITO_MASTERCARD_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00014.autStartProcess47();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	@Test
	/**
	 *  CN00048 - Realizar um pedido com pagamento Cheque
	 */
	public void AUT_IT00015_STVA_ID00015_FRT015_CN00048_REALIZAR_PEDIDO_COM_CHEQUE_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00015.autStartProcess48();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	@Test
	/**
	 *  CN00049 - Realizar um pedido com pagamento Vale Troca
	 */
	public void AUT_IT00016_STVA_ID00015_FRT015_CN00049_REALIZAR_PEDIDO_COM_VALE_TROCA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00016.autStartProcess49();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}

	
	@Test
	/**
	 *  CN00050 - Realizar um pedido com pagamento Voucher
	 */
	public void AUT_IT00017_STVA_ID00015_FRT015_CN00050_REALIZAR_PEDIDO_COM_VOUCHER_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00017.autStartProcess50();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	@Test
	/**
	 *  CN00055 - Realizar um pedido através da opção de Clique e Retira
	 */
	public void AUT_IT00018_STVA_ID00015_FRT015_CN00055_REALIZAR_PEDIDO_COM_OPCAO_CLIQUE_RETIRA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00018.autStartProcess55();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	
	@Test
	/**
	 *  CN00056 - Realizar pedido sem cliente cadastro e efetuar cadastro PF
	 */
	public void AUT_IT00019_STVA_ID00015_FRT015_CN00056_REALIZAR_PEDIDO_COM_CADASTRO_PF_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00019.autStartProcess56();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
	@Test
	/**
	 *  CN00057 - Realizar pedido sem cliente cadastrado e efetuar o cadastro de PJ
	 */
	public void AUT_IT00020_STVA_ID00015_FRT015_CN00057_REALIZAR_PEDIDO_COM_CADASTRO_PJ_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00020.autStartProcess57();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);	
		}
	}
	
}
