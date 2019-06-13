package br.lry.qa.rsp.pjttrc.entregas;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


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
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_3 cn00001_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_4 cn00001_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_5 cn00001_5;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_1 cn00002_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_2 cn00002_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_3 cn00002_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_4 cn00002_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_5 cn00002_5;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_1 cn00003_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_2 cn00003_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_3 cn00003_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_4 cn00003_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_5 cn00003_5;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_1 cn00004_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_2 cn00004_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_3 cn00004_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_4 cn00004_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_5 cn00004_5;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_1 cn00005_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_2 cn00005_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_3 cn00005_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_4 cn00005_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_5 cn00005_5;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_1 cn00006_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_2 cn00006_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_3 cn00006_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_4 cn00006_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_5 cn00006_5;
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_1 cn00007_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_2 cn00007_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_3 cn00007_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_4 cn00007_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_5 cn00007_5;	
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_1 cn00008_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_2 cn00008_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_3 cn00008_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_4 cn00008_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_5 cn00008_5;		
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_1 cn00009_1;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_2 cn00009_2;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_3 cn00009_3;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_4 cn00009_4;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_5 cn00009_5;		
	
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
		cn00001_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_3();
		cn00001_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_4();
		cn00001_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001.CN00001_5();
		
		cn00002_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_1();
		cn00002_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_2();
		cn00002_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_3();
		cn00002_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_4();
		cn00002_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00002.CN00002_5();
		
		cn00003_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_1();
		cn00003_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_2();
		cn00003_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_3();
		cn00003_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_4();
		cn00003_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00003.CN00003_5();
		
		cn00004_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_1();
		cn00004_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_2();
		cn00004_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_3();
		cn00004_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_4();
		cn00004_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004.CN00004_5();
		
		cn00005_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_1();
		cn00005_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_2();
		cn00005_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_3();
		cn00005_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_4();
		cn00005_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00005.CN00005_5();

		cn00006_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_1();
		cn00006_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_2();
		cn00006_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_3();
		cn00006_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_4();
		cn00006_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00006.CN00006_5();
            
		cn00007_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_1();
		cn00007_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_2();
		cn00007_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_3();
		cn00007_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_4();
		cn00007_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00007.CN00007_5();
            
		cn00008_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_1();
		cn00008_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_2();
		cn00008_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_3();
		cn00008_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_4();
		cn00008_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00008.CN00008_5();
            
		cn00009_1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_1();
		cn00009_2 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_2();
		cn00009_3 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_3();
		cn00009_4 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_4();
		cn00009_5 = new br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00009.CN00009_5();			
	}
 
	//************************* INI RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO ******************************************

	@Test
	/**
	 * CN00001 - Parte 1
	 * 
	 * Executa procedimentos Criar Pedido e Consultar Status no VA
	 */
	public void AUT_IT00001_STVA_ID00003_FRT003_CN00001_RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE1() {
		AUT_NUMERO_PEDIDO = cn00001_1.autStartProcess01();
	}
	
	@Test
	/**
	 * CN00001 - Parte 2
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00002_STPDV_ID00003_FRT003_CN00001_RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE2() {
		cn00001_2.autStartProcess01(AUT_NUMERO_PEDIDO);
		//cn00001_2.autStartProcess01("1000015436");	
	}
	
	//@Test
	/**
	 * CN00001 - Parte 3
	 * 
	 * Executa procedimentos para faturar pedido no SAP
	 */
	public void AUT_IT00003_STSAP_ID00003_FRT003_CN00001_RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE3() {
		//cn00001_3.autStartProcess01(AUT_NUMERO_PEDIDO);	
		cn00001_3.autStartProcess01("1000015179");
	}
	
	//@Test
	/**
	 * CN00001 - Parte 4
	 * 
	 * Executa procedimentos para Devolução do pedido no PDV
	 */
	public void AUT_IT00004_STPDV_ID00003_FRT003_CN00001_RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE4() {
		cn00001_4.autStartProcess01(AUT_NUMERO_PEDIDO);	
	}
	
	//@Test
	/**
	 * CN00001 - Parte 5
	 * 
	 * Executa procedimentos para validar Vale Troca no SAFE
	 */
	public void AUT_IT00005_STSAFE_ID00003_FRT003_CN00001_RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE5() {
		cn00001_5.autStartProcess01(AUT_NUMERO_PEDIDO);
		//cn00001_5.autStartProcess01("1000014998");
		
	}
	//************************* FIM RETIR_EXT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO ******************************************

	
	
	//************************* INI RETIR_EXT_IMEDIATA_DINHEIRO_ESTRANGEIRO_COM_DEVOLUCAO ******************************************

	//@Test
	/**
	 * CN00002 - Parte 1
	 * 
	 * Executa procedimentos Criar Pedido e Consultar Status no VA
	 */
	public void AUT_IT00006_STVA_ID00003_FRT003_CN00002_RETIR_EXT_IMEDIATA_DINHEIRO_ESTRANGEIRO_COM_DEVOLUCAO_PARTE1() {
		AUT_NUMERO_PEDIDO = cn00002_1.autStartProcess02();
	}
	
	//@Test
	/**
	 * CN00002 - Parte 2
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00007_STPDV_ID00003_FRT003_CN00002_RETIR_EXT_IMEDIATA_DINHEIRO_ESTRANGEIRO_COM_DEVOLUCAO_PARTE2() {
		cn00002_2.autStartProcess02(AUT_NUMERO_PEDIDO);		
	}
	
	//@Test
	/**
	 * CN00002 - Parte 3
	 * 
	 * Executa procedimentos para faturar pedido no SAP
	 */
	public void AUT_IT00008_STSAP_ID00003_FRT003_CN00002_RETIR_EXT_IMEDIATA_DINHEIRO_ESTRANGEIRO_COM_DEVOLUCAO_PARTE3() {
		cn00002_3.autStartProcess02(AUT_NUMERO_PEDIDO);	
	}
	
	//@Test
	/**
	 * CN00002 - Parte 4
	 * 
	 * Executa procedimentos para Devolução do pedido no PDV
	 */
	public void AUT_IT00009_STPDV_ID00003_FRT003_CN00002_RETIR_EXT_IMEDIATA_DINHEIRO_ESTRANGEIRO_COM_DEVOLUCAO_PARTE4() {
		cn00002_4.autStartProcess02(AUT_NUMERO_PEDIDO);		
	}
	
	//@Test
	/**
	 * CN00002 - Parte 5
	 * 
	 * Executa procedimentos para validar Vale Troca no SAFE
	 */
	public void AUT_IT00010_STSAFE_ID00003_FRT003_CN00002_RETIR_EXT_IMEDIATA_DINHEIRO_ESTRANGEIRO_COM_DEVOLUCAO_PARTE5() {
		cn00002_5.autStartProcess02(AUT_NUMERO_PEDIDO);	
	}
	
	//************************* FIM RETIR_EXT_IMEDIATA_DINHEIRO_ESTRANGEIRO_COM_DEVOLUCAO ******************************************

	
	
	//************************* INI RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE1 ******************************************

	//@Test
	/**
	 * CN00003 - Parte 1
	 * 
	 * Executa procedimentos Criar Pedido e Consultar Status no VA
	 */
	public void AUT_IT00011_STVA_ID00003_FRT003_CN00003_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE1() {
		AUT_NUMERO_PEDIDO = cn00003_1.autStartProcess03();
	}
	
	//@Test
	/**
	 * CN00003 - Parte 2
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00012_STVA_ID00003_FRT003_CN00003_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE1() {
		cn00003_2.autStartProcess03(AUT_NUMERO_PEDIDO);		
	}
	
	//@Test
	/**
	 * CN00003 - Parte 3
	 * 
	 * Executa procedimentos para faturar pedido no SAP
	 */
	public void AUT_IT00013_STSAP_ID00003_FRT003_CN00003_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE3() {
		cn00003_3.autStartProcess03(AUT_NUMERO_PEDIDO);	
	}
	
	//@Test
	/**
	 * CN00003 - Parte 4
	 * 
	 * Executa procedimentos para Devolução do pedido no PDV
	 */
	public void AUT_IT00014_STPDV_ID00003_FRT003_CN00003_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE4() {
		//cn00003_4.autStartProcess03(AUT_NUMERO_PEDIDO);		
	}
	
	//@Test
	/**
	 * CN00003 - Parte 5
	 * 
	 * Executa procedimentos para validar Vale Troca no SAFE
	 */
	public void AUT_IT00015_STSAFE_ID00003_FRT003_CN00003_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE5() {
		//cn00003_5.autStartProcess03(AUT_NUMERO_PEDIDO);	
	}
	//************************* FIM RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO ******************************************

	
	
	//************************* INI _RETIR_INT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE1 ******************************************

	//@Test
	/**
	 * CN00004 - Parte 1
	 * 
	 * Executa procedimentos Criar Pedido e Consultar Status no VA
	 */
	public void AUT_IT00016_STVA_ID00004_FRT003_CN00004_RETIR_INT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE1() {
		AUT_NUMERO_PEDIDO = cn00004_1.autStartProcess04();
	}
	
	//@Test
	/**
	 * CN00004 - Parte 2
	 * 
	 * Executa procedimentos para pagamento de pedido no PDV
	 */
	public void AUT_IT00017_STVA_ID00004_FRT003_CN00004_RETIR_INT_IMEDIATA_DINHEIRO_PF_COM_DEVOLUCAO_PARTE1() {
		cn00004_2.autStartProcess04(AUT_NUMERO_PEDIDO);		
	}
	
	//@Test
	/**
	 * CN00004 - Parte 3
	 * 
	 * Executa procedimentos para faturar pedido no SAP
	 */
	public void AUT_IT00018_STSAP_ID00003_FRT003_CN00004_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE3() {
		cn00004_3.autStartProcess04(AUT_NUMERO_PEDIDO);	
	}
	
	//@Test
	/**
	 * CN00004 - Parte 4
	 * 
	 * Executa procedimentos para Devolução do pedido no PDV
	 */
	public void AUT_IT00019_STPDV_ID00003_FRT003_CN00004_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE4() {
		//cn00004_4.autStartProcess04(AUT_NUMERO_PEDIDO);		
	}
	
	//@Test
	/**
	 * CN00004 - Parte 5
	 * 
	 * Executa procedimentos para validar Vale Troca no SAFE
	 */
	public void AUT_IT00020_STSAFE_ID00003_FRT003_CN00004_RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO_PARTE5() {
		//cn00004_5.autStartProcess04(AUT_NUMERO_PEDIDO);	
	}
	//************************* FIM RETIR_EXT_IMEDIATA_DINHEIRO_PJ_COM_DEVOLUCAO ******************************************
	
	
}