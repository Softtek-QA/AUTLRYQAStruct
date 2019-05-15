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
public class AUTEntrega010_RGR001 {
	
	
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00001.CN00001 cn00001;
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00002.CN00002 cn00002;


	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";

	public void AUT_INIT() {
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00002.CN00002();

		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega010_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT);

	}
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização dos testes de geração de pedidos	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00030_FRT030_CN00000_CONFIG() {
		
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00001.CN00001();
		cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00002.CN00002();

		gerTests = new AUTFWKTestObjectBase();
		gerTests.autInitConfigurationProjectExecution(AUTEntrega010_RGR001.class, AUT_TEST_STATUS_EXECUCAO.WAIT.toString());
	
	}
	

	

			
	@Test
	/**
	 * CN00001 - Excluir item
	 */
	public void AUT_IT00001_STVA_ID00030_FRT030_CN00001_EXCLUIR_ITEM_LOJA0035() {
			cn00001.autStartProcess01();
	}
	
	
	//@Test
	/**
	 * CN00002 - Excluir itens da seção
	 */
	public void AUT_IT00002_STVA_ID00030_FRT030_CN00002_EXCLUIR_ITENS_DA_SECAO_LOJA0035() {
			cn00002.autStartProcess02();
	}
	
		

	
	
	
	
}
