package br.lry.qa.rsp.pjttrc.entregas;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import br.stk.framework.tests.AUTFWKTestObjectBase;


/**
 * 
 *Regressivo de testes integrados
 * 
 * @author Softtek-QA
 *
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega001_RGR001{	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_1 cn00001_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_2 cn00001_2;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005 cn00005;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006 cn00006;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007 cn00007;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008 cn00008;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009 cn00009;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00010.CN00010 cn00010;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00011.CN00011 cn00011;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00013.CN00013 cn00013;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00014.CN00014 cn00014;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00015.CN00015 cn00015;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00016.CN00016 cn00016;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00017.CN00017 cn00017;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00018.CN00018 cn00018;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00019.CN00019 cn00019;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00020.CN00020 cn00020;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00021.CN00021 cn00021;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00038.CN00038 cn00038;
	
	
	public void AUT_INIT() {
		 AUT_CFG_ID00009_FRT009_CN00000();
	}
	
	/**
	 * 
	 * 
	 * Mapeamento das configurações para execução dos cenários do módulo de Cadastro (Entrega 02)
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void AUT_CFG_ID00009_FRT009_CN00000() {	
		
		cn00001_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_1();
		cn00001_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_2();
		
		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00010.CN00010();
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00011.CN00011();
		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00013.CN00013();
		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00014.CN00014();
		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00015.CN00015();
		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00016.CN00016();
		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00017.CN00017();	
		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00018.CN00018();
		cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00019.CN00019();
		cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00020.CN00020();
		cn00021 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00021.CN00021();
		cn00038 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00038.CN00038();
		
		
	}

	//************************* RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO ******************************************

	
	@Test
	/**
	 * 01 - Parte 1
	 * 
	 * Executa procedimentos Criar Pedido e Consultar Status no VA
	 */
	public void AUT_IT00001_STVA_ID00003_FRT003_CN00001_RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE1() {
		AUT_NUMERO_PEDIDO = cn00001_1.autStartProcess01();
	}
	
	@Test
	/**
	 * 01 - Parte 2
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00002_STPDV_ID00003_FRT003_CN00001_RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE2() {
		cn00001_2.autStartProcess01(AUT_NUMERO_PEDIDO);
		//cn00001_2.autStartProcess01("1000014998");
		
	}
	
	
	
	//@Test
	/**
	 * 01
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00006_STPDV_ID00003_FRT003_CN00005_LOGIN_LOJA0035() {
			cn00005.autStartProcess05();
	}
	
	//@Test
	/**
	 * 02
	 * 
	 * Executa procedimentos para consulta de material de preço do material PDV
	 */
	public void AUT_IT00007_STPDV_ID00003_FRT003_CN00006_VALIDA_PRECO_MATERIAL_LOJA0035() {
		cn00006.autStartProcess06();
	}
	
	
	//@Test
	/**
	 * 03
	 * 
	 * Consulta de estoque de material no SAP
	 */
	public void AUT_IT00008_STSAP_ID00003_FRT003_CN00007_VALIDA_ESTOQUE_MATERIAL_LOJA0035() {
		cn00007.autStartProcess07();
	}

	
	//@Test
	/**
	 * 
	 * 
	 * Gera voucher para cliente PF
	 */
	//@Test
	public void AUT_IT00009_STSAFE_ID00003_FRT003_CN00008_GERAR_VOUCHER_PF() {
		cn00008.autStartProcess08();
	}
	
	
	//@Test
	/**
	 * 
	 * Gera voucher para cliente estrangeiro
	 */
	
	public void AUT_IT00010_STSAFE_ID00003_FRT003_CN00009_GERAR_VOUCHER_EST() {
		cn00009.autStartProcess09();
	}
	
	
	//@Test
	/**
	 * 
	 * Gera voucher para cliente PJ
	 */
	
	public void AUT_IT00011_STSAFE_ID00003_FRT003_CN00010_GERAR_VOUCHER_PJ() {
		cn00010.autStartProcess10();
	}
	
	// FLUXO DE SAÍDA: RETIRADA EXTERNA IMEDIATA
	
	//@Test
	/**
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 * 
	 */
	
	public void AUT_IT00013_STVA_ID00003_FRT003_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PF_LOJA0035() {
		cn00013.autStartProcess13();
	}
	
	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	
	public void AUT_IT00014_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035() {
		cn00014.autStartProcess14();
	}

	
	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	
	public void AUT_IT00015_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035() {
		cn00015.autStartProcess15();
	}


	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	
	public void AUT_IT00016_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035() {
		cn00016.autStartProcess16();
	}
	
	
	//@Test
	/**
	 * 
	 * 
	 */
	
	public void AUT_IT00017_STSAP_ID00003_FRT003_CN00017_FATURA_PEDIDO_PF_LOJA0035() {
		cn00017.autStartProcess17();
	}
	
	
	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	
	public void AUT_IT00018_STVA_ID00003_FRT003_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_PF_LOJA0035() {
		cn00018.autStartProcess18();
	}
	
	

	//@Test
	/**
	 * 
	 * Devolução do pedido no PDV
	 */
	
	public void AUT_IT00019_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035() {
		cn00019.autStartProcess19();
	}
	


	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	
	public void AUT_IT00020_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035() {
		cn00020.autStartProcess20();
	}
	

	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 */
	
	public void AUT_IT00021_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035() {
		cn00021.autStartProcess21();
	}
	
	// PESSOA ESTRANGEIRA
	
	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	
	public void AUT_IT00022_STVA_ID00003_FRT003_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		cn00013.autStartProcess13();
	}

	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	
	public void AUT_IT00023_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035() {
		cn00014.autStartProcess14();
	}

	
	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	
	public void AUT_IT00024_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		cn00015.autStartProcess15();
	}


	//@Test
	/**
	 * 
	 * 
	 */
		
	public void AUT_IT00025_STSAP_ID00003_FRT003_CN00017_FATURA_PEDIDO_ESTRANGEIRO_LOJA0035() {
		cn00017.autStartProcess17();
	}
		
	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
		
	public void AUT_IT00026_STVA_ID00003_FRT003_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_ESTRANGEIRO_LOJA0035() {
		cn00018.autStartProcess18();
	}
	
	
	
	
	//@Test
	/**
	 * 
	 * Devolução do pedido no PDV
	 */
	
	public void AUT_IT00027_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		cn00019.autStartProcess19();
	}
	

	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
		
	public void AUT_IT00028_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035() {
		cn00020.autStartProcess20();
	}
		
	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 */
		
	public void AUT_IT00029_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035() {
		cn00021.autStartProcess21();
	}
	
	
	// PESSOA JURÍDICA
	
	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Externa Imediata - Pagamento em Dinheiro
	 */
	
	public void AUT_IT00030_STVA_ID00003_FRT003_CN00013_RETIRADA_EXTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035() {
		cn00013.autStartProcess13();
	}
	
	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	
	public void AUT_IT00032_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035() {
		cn00015.autStartProcess15();
	}
	

	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
		
	public void AUT_IT00033_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035() {
		cn00016.autStartProcess16();
	}
		
	//@Test
	/**
	 * 
	 * 
	 */
		
	public void AUT_IT00034_STSAP_ID00003_FRT003_CN00017_FATURA_PEDIDO_PJ_LOJA0035() {
		cn00017.autStartProcess17();
	}
	
	
	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	
	public void AUT_IT00035_STVA_ID00003_FRT003_CN00018_VALIDA_STATUS_PEDIDO_FATURADO_PJ_LOJA0035() {
		cn00018.autStartProcess18();
	}
	
	//@Test
	/**
	 * 
	 * Devolução do pedido no PDV
	 */
	
	public void AUT_IT00036_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035() {
		cn00019.autStartProcess19();
	}
	

	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
		
	public void AUT_IT00037_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035() {
		cn00020.autStartProcess20();
	}
		
	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 */
		
	public void AUT_IT00038_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035() {
		cn00021.autStartProcess21();
	}
	
	//FLUXO DE SAÍDA: RETIRADA INTERNA IMEDIATA
	
	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	
	public void AUT_IT00039_STVA_ID00003_FRT003_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_PF_LOJA0035() {
		cn00013.autStartProcess13();
	}
	
	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
	
	public void AUT_IT00040_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035() {
		cn00014.autStartProcess14();
	}
	

	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
		
	public void AUT_IT00041_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035() {
		cn00015.autStartProcess15();
	}
		
	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 */
		
	public void AUT_IT00042_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035() {
		cn00016.autStartProcess16();
	}
	
	
	//@Test
	/**
	 * 
	 * Devolução do pedido no PDV
	 */
	
	public void AUT_IT00043_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035() {
		cn00019.autStartProcess19();
	}
	
	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00044_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035() {
		cn00020.autStartProcess20();
	}


	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00045_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035() {
		cn00021.autStartProcess21();
	}
	

	
	
	
	
	
	
	
	
	
	
	//***************************************************** PESSOA ESTRANGEIRA *******************
	
	
	
	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00046_STVA_ID00003_FRT003_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		cn00013.autStartProcess13();
	}
	
	//@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00047_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035() {
		cn00014.autStartProcess14();
	}



	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00048_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		cn00015.autStartProcess15();
	}

	//@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00049_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035() {
		cn00016.autStartProcess16();
	}
	
	
	//@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00050_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		cn00019.autStartProcess19();
	}


	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00051_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035() {
		cn00020.autStartProcess20();
	}


	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00052_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035() {
		cn00021.autStartProcess21();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// PESSOA JURÍDICA 
	
	

	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00053_STVA_ID00003_FRT003_CN00013_RETIRADA_INTERNA_IMEDIATA_PAG_DINHEIRO_PJ_LOJA0035() {
		cn00013.autStartProcess13();
	}
	
	//@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00054_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035() {
		cn00014.autStartProcess14();
	}



	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00055_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035() {
		cn00015.autStartProcess15();
	}

	//@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00056_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035() {
		cn00016.autStartProcess16();
	}
		
	
	
	//@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00057_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035() {
		cn00019.autStartProcess19();
	}


	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00058_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035() {
		cn00020.autStartProcess20();
	}


	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00059_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035() {
		cn00021.autStartProcess21();
	}

	
	
	
	
	
	
	

	
	
	
	
	//FLUXO DE SAÍDA: CAIXA 

	

	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Caixa - Pagamento em Dinheiro
	 */
	public void AUT_IT00060_STVA_ID00003_FRT003_CN00013_CAIXA_PAG_DINHEIRO_PF_LOJA0035() {
		cn00013.autStartProcess13();
	}
	
	//@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00061_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PF_LOJA0035() {
		cn00014.autStartProcess14();
	}



	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00062_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_PF_LOJA0035() {
		cn00015.autStartProcess15();
	}

	//@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00063_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PF_LOJA0035() {
		cn00016.autStartProcess16();
	}
	
		
	//@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00064_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_PF_LOJA0035() {
		cn00019.autStartProcess19();
	}


	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00065_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PF_LOJA0035() {
		cn00020.autStartProcess20();
	}


	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00066_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_PF_LOJA0035() {
		cn00021.autStartProcess21();
	}
	

	
	
	
	
	
	// PESSOA ESTRANGEIRA 
	
	
	
	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00067_STVA_ID00003_FRT003_CN00013_CAIXA_PAG_DINHEIRO_ESTRANGEIRO_LOJA0035() {
		cn00013.autStartProcess13();
	}
	
	//@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00068_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_ESTRANGEIRO_LOJA0035() {
		cn00014.autStartProcess14();
	}



	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00069_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		cn00015.autStartProcess15();
	}

	//@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00070_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_ESTRANGEIRO_LOJA0035() {
		cn00016.autStartProcess16();
		
	}		
	
	
	//@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00071_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_ESTRANGEIRO_LOJA0035() {
		cn00019.autStartProcess19();
	}


	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00072_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_ESTRANGEIRO_LOJA0035() {
		cn00020.autStartProcess20();

	}


	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00073_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_ESTRANGEIRO_LOJA0035() {
		cn00021.autStartProcess21();
	}
	

	//****************************************** PESSOA JURÍDICA **************************
	
	
	
	
	
	//@Test
	/**
	 * 
	 * Executa procedimentos de criação de pedido para pessoa física - Fluxo de saída - Retirada Interna Imediata - Pagamento em Dinheiro
	 */
	public void AUT_IT00074_STVA_ID00003_FRT003_CN00013_CAIXA_PAG_DINHEIRO_PJ_LOJA0035() {
		cn00013.autStartProcess13();
		
	}
	
	//@Test
	/**
	 *
	 * 21
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00075_STVA_ID00003_FRT003_CN00014_VA_VALIDA_STATUS_PEDIDO_CRIADO_PJ_LOJA0035() {
		cn00014.autStartProcess14();
	}



	//@Test
	/**
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 *
	 */
	public void AUT_IT00076_STPDV_ID00003_FRT003_CN00015_PAGAMENTO_PEDIDO_PJ_LOJA0035() {
		cn00015.autStartProcess15();

	}

	//@Test
	/**
	 *  
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00077_STVA_ID00003_FRT003_CN00016_VALIDA_STATUS_PEDIDO_PAGO_PJ_LOJA0035() {
		cn00016.autStartProcess16();
	}		
	
	//@Test
	/**
	 * 
	 * 
	 * Devolução do pedido no PDV
	 * 
	 */
	public void AUT_IT00078_STPDV_ID00003_FRT003_CN00019_DEVOLUCAO_PEDIDO_PJ_LOJA0035() {
		cn00019.autStartProcess19();
	}


	//@Test
	/**
	 * 
	 * Consulta de status do pedido no VA - Vendas Assistidas
	 *
	 */
	public void AUT_IT00079_STVA_ID00003_FRT003_CN00020_VALIDA_PEDIDO_DEVOLUCAO_PJ_LOJA0035() {
		cn00020.autStartProcess20();
	}


	//@Test
	/**
	 * 
	 * Carrega vale troca gerado automaticamento pelo sistema - Em função do fluxo de devolução
	 *
	 */
	public void AUT_IT00080_STSAFE_ID00003_FRT003_CN00021_VALIDA_VALE_TROCA_PJ_LOJA0035() {
		cn00021.autStartProcess21();
	}

	
	
	//@Test
	/**
	 * 
	 * 38
	 * Executa procedimentos para pagamento de pedido no PDV
	 * 
	 */
	public void AUT_IT00081_STPDV_ID00003_FRT003_CN00038_LOGOUT_LOJA0035() {
		cn00038.autStartProcess38();
	}
}