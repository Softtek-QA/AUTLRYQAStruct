/**
 * 
 */
package br.lry.qa.rsp.pjttrc.entregas;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;



/**
 * 
 *Regressivo de testes integrados - Vendas Assistidas - Televendas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega003_RGR001{	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001.CN00001 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00002.CN00002 cn00002;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00003.CN00003 cn00003;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00004.CN00004 cn00004;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00005.CN00005 cn00005;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006.CN00006 cn00006;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00007.CN00007 cn00007;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008.CN00008 cn00008;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009.CN00009 cn00009;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00010.CN00010 cn00010;	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00011.CN00011 cn00011;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CN00012 cn00012;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013.CN00013 cn00013;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CN00014 cn00014;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CN00015 cn00015;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CN00016 cn00016;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CN00017 cn00017;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00018.CN00018 cn00018;



	String hostExec = "192.168.0.116";
	
	
	public void AUT_INIT() {
		 AUT_CFG_ID00009_FRT009_CN00000();
	}
	
	/**
	 * 
	 * 
	 * Mapeamento das configurações para execução dos cenários do módulo de Televendas
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void AUT_CFG_ID00009_FRT009_CN00000() {	
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00002.CN00002();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00003.CN00003();
		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00005.CN00005();		
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00004.CN00004();
		cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00006.CN00006();
		cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00007.CN00007();
		cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00008.CN00008();
		cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009.CN00009();
		cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00010.CN00010();		
		cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00011.CN00011();
		cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00012.CN00012();
		cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00013.CN00013();
		cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CN00014();
		cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CN00015();
		cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CN00016();
		cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CN00017();
		cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00018.CN00018();
		
		cn00018.autInitConfigurationProjectExecution(AUTEntrega003_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT);
	}

	
	@Test
	/**
	 * 01
	 * 
	 * CN00001 - Realizar a troca de loja utilizando usuario televenda
	 */
	public void AUT_IT00001_STVA_ID00009_FRT009_CN00001_TROCA_LOJA_LOJA0045() {
			cn00001.autStartProcess();
	}
	
	
	@Test
	/**
	 * 02
	 * 
	 * CN00002 - Pedido Televendas pagamento Cart Créd e ign. Antifraude
	 */
	public void AUT_IT00002_STVA_ID00009_FRT009_CN00002_IGNORAR_ANTIFRAUDE_LOJA0035() {
			cn00002.autStartProcess();
	}
	
	@Test
	/**
	 * 03
	 * 
	 * CN00003 - Pedido Televendas pagamento aprovar antifraude
	 */
	public void AUT_IT00003_STVA_ID00009_FRT009_CN00003_APROVAR_ANTIFRAUDE_LOJA0035() {
			cn00003.autStartProcess();
	}
	
	@Test
	/**
	 * 04
	 * 
	 * CN00004 - Pedido Televendas pagamento Cart Créd e Apr. Auto. Antifraude
	 */
	public void AUT_IT00004_STVA_ID00009_FRT009_CN00004_APROVAR_AUTO_ANTIFRAUDE_LOJA0035() {
			cn00004.autStartProcess();
	}
	
	
	@Test
	/**
	 * 06
	 * 
	 * CN00006 - Cartão caindo na antifraude e reprovando
	 */
	public void AUT_IT00005_STVA_ID00009_FRT009_CN00005_CARTAO_ANTIFRAUDE_REPROVA_LOJA0035() {
			cn00005.autStartProcess();
	}
	
	
	@Test
	/**
	 * 07
	 * 
	 * CN00007 - Cartão caindo na antifraude e reprovando
	 */
	public void AUT_IT00006_STVA_ID00009_FRT009_CN00006_CARTAO_ANTIFRAUDE_REPROVA_ATIVA_LOJA0035() {
			cn00006.autStartProcess06();
	}
	
	@Test
	/**
	 * 08
	 * 
	 * CN00008 - Pedido Televendas pag Cart Créd e Voucher pedido aprov comercial
	 */
	public void AUT_IT00007_STVA_ID00009_FRT009_CN00007_PEDIDO_APROVACAO_COMERCIAL_LOJA0035() {
			cn00007.autStartProcess07();
	}
	
	
	@Test
	/**
	 * 09
	 * 
	 * CTP00001 - Pedido Televendas pag Cart Créd e Voucher pedido reeditado
	 */
	public void AUT_IT00008_STVA_ID00009_FRT009_CN00008_PEDIDO_REEDITADO_Voucher_LOJA0045() {
			cn00008.autStartProcess08();
	}
	
	
	@Test
	/**
	 * 11
	 * 
	 * CN00011 - Pedido Televendas pag Cart Créd e Vale Créd cart antifra e reprov
	 */
	public void AUT_IT00009_STVA_ID00009_FRT009_CN00009_PEDIDO_ANTIFRAUDE_REPROVADO_LOJA0035() {
			cn00009.autStartProcess();
	}	
	
	
	@Test
	/**
	 * 12
	 * 
	 * CN00012 - Pedido Televenda pag Cart Créd e Vale Créd ign. antifraude e rep.
	 */
	public void AUT_IT00010_STVA_ID00009_FRT009_CN00010_PEDIDO_IGNORAR_ANTIFRAUDE_REPROVADO_LOJA0035() {
			cn00010.autStartProcess10();
	}
	
	
	@Test
	/**
	 * 13
	 * 
	 * CN00013 - Pedido Televenda pag Cart Créd e Vale Créd, na aprov. Comercial
	 */
	public void AUT_IT00011_STVA_ID00009_FRT009_CN00011_PEDIDO_APROVACAO_COMERCIAL_LOJA0035() {
			cn00011.autStartProcess11();
	}	
	
	@Test
	/**
	 * 14
	 * 
	 * CN00014 - Pedido Televenda pag Cart Créd e Vale Créd, pedido reeditado
	 */
	public void AUT_IT00012_STVA_ID00009_FRT009_CN00012_PEDIDO_REEDITADO_LOJA0045() {
			cn00012.autStartProcess12();
	}
	
	
	
	@Test
	/**
	 * 15
	 * 
	 * CN00015 - Pedido Televendas com loja diferente do pedido e depois editandow
	 */
	public void AUT_IT00013_STVA_ID00009_FRT009_CN00013_COPIAR_PEDIDO_PARA_LOJA_DIFERENTE_EDITANDO_LOJA0035() {
			cn00013.autStartProcess();
	}
	
	
	@Test
	/**
	 * 16
	 * 
	 * CN00016 -Pedido Televendas com loja diferente do pedido e depois copiando
	 */
	public void AUT_IT00014_STVA_ID00009_FRT009_CN00014_COPIAR_PEDIDO_PARA_LOJA_DIFERENTE_LOJA0045() {
			cn00014.autStartProcess();
	}
	
	@Test
	/**
	 * 17
	 * 
	 * CN00017 - Usuário televendas copiando um pedido do canal Loja
	 */
	public void AUT_IT00015_STVA_ID00009_FRT0097_CN00015_COPIAR_PEDIDO_CANAL_LOJA_LOJA0045() {
			cn00015.autStartProcess();
	}
	
	
	@Test
	/**
	 * 18
	 * 
	 * CN00018 - Pedido do canal televendas com opção de pagamento "Pagar na loja"
	 */
	public void AUT_IT00016_STVA_ID00009_FRT009_CN00016_PEDIDO_TELEVENDAS_PAGAR_LOJA_LOJA0035() {
			cn00016.autStartProcess();
	}
	
	
	@Test
	/**
	 * 17
	 * 
	 * CN00017 - Pedido do canal televendas com opção de pagamento "Pagar na loja"
	 */
	public void AUT_IT00017_STVA_ID00009_FRT009_CN00017_USUARIO_TELEVENDAS_COPIANDO_PEDIDO_CANAL_LOJA() {
			cn00017.autStartProcess();
	}

}
	