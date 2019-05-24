
package br.lry.qa.rsp.pjttrc.entregas;
	
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.lry.components.va.AUTVABaseServices;
	
	
	
	/**
	 * 
	 *Regressivo de testes integrados - Módulo de Pedidos VA
	 * 
	 * @author Softtek-QA
	 *
	 */

	@FixMethodOrder(MethodSorters.NAME_ASCENDING)
	public class AUTEntrega004_RGR001{	
		public static br.lry.components.va.AUTVABaseServices va;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CN00001 cn00001;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00002.CN00002 cn00002;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00003.CN00003 cn00003;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00004.CN00004 cn00004;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005.CN00005 cn00005;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006.CN00006 cn00006;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00007.CN00007 cn00007;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CN00008 cn00008;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00009.CN00009 cn00009;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00010.CN00010 cn00010;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00011.CN00011 cn00011;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00012.CN00012 cn00012;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00013.CN00013 cn00013;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00014.CN00014 cn00014;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00015.CN00015 cn00015;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00016.CN00016 cn00016;		
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00017.CN00017 cn00017;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00018.CN00018 cn00018;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00019.CN00019 cn00019;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00020.CN00020 cn00020;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00021.CN00021 cn00021;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00022.CN00022 cn00022;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00023.CN00023 cn00023;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00024.CN00024 cn00024;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00025.CN00025 cn00025;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00026.CN00026 cn00026;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00027.CN00027 cn00027;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00028.CN00028 cn00028;
		public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00029.CN00029 cn00029;	
		
		String hostExec = "192.168.0.116";
		
		public void AUT_INIT() {
			AUT_IT00000_STCFG_ID00012_FRT012_CN00000();
		}
		
		
		/**
		 * 
		 * 
		 * Mapeamento das configurações para execução dos cenários do módulo de Pedidos
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 * 
		 */
		@Test
		public void AUT_IT00000_STCFG_ID00012_FRT012_CN00000() {				
			cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CN00001();
			cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00002.CN00002();
			cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00003.CN00003();
			cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00004.CN00004();
			cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005.CN00005();
			cn00006 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00006.CN00006();
			cn00007 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00007.CN00007();
			cn00008 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CN00008();
			cn00009 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00009.CN00009();
			cn00010 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00010.CN00010();
			cn00011 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00011.CN00011();
			cn00012 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00012.CN00012();
			cn00013 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00013.CN00013();
			cn00014 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00014.CN00014();				
			cn00015 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00015.CN00015();
			cn00016 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00016.CN00016();			
			cn00017 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00017.CN00017();
			cn00018 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00018.CN00018();
			cn00019 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00019.CN00019();
			cn00020 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00020.CN00020();
			cn00021 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00021.CN00021();
			cn00022 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00022.CN00022();
			cn00023 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00023.CN00023();
			cn00024 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00024.CN00024();
			cn00025 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00025.CN00025();
			cn00026 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00026.CN00026();
			cn00027 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00027.CN00027();
			cn00028 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00028.CN00028();
			cn00029 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00029.CN00029();			
			cn00029.autInitConfigurationProjectExecution(AUTEntrega004_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT);
		}
		
		@Test
		/**
		 * 
		 * CN00001 - Realizar um pedido com recuperação de Orçamento
		 */
		public void AUT_IT00001_STVA_ID00012_FRT012_CN00001_REALIZAR_PEDIDO_COM_RECUPERACAO_ORCAMENTO_LOJA0035() {
				cn00001.autStartProcess01();
		}


		@Test
		/**
		 * 
		 * CN00002 - Realizar um pedido com solicitação de Serviço
		 */
		public void AUT_IT00002_STVA_ID00012_FRT012_CN00002_REALIZAR_PEDIDO_COM_SOLICITACAO_SERVICO_LOJA0035() {
				cn00002.autStartProcess02();
		}

		@Test
		/**
		 * 
		 * CN00003 - Realizar pedido com serviço atrelado e outro sem serviço atrelado
		 */
		public void AUT_IT00003_STVA_ID00012_FRT012_CN00003_REALIZAR_PEDIDO_COM_SERVICO_E_COM_ITEM_SEM_SERVICO__LOJA0035() {
				cn00003.autStartProcess03();
		}

		
		@Test
		/**
		 * 
		 * CN00004 - Realizar um pedido com desconto e um serviço atrelado
		 */
		public void AUT_IT00004_STVA_ID00012_FRT012_CN00004_REALIZAR_PEDIDO_COM_SERVICO_E_DESCONTO_LOJA0035() {
				cn00004.autStartProcess04();
		}
		

		@Test
		/**
		 * 
		 * CN00005 - Realizar um pedido através da recuperação do carrinho
		 */
		public void AUT_IT00005_STVA_ID00012_FRT012_CN00005_REALIZAR_PEDIDO_COM_RECUPERACAO_DE_CARRINHO_LOJA0035() {
				cn00005.autStartProcess05();
		}


		@Test
		/**
		 * 
		 * CN00006 - Realizar um pedido através da busca de pedido (em edição)
		 */
		public void AUT_IT00006_STVA_ID00012_FRT012_CN00006_REALIZAR_PEDIDO_PELA_BUSCA_DE_PEDIDO_LOJA0035() {
				cn00006.autStartProcess06();
		}


		@Test
		/**
		 * 
		 *  CN00007 - Realizar um pedido através da inclusão em Massa
		 */
		public void AUT_IT00007_STVA_ID00012_FRT012_CN00007_REALIZAR_PEDIDO_INCLUSAO_EM_MASSA_LOJA0035() {
				cn00007.autStartProcess07();
		}

		
		@Test
		/**
		 * 
		 * CN00008 - Realizar um pedido através da cópia de um pedido
		 */
		public void AUT_IT00008_STVA_ID00012_FRT012_CN00008_REALIZAR_PEDIDO_ATRAVES_DE_COPIA_LOJA0035() {
				cn00008.autStartProcess08();
		}


		@Test
		/**
		 * 
		 * CN00009 - Realizar um pedido com Garantia Estendida
		 */
		public void AUT_IT00009_STVA_ID00012_FRT012_CN00009_REALIZAR_PEDIDO_COM_GARANTIA_ESTENDIDA_LOJA0035() {
				cn00009.autStartProcess09();
		}


		@Test
		/**
		 * 
		 * CN00010 - Realizar um pedido com Garantia Estendida para um Cliente PJ
		 */
		public void AUT_IT00010_STVA_ID00012_FRT012_CN00010_REALIZAR_PEDIDO_GARANTIA_ESTENDIDA_PJ_LOJA0035() {
				cn00010.autStartProcess010();
		}


		@Test
		/**
		 * 
		 * CN00011 - Realizar um pedido com item que tenha registro no Top -
		 */
		public void AUT_IT00011_STVA_ID00012_FRT012_CN00011_REALIZAR_PEDIDO_ITEM_TOP_LOJA0035() {
				cn00011.autStartProcess11();
		}
		

		@Test
		/**
		 * 
		 * CN00012 - Realizar um pedido e inserir desconto em um item
		 */
		public void AUT_IT00012_STVA_ID00012_FRT012_CN00012_REALIZAR_PEDIDO_COM_DECONTO_NO_ITEM_EM_REAIS_LOJA0035() {
				cn00012.autStartProcess12();
		}


		@Test
		/**
		 * 
		 * CN00013 - Pedido que não tenha estoque e item top 0 na filial de compra
		 */
		public void AUT_IT00013_STVA_ID00012_FRT012_CN00013_REALIZAR_PEDIDO_ITEM_SEM_EST0QUE_TOP_0_LOJA0035() {
				cn00013.autStartProcess013();
		}


		@Test
		/**
		 * 
		 * CN00014 - Pedido que não tenha estoque e item avs na filial de compra
		 */
		public void AUT_IT00014_STVA_ID00012_FRT012_CN00014_REALIZAR_PEDIDO_SEM_ESTOQUE_AVS_LOJA0035() {
				cn00014.autStartProcess14();
		}
		

		@Test
		/**
		 * 
		 * CN00015 - Realizar um pedido com desconto fora da alçada do usuário
		 */
		public void AUT_IT00015_STVA_ID00012_FRT012_CN00015_REALIZAR_PEDIDO_COM_DESCONTO_FORA_DA_ALCADA_LOJA0035() {
				cn00015.autStartProcess15();	
		}
		

		@Test
		/**
		 * 
		 * CN00016 - Realizar um pedido e adicionar produtos complementares
		 */
		public void AUT_IT00016_STVA_ID00012_FRT012_CN000016_REALIZAR_PEDIDO_PRODUTOS_COMPLEMENTARES_BLOQUEADO_LOJA0035() {
				cn00016.autStartProcess16();
		}

		
		@Test
		/**
		 * 
		 * CN00017 - Pedido com desconto funcionario
		 * 
		 */
		public void AUT_IT00017_STVA_ID00012_FRT012_CN00017_REALIZAR_PEDIDO_COM_DESCONTO_FUNCIONARIO_LOJA0035() {
				cn00017.autStartProcess17();
		}

		
		@Test
		/**
		 * 
		 * CN00018 - Pedido com desconto funcionario e MDH - 20% desconto automatico
		 */
		public void AUT_IT00018_STVA_ID00012_FRT012_CN00018_REALIZAR_PEDIDO_COM_DESCONTO_FUNCIONARIO_MDH_LOJA0035() {
				cn00018.autStartProcess18();
		}
	
		
		@Test
		/**
		 * 
		 * CN00019 - Pedido com desconto na seção em porcentagem
		 */
		public void AUT_IT00019_STVA_ID00012_FRT012_CN00019_REALIZAR_PEDIDO_COM_DESCONTO_NA_SECAO_EM_PORCENTAGEM_LOJA0035() {
				cn00019.autStartProcess19();
		}
		
		
		@Test
		/**
		 * 
		 * CN00020 - Pedido com desconto na seção em reais
		 */
		public void AUT_IT00020_STVA_ID00012_FRT012_CN00020_REALIZAR_PEDIDO_COM_DESCONTO_NA_SECAO_EM_REAIS_LOJA0035() {
				cn00020.autStartProcess20();
		}
		
		
		@Test
		/**
		 * 
		 * CN00021 - Pedido com desconto na seção em porcentagem itens 
		 * não elegiveis
		 */
		public void AUT_IT00021_STVA_ID00012_FRT012_CN00021_REALIZAR_PEDIDO_DESCONTO_NA_SECAO_ITENS_NAO_ELEGIVEIS_LOJA0035() {
				cn00021.autStartProcess21();
		}
		
		
		@Test
		/**
		 * 
		 * CN00022 - Pedido com desconto na seção em reais com itens não elegiveis
		 */
		public void AUT_IT00022_STVA_ID00012_FRT012_CN00022_REALIZAR_PEDIDO_COM_DESCONTO_EM_REAIS_ITENS_NAO_ELEGIVEIS_LOJA0035() {
				cn00022.autStartProcess22();
		}
		
		
		@Test
		/**
		 * 
		 * CN00023 - Pedido com desconto no total em porcentagem
		 */
		public void AUT_IT00023_STVA_ID00012_FRT012_CN00023_REAILZAR_PEDIDO_COM_DESCONTO_TOTAL_EM_PORCENTAGEM_LOJA0035() {
				cn00023.autStartProcess23();
		}

		
		@Test
		/**
		 * 
		 * CN00024 - Pedido com desconto no total em reais
		 */
		public void AUT_IT00024_STVA_ID00012_FRT012_CN00024_REALIZAR_PEDIDO_COM_DESCONTO_TOTAL_EM_REAIS_LOJA0035() {
				cn00024.autStartProcess24();
		}
		
		
		@Test
		/**
		 * 
		 * CN00025 - Pedido com desconto no total em porcentagem itens não elegiveis
		 */
		public void AUT_IT00025_STVA_ID00012_FRT012_CN00025_REALIZAR_PEDIDO_COM_DESCONTO_TOTAL_EM_PORCENTAGEM_ITENS_NAO_ELEGIVEIS_LOJA0035() {
				cn00025.autStartProcess25();
		}

		
		@Test
		/**
		 * 
		 * CN00026 - Pedido com desconto no total em reais com itens não elegiveis
		 */
		public void AUT_IT00026_STVA_ID00012_FRT012_CN00026_REALIZAR_PEDIDO_COM_DESCONTO_TOTAL_EM_REAIS_ITENS_NAO_ELEGIVEIS_LOJA0035() {
				cn00026.autStartProcess26();
		}
	
		
		@Test
		/**
		 * 
		 * CN00027 - Pedido com desconto pontual sobre administrado não elegivel
		 */
		public void AUT_IT00027_STVA_ID00012_FRT012_CN00027_REALIZAR_PEDIDO_PONTUAL_SOBRE_ADMINISTRADO_NAO_ELEGIVEL_LOJA0035() {
				cn00027.autStartProcess27();
		}

		
		@Test
		/**
		 * 
		 * CN00028 - Pedido com desconto pontual sobre administrado elegivel
		 */
		public void AUT_IT00028_STVA_ID00012_FRT012_CN00028_REALIZAR_PEDIDO_PONTUAL_SOBRE_ADMINISTRADO_ELEGIVEL_LOJA0035() {
				cn00028.autStartProcess28();			
		}
		
		
		//@Test
		/**
		 * 
		 * CN00029 - Pedido com desconto pontual sobre promoção complexa
		 */
		public void AUT_IT00029_STVA_ID00012_FRT012_CN00029_REALIZAR_PEDIDO_COM_DESCONTO_PONTUAL_SOBRE_PROMOCAO_COMPLEXA_LOJA0035() {
				cn00029.autStartProcess29();			
		}

	}
		