package br.lry.qa.rsp.pjttrc.entregas;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.stk.framework.tests.AUTFWKTestObjectBase;



/**
 * 
 *Regressivo de testes de Geracao de Pedidos - Sprint 03
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega006_RGR001 {
	
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00032.CN00032 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00034.CN00034 cn00002;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00037.CN00037 cn00003;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00038.CN00038 cn00004;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00039.CN00039 cn00005;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00051.CN00051 cn00006;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00052.CN00052 cn00007;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00053.CN00053 cn00008;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00058.CN00058 cn00009;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00059.CN00059 cn00010;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060.CN00060 cn00011;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00061.CN00061 cn00012;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00062.CN00062 cn00013;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00063.CN00063 cn00014;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00064.CN00064 cn00015;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00065.CN00065 cn00016;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00066.CN00066 cn00017;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00067.CN00067 cn00018;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00068.CN00068 cn00019;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00069.CN00069 cn00020;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070.CN00070 cn00021;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071.CN00071 cn00022;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00072.CN00072 cn00023;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00073.CN00073 cn00024;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074.CN00074 cn00025;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00075.CN00075 cn00026;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00076.CN00076 cn00027;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00077.CN00077 cn00028;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00078.CN00078 cn00029;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00079.CN00079 cn00030;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CN00080 cn00031;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081.CN00081 cn00032;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082.CN00082 cn00033;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083.CN00083 cn00034;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084.CN00084 cn00035;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085.CN00085 cn00036;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086.CN00086 cn00037;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CN00087 cn00038;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088.CN00088 cn00039;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00089.CN00089 cn00040;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00090.CN00090 cn00041;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00091.CN00091 cn00042;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00092.CN00092 cn00043;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00093.CN00093 cn00044;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00094.CN00094 cn00045;
//	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00095.CN00095 cn00046;


	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";
	

	public void AUT_INIT() {
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00032.CN00032();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00034.CN00034();
//		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00037.CN00037();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00038.CN00038();
//		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00039.CN00039();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00051.CN00051();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00052.CN00052();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00053.CN00053();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00058.CN00058();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00059.CN00059();
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060.CN00060();
//		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00061.CN00061();
//		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00062.CN00062();
//		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00063.CN00063();
//		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00064.CN00064();
//		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00065.CN00065();
//		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00066.CN00066();
//		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00067.CN00067();
//		cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00068.CN00068();
//		cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00069.CN00069();
		cn00021 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070.CN00070();
		cn00022 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071.CN00071();
		cn00023 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00072.CN00072();
		cn00024 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00073.CN00073();
		cn00025 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074.CN00074();
		cn00026 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00075.CN00075();
		cn00027 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00076.CN00076();
//		cn00028 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00077.CN00077();
//		cn00029 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00078.CN00078();
//		cn00030 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00079.CN00079();
		cn00031 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CN00080();
		cn00032 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081.CN00081();
		cn00033 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082.CN00082();
		cn00034 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083.CN00083();
		cn00035 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084.CN00084();
		cn00036 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085.CN00085();
		cn00037 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086.CN00086();
		cn00038 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CN00087();
		cn00039 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088.CN00088();
		cn00040 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00089.CN00089();
//		cn00041 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00090.CN00090();
//		cn00042 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00091.CN00091();
//		cn00043 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00092.CN00092();
//		cn00044 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00093.CN00093();
//		cn00045 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00094.CN00094();
//		cn00046 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00095.CN00095();
		
		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega006_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT);
	}
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização dos testes de geração de pedidos	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00018_FRT018_CN00000_CONFIG() {
		
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00032.CN00032();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00034.CN00034();
//		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00037.CN00037();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00038.CN00038();
//		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00039.CN00039();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00051.CN00051();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00052.CN00052();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00053.CN00053();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00058.CN00058();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00059.CN00059();
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00060.CN00060();
//		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00061.CN00061();
//		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00062.CN00062();
//		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00063.CN00063();
//		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00064.CN00064();
//		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00065.CN00065();
//		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00066.CN00066();
//		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00067.CN00067();
//		cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00068.CN00068();
//		cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00069.CN00069();
		cn00021 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070.CN00070();
		cn00022 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00071.CN00071();
		cn00023 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00072.CN00072();
		cn00024 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00073.CN00073();
		cn00025 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074.CN00074();
		cn00026 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00075.CN00075();
		cn00027 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00076.CN00076();
//		cn00028 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00077.CN00077();
//		cn00029 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00078.CN00078();
//		cn00030 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00079.CN00079();
		cn00031 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00080.CN00080();
		cn00032 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00081.CN00081();
		cn00033 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00082.CN00082();
		cn00034 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00083.CN00083();
		cn00035 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00084.CN00084();
		cn00036 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00085.CN00085();
		cn00037 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086.CN00086();
		cn00038 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CN00087();
		cn00039 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088.CN00088();
		cn00040 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00089.CN00089();
//		cn00041 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00090.CN00090();
//		cn00042 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00091.CN00091();
//		cn00043 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00092.CN00092();
//		cn00044 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00093.CN00093();
//		cn00045 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00094.CN00094();
//		cn00046 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00095.CN00095();
		
		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega006_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	


			
	@Test
	/**
	 * CN00032 - pedido com desconto fora do mundo
	 */
	public void AUT_IT00001_STVA_ID00018_FRT018_CN00032_PEDIDO_COM_DESCONTO_FORA_DO_MUNDO_LOJA0035() {
			cn00001.autStartProcess32();
	}
	
	
	
	@Test
	/**
	 * CN00034 - Pedido com desconto no frete
	 */
	public void AUT_IT00002_STVA_ID00018_FRT018_CN00034_PEDIDO_COM_DESCONTO_NO_FRETE_LOJA0035() {

			cn00002.autStartProcess34();
	}
	
	
		
	@Test
	/**
	 * CN00038 - Realizar pedido de item com lote e centro de distrib. diferente
	 */
	public void AUT_IT00003_STVA_ID00018_FRT018_CN00038_REALIZAR_PEDIDO_DE_ITEM_COM_LOTE_E_CD_DIFERENTE_LOJA0035() {

			cn00004.autStartProcess38();

	}
	
	
	
	@Test
	/**
	 * CN00051 - Realizar um pedido com encomenda
	 */
	public void AUT_IT00004_STVA_ID00018_FRT018_CN00051_REALIZAR_PEDIDO_COM_ENCOMENDA_LOJA0035() {

			cn00006.autStartProcess51();

	}	
	
	
	
	@Test
	/**
	 * CN00052 - Realizar um pedido para que fique com Status Faturado Parcial
	 */
	public void AUT_IT00005_STVA_ID00018_FRT018_CN00052_REALIZAR_PEDIDO_COM_STATUS_FATURADO_PARCIAL_LOJA0035() {

			cn00007.autStartProcess52();

	}
	
	
	
	@Test
	/**
	 * CN00053 - Realizar um pedido através do canal de Televendas
	 */
	public void AUT_IT00006_STVA_ID00018_FRT018_CN00054_REALIZAR_PEDIDO_ATRAVES_DO_CANAL_TELEVENDAS_LOJA0035() {

			cn00008.autStartProcess53();

	}
	
	
	
	@Test
	/**
	 * CN00058 - Realizar pedido sem cliente cadast e efet. o cadast Cliente Estr.
	 */
	public void AUT_IT00007_STVA_ID00018_FRT018_CN00058_REALIZAR_PEDIDO_COM_CADASTRO_DE_PESSOA_ESTRANGEIRA_LOJA0035() {

			cn00009.autStartProcess58();
	
	}
	
	
	
	@Test
	/**
	 * CN00059 - Realizar o pedido em uma loja e retirar em outra
	 */
	public void AUT_IT00008_STVA_ID00018_FRT018_CN00059_REALIZAR_PEDIDO_EM_UMA_LOJA_E_RETIRAR_EM_OUTRA_LOJA0035() {

			cn00010.autStartProcess59();

	}
	
	
	
	@Test
	/**
	 * CN00060 - Realizar um pedido onde não tenha o produto na loja selecionada
	 */
	public void AUT_IT00009_STVA_ID00018_FRT018_CN00060_REALIZAR_PEDIDO_EM_LOJA_QUE_NAO_TENHA_O_PRODUTO_SELECIONADO_LOJA0035() {

			cn00011.autStartProcess60();

	}
	
	

	@Test
	/**
	 * CN00070 - Pedido que usa mais de uma filial de saída
	 */
	public void AUT_IT00010_STVA_ID00018_FRT018_CN00070_REALIZAR_PEDIDO_QUE_USA_MAIS_DE_UMA_FILIAL_DE_SAIDA_LOJA0035() {

			cn00021.autStartProcess70();

	}
	
	

	@Test
	/**
	 * CN00071 - Pedido que usa mais de uma modalidade de frete
	 */
	public void AUT_IT00011_STVA_ID00018_FRT018_CN00071_REALIZAR_PEDIDO_QUE_USA_MAIS_DE_UMA_MODALIDADE_DE_FRETE_LOJA0035() {
	
			cn00022.autStartProcess71();
	
	}
	
	
	
	@Test
	/**
	 * CN00072 - Pedido de um item plataforma para uma loja não plataforma
	 */
	public void AUT_IT00012_STVA_ID00018_FRT018_CN00072_REALIZAR_PEDIDO_DE_ITEM_PLATAFORMA_PARA_LOJA_NAO_PLATAFORMA_LOJA0035() {

			cn00023.autStartProcess72();

	}
	
	
	
	@Test
	/**
	 * CN00073 - Pedido de um item plataforma para uma loja plataforma
	 */
	public void AUT_IT00013_STVA_ID00018_FRT018_CN00073_REALIZAR_PEDIDO_DE_ITEM_PLATAFORMA_PARA_LOJA_PLATAFORMA_LOJA0035() {

			cn00024.autStartProcess73();

	}
	
	

	@Test
	/**
	 * CN00074 - Pedido com frete adicional
	 */
	public void AUT_IT00014_STVA_ID00018_FRT018_CN00074_REALIZAR_PEDIDO_COM_FRETE_ADICIONAL_LOJA0035() {

			cn00025.autStartProcess74();
	
	}
	

	
	@Test
	/**
	 * CN00075 - Pedido com voucher e cartão de crédito
	 */
	public void AUT_IT00015_STVA_ID00018_FRT018_CN00075_REALIZAR_PEDIDO_COM_VOUCHER_E_CARTAO_CREDITO_LOJA0035() {

			cn00026.autStartProcess75();
	
	}
	
	
	
	@Test
	/**
	 * CN00076 - Pedido com voucher e vale credito
	 */
	public void AUT_IT00016_STVA_ID00018_FRT018_CN00076_REALIZAR_PEDIDO_COM_VOUCHER_E_VALE_CREDITO_LOJA0035() {

			cn00027.autStartProcess76();

	}
	

	
	
	@Test
	/**
	 * CN00080 - Copiar pedido com status eliminado no prazo de D-1
	 */
	public void AUT_IT00017_STVA_ID00018_FRT018_CN00080_COPIAR_PEDIDO_COM_STATUS_ELIMINADO_NO_PRAZO_D1_LOJA0035() {

			cn00031.autStartProcess80();

	}
	
	
	
	@Test
	/**
	 * CN00081 - Copiar pedido com status eliminado acima do prazo D-1
	 */
	public void AUT_IT00018_STVA_ID00018_FRT018_CN00081_COPIAR_PEDIDO_COM_STATUS_ELIMINADO_ACIMA_DO_PRAZO_D1_LOJA0035() {

			cn00032.autStartProcess81();

	}
	
	
	
	@Test
	/**
	 * CN00082 - Copiar pedido com status cancelado no prazo de D-1
	 */
	public void AUT_IT00019_STVA_ID00018_FRT018_CN00082_COPIAR_PEDIDO_COM_STATUS_CANCELADO_NO_PRAZO_D1_LOJA0035() {

			cn00033.autStartProcess82();

	}

	
	
	@Test
	/**
	 * CN00083 - Copiar pedido com status cancelado acima do prazo D-1
	 */
	public void AUT_IT00020_STVA_ID00018_FRT018_CN00083_COPIAR_PEDIDO_COM_STATUS_CANCELADO_ACIMA_DO_PRAZO_D1_LOJA0035() {

			cn00034.autStartProcess83();
	
	}
	
	
	
	@Test
	/**
	 * CN00084 - Copiar pedido com status devolvido no prazo de D-1
	 */
	public void AUT_IT00021_STVA_ID00018_FRT018_CN00084_COPIAR_PEDIDO_COM_STATUS_DEVOLVIDO_D1_LOJA0035() {

			cn00035.autStartProcess84();
	
	}
	
	
	
	@Test
	/**
	 * CN00085 - Copiar pedido com status devolvido acima do prazo D-1
	 */
	public void AUT_IT00022_STVA_ID00018_FRT018_CN00085_REALIZAR_PEDIDO_COM_STATUS_DEVOLVIDO_ACIMA_DO_PRAZO_D1_LOJA0035() {

			cn00036.autStartProcess85();
	
	}
	

	
	@Test
	/**
	 * CN00086 - Copiar pedido mantendo condições negociadas
	 */
	public void AUT_IT00023_STVA_ID00018_FRT018_CN00086_COPIAR_PEDIDO_MANTENDO_CONDICOES_NEGOCIADAS_LOJA0035() {

			cn00037.autStartProcess86();

	}
	

	
	@Test
	/**
	 * CN00087 - Usuário loja copiando pedido do canal televendas
	 */
	public void AUT_IT00024_STVA_ID00018_FRT018_CN00087_REALIZAR_PEDIDO_COPIANDO_PEDIDO_TELEVENDAS_LOJA0035() {

			cn00038.autStartProcess87();

	}
	
	
	
	@Test
	/**
	 * CN00088 - Copiar pedido não mantendo condições negociadas
	 */
	public void AUT_IT00025_STVA_ID00018_FRT018_CN00088_COPIAR_PEDIDO_NAO_MANTENDO_CONDICOES_NEGOCIADAS_LOJA0035() {

			cn00039.autStartProcess88();

	}
	

	
	@Test
	/**
	 * CN00089 - Realizar edição de pedido com status pago com usuário com permiss
	 */
	public void AUT_IT00026_STVA_ID00018_FRT018_CN00089_REALIZAR_EDICAO_DE_PEDIDO_COM_STATUS_PAGO_COM_USUARIO_COM_PERMISSAO_LOJA0035() {

			cn00040.autStartProcess89();
	
	}


	
}
