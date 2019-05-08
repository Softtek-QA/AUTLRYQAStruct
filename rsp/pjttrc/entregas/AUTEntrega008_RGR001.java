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
public class AUTEntrega008_RGR001 {
	
	
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001.CN00001 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00002.CN00002 cn00002;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003.CN00003 cn00003;


	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";
	public void AUT_INIT() {
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00002.CN00002();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003.CN00003();

		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega008_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT);
	}
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização dos testes de geração de pedidos	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00024_FRT024_CN00000_CONFIG() {
		
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00002.CN00002();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00006.cn00003.CN00003();

		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega008_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	

	

			
	@Test
	/**
	 * CN00001 - Usuário aprovador antifraude aprovando um pedido
	 */
	public void AUT_IT00001_STVA_ID00024_FRT024_CN00001_USUARIO_APROVADOR_ANTIFRAUDE_APROVANDO_UM_PEDIDO_LOJA0035() {
			cn00001.autStartProcess01();
	}
	
	
	@Test
	/**
	 * CN00002 - Usuário aprovador antifraude reprovando um pedido
	 */
	public void AUT_IT00002_STVA_ID00024_FRT024_CN00002_USUARIO_APROVADOR_ANTIFRAUDE_REPROVANDO_UM_PEDIDO_LOJA0035() {
			cn00002.autStartProcess02();
	}
	
		
	@Test
	/**
	 * CN00003 - Aprovador antifraude encaminha pedido para análise pelo monitor
	 */
	public void AUT_IT00003_STVA_ID00024_FRT024_CN00003_APROVADOR_ANTIFRAUDE_ENCAMINHA_PEDIDO_PARA_ANALISE_PELO_MONITOR_LOJA0035() {
			cn00003.autStartProcess03();
	}
	
	
	
	
	
}
