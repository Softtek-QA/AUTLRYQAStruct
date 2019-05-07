package br.lry.qa.rsp.pjttrc.entregas;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.stk.framework.tests.AUTFWKTestObjectBase;


/**
 * 
 *Regressivo de testes do módulo de orçamento
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega007_RGR001 {
	
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00001.CN00001 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00002.CN00002 cn00002;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00003.CN00003 cn00003;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00004.CN00004 cn00004;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00005.CN00005 cn00005;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00006.CN00006 cn00006;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00007.CN00007 cn00007;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00008.CN00008 cn00008;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00009.CN00009 cn00009;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00010.CN00010 cn00010;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00011.CN00011 cn00011;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00012.CN00012 cn00012;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00013.CN00013 cn00013;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00014.CN00014 cn00014;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00015.CN00015 cn00015;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00016.CN00016 cn00016;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00017.CN00017 cn00017;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00018.CN00018 cn00018;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00019.CN00019 cn00019;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00020.CN00020 cn00020;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00021.CN00021 cn00021;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00022.CN00022 cn00022;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00023.CN00023 cn00023;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00024.CN00024 cn00024;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00025.CN00025 cn00025;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00026.CN00026 cn00026;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00027.CN00027 cn00027;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00028.CN00028 cn00028;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00029.CN00029 cn00029;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00030.CN00030 cn00030;


	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";

	
	public void AUT_INIT() {
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00002.CN00002();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00003.CN00003();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00004.CN00004();
		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00005.CN00005();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00006.CN00006();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00007.CN00007();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00008.CN00008();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00009.CN00009();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00010.CN00010();
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00011.CN00011();
		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00012.CN00012();
		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00013.CN00013();
		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00014.CN00014();
		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00015.CN00015();
		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00016.CN00016();
		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00017.CN00017();
		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00018.CN00018();
		cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00019.CN00019();
		cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00020.CN00020();
		cn00021 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00021.CN00021();
		cn00022 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00022.CN00022();
		cn00023 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00023.CN00023();
		cn00024 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00024.CN00024();
		cn00025 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00025.CN00025();
//		cn00026 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00026.CN00026();
//		cn00027 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00027.CN00027();
		cn00028 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00028.CN00028();
		cn00029 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00029.CN00029();
		cn00030 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00030.CN00030();
		
		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega007_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT);
		
	}
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização dos testes de geração de pedidos	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00021_FRT021_CN00000_CONFIG() {
		
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00002.CN00002();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00003.CN00003();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00004.CN00004();
		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00005.CN00005();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00006.CN00006();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00007.CN00007();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00008.CN00008();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00009.CN00009();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00010.CN00010();
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00011.CN00011();
		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00012.CN00012();
		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00013.CN00013();
		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00014.CN00014();
		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00015.CN00015();
		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00016.CN00016();
		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00017.CN00017();
		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00018.CN00018();
		cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00019.CN00019();
		cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00020.CN00020();
		cn00021 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00021.CN00021();
		cn00022 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00022.CN00022();
		cn00023 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00023.CN00023();
		cn00024 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00024.CN00024();
		cn00025 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00025.CN00025();
//		cn00026 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00026.CN00026();
//		cn00027 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00027.CN00027();
		cn00028 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00028.CN00028();
		cn00029 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00029.CN00029();
		cn00030 = new br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00030.CN00030();
		
		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega007_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	

			
	@Test
	/**
	 * CN00001 - Realizar orçamento através do portal de Venda Assistida
	 */
	public void AUT_IT00001_STVA_ID00021_FRT021_CN00001_REALIZAR_ORCAMENTO_ATRAVES_DO_PORTAL_VENDA_ASSISTIDA_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00001.autStartProcess01();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);		
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00002 - Realizar orçamento com pagamento caixa
	 */
	public void AUT_IT00002_STVA_ID00021_FRT021_CN00002_REALIZAR_ORCAMENTO_PAGAMENTO_CAIXA_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00002.autStartProcess02();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);		}
	}
	
	
		
	@Test
	/**
	 * CN00003 - Realizar orçamento com retirada na loja
	 */
	public void AUT_IT00003_STVA_ID00021_FRT021_CN00003_REALIZAR_ORCAMENTO_COM_RETIRADA_CAIXA_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00003.autStartProcess03();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00004 - Realizar orçamento com entrega
	 */
	public void AUT_IT00004_STVA_ID00021_FRT021_CN00004_REALIZAR_ORCAMENTO_COM_ENTREGA_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00004.autStartProcess04();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}	
	
	
	
	@Test
	/**
	 * CN00005 - Realizar orçamento com Garantia Estendidal
	 */
	public void AUT_IT00005_STVA_ID00021_FRT021_CN00005_REALIZAR_ORCAMENTO_COM_GARANTIA_ESTENDIDA_LOJA0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00005.autStartProcess05();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00006 - Realizar orçamento e conceder desconto
	 */
	public void AUT_IT00006_STVA_ID00021_FRT021_CN00006_REALIZAR_ORCAMENTO_E_CONCEDER_DESCONTO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00006.autStartProcess06();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00007 - Realizar orçamento e conceder desconto fora da alçada do usuário
	 */
	public void AUT_IT00007_STVA_ID00021_FRT021_CN00007_REALIZAR_ORCAMENTO_E_CONCEDER_DESCONTO_FORA_DA_ALCADA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00007.autStartProcess07();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00008 - Realizar orçamento com serviço vinculado
	 */
	public void AUT_IT00008_STVA_ID00021_FRT021_CN00008_REALIZAR_ORCAMENTO_COM_SERVICO_VINCULADO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00008.autStartProcess08();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00009 - Realizar orçamento com serviço e rateio de desconto no serviço
	 */
	public void AUT_IT00009_STVA_ID00021_FRT021_CN00009_REALIZAR_ORCAMENTO_COM_SERVICO_E_RATEIO_DE_DESCONTO_NO_SERVICO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00009.autStartProcess09();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	

	@Test
	/**
	 * CN00010 - Realizar orçamento com serviço com rateio de frete e entrega
	 */
	public void AUT_IT00010_STVA_ID00021_FRT021_CN00010_REALIZAR_ORCAMENTO_COM_SERVICO_COM_RATEIO_DE_FRETE_E_ENTREGA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00010.autStartProcess10();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	

	@Test
	/**
	 * CN00011 - Realizar orçamento com serviço e desconto não eleg. para rateio
	 */
	public void AUT_IT00011_STVA_ID00021_FRT021_CN00011_REALIZAR_ORCAMENTO_COM_SERVICO_E_DESCONTO_NAO_ELEGIVEL_PARA_RATEIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00011.autStartProcess11();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00012 - Realizar orçamento com garantia estendida vinculada
	 */
	public void AUT_IT00012_STVA_ID00021_FRT021_CN00012_REALIZAR_ORCAMENTO_COM_GARANTIA_ESTENDIDA_VINCULADA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00012.autStartProcess12();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00013 - Realizar orçamento com garantia estendida, desconto e rateio
	 */
	public void AUT_IT00013_STVA_ID00021_FRT021_CN00013_REALIZAR_ORCAMENTO_COM_GARANTIA_ESTENDIDA_DESCONTO_E_RATEIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00013.autStartProcess13();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	

	@Test
	/**
	 * CN00014 - Realizar orçamento com garantia estendida eleg p rateio e entrega
	 */
	public void AUT_IT00014_STVA_ID00021_FRT021_CN00014_REALIZAR_ORCAMENTO_COM_GARANTIA_ESTENDIDA_ELEGIVEL_PARA_RATEIO_E_ENTREGA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00014.autStartProcess14();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	
	@Test
	/**
	 * CN00015 - Realizar orçamento com garantia estendida, desc não eleg p rateio
	 */
	public void AUT_IT00015_STVA_ID00021_FRT021_CN00075_REALIZAR_ORCAMENTO_COM_GARANTIA_ESTENDIDA_DESCONTO_NAO_ELEGIVEL_PARA_RATEIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00015.autStartProcess15();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00016 - Realizar orçamento com serviço avulso
	 */
	public void AUT_IT00016_STVA_ID00021_FRT021_CN00016_REALIZAR_ORCAMENTO_COM_SERVICO_AVULSO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00016.autStartProcess16();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	
	
	@Test
	/**
	 * CN00017 - Realizar orçamento, desc. pont item da alçada e seção do usuário
	 */
	public void AUT_IT00017_STVA_ID00021_FRT021_CN00017_REALIZAR_ORCAMENTO_DESCONTO_PONTUAL_TEM_DA_ALCADA_E_SECAO_USUARIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00017.autStartProcess17();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00018 - Realizar orçamento, desc. pont fora da alçada e seção do usuário
	 */
	public void AUT_IT00018_STVA_ID00021_FRT021_CN00018_REALIZAR_ORCAMENTO_DESCONTO_PONTUAL_FORA_DA_ALCADA_E_SECAO_DO_USUARIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00018.autStartProcess18();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00019 - Realizar orçam desc pontual % na seção e 1 item não eleg p rateio
	 */
	public void AUT_IT00019_STVA_ID00021_FRT021_CN00019_REALIZAR_ORCAMENTO_DESCONTO_PONTUAL_PORCENTAGEM_NA_SECAO_E_1_ITEM_NAO_ELEGIVEL_PARA_RATEIO_LOJA0035() {
		try {
			
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00019.autStartProcess19();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
			
		}
	}

	
	
	@Test
	/**
	 * CN00020 - Realizar orçamento desc pontual % na seção e itens eleg p rateio
	 */
	public void AUT_IT00020_STVA_ID00021_FRT021_CN00020_REALIZAR_ORCAMENTO_DESCONTO_PONTUAL_PORCENTAGEM_NA_SECAO_E_ITENS_ELEGIVEIS_PARA_RATEIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00020.autStartProcess20();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00021 - Realizar orçament desc pont R$ na seção e 1item não eleg p rateio
	 */
	public void AUT_IT00021_STVA_ID00021_FRT021_CN00021_REALIZAR_ORCAMENTO_DESCONTO_PONTUAL_REAIS_NA_SECAO_E_1_ITEM_NAO_ELEGIVEL_PARA_RATEIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00021.autStartProcess21();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00022 - Realizar orçamento desc pont R$ na seção com itens eleg p rateio
	 */
	public void AUT_IT00022_STVA_ID00021_FRT021_CN00022_REALIZAR_ORCAMENTO_DESCONTO_PONTUAL_REAIS_NA_SECAO_E_ITENS_ELEGIVEIS_PARA_RATEIO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00022.autStartProcess22();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	
	@Test
	/**
	 * CN00023 - Realizar orçamento com desconto pontual no total
	 */
	public void AUT_IT00023_STVA_ID00021_FRT021_CN00023_REALIZAR_ORCAMENTO_COM_DESCONTO_PONTUAL_NO_TOTAL_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00023.autStartProcess23();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	
	
	@Test
	/**
	 * CN00024 - Realizar orçamento com desc pont sob desc administ não combinável
	 */
	public void AUT_IT00024_STVA_ID00021_FRT021_CN00024_REALIZAR_ORCAMENTO_COM_DESC_PONTUAL_SOBRE_DESCONTO_ADMINISTRADOR_NAO_COMBINAVEL_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00024.autStartProcess24();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
	@Test
	/**
	 * CN00025 - Realizar orçamento desc pont dentro da alçada sob desc adm combin
	 */
	public void AUT_IT00025_STVA_ID00021_FRT021_CN00025_REALIZAR_ORCAMENTO_DESCONTO_PONTUAL_DENTRO_DA_ALCADA_SOBRE_ADM_COMBIN_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00025.autStartProcess25();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	

	
	@Test
	/**
	 * CN00028 - Realizar orçamento e incluir observação no orçamento
	 */
	public void AUT_IT00026_STVA_ID00021_FRT021_CN00028_REALIZAR_ORCAMENTO_E_INCLUIR_OBSERVACAO_NO_ORCAMENTO_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00028.autStartProcess28();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * CN00029 - Realizar orçamento e incluir observação no item
	 */
	public void AUT_IT00027_STVA_ID00021_FRT021_CN00029_REALIZAR_ORCAMENTO_E_INCLUIR_OBSERVACAO_NO_ITEM_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00029.autStartProcess29();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	@Test
	/**
	 * CN00030 - Realizar orçamento e adicionar ocorrência
	 */
	public void AUT_IT00028_STVA_ID00021_FRT021_CN00089_REALIZAR_ORCAMENTO_E_ADICIONAR_OCORRENCIA_LOJA0035() {
		try {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00030.autStartProcess30();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
			
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}


	
}
