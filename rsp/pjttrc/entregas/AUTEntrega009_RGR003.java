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
public class AUTEntrega009_RGR003 {
	
	
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CN00001 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00002.CN00002 cn00002;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003.CN00003 cn00003;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00004.CN00004 cn00004;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00005.CN00005 cn00005;


	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização dos testes de geração de pedidos	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00029_FRT029_CN00000_CONFIG() {
		
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00002.CN00002();
		cn00003 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00003.CN00003();
		cn00004 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00004.CN00004();
		cn00005 = new br.lry.qa.rsp.pjttrc.frt001.va.md00003.cn00005.CN00005();

		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega009_RGR003.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	

	

			
	@Test
	/**
	 * CN00001 - Monitor de aprovação parcial
	 */
	public void AUT_IT00001_STVA_ID00029_FRT029_CN00001_MONITOR_APROVACAO_PARCIAL_LOJA0035() {
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
	 * CN00002 - Usuário aprovador aumentando o desconto aplicado e aprovando
	 */
	public void AUT_IT00002_STVA_ID00029_FRT029_CN00002_USUARIO_APROVADOR_AUMENTANDO_O_DESCONTO_APLICADO_E_APROVADO_LOJA0035() {
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
	 * CN00003 - Usuário aprovador diminuindo o desconto aplicado e aprovando
	 */
	public void AUT_IT00003_STVA_ID00029_FRT029_CN00003_USUARIO_APROVADOR_DIMINUINDO_O_DESCONTO_APLICADO_E_APROVANDO_LOJA0035() {
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
	 * CN00004 - Usuário aprovador parcial aumentando o desconto acima da alçada
	 */
	public void AUT_IT00004_STVA_ID00029_FRT029_CN00004_USUARIO_APROVADOR_PARCIAL_AUMENTANDO_O_DESCONTO_ACIMA_DA_ALCADA_LOJA0035() {
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
	 * CN00005 - Usuário aprovador alterando o desconto e abortando a operação
	 */
	public void AUT_IT00005_STVA_ID00029_FRT029_CN00005_USUARIO_APROVADOR_ALTERANDO_O_DESCONTO_E_ABORTANDO_A_OPERACAO_LOJAS0035() {
		try{
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.EXECUTION);
			cn00005.autStartProcess05();
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.PASSED);
		}
		catch(java.lang.Exception e) {
			gerTests.autSyncStateExecution(AUT_SYNC_EXECUTION_STATE.FAILED);
		}
	}
	
	
	
}
