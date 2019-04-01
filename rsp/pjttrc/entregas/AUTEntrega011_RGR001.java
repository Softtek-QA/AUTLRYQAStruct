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
public class AUTEntrega011_RGR001 {
	
	public static AUTFWKTestObjectBase gerTests;
	String hostExec = "192.168.0.116";

	br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00001.CN00001 cn01;
	br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00002.CN00002 cn02;
	br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00003.CN00003 cn03;
	public void AUT_INIT() {

	}
	
	@Test
	public  void AUT_IT11001_STVA_ID00030_FRT030_CN00001_PEDIDO_CRIACAO_EDICAO_ALTERACAO_DEPOSITOS_LOJAS() {
		cn01 = new br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00001.CN00001();
		cn01.autStartProcess();
	}

	@Test
	public  void AUT_IT11002_STVA_ID00030_FRT030_CN00002_PEDIDO_CRIACAO_EDICAO_ALTERACAO_DEPOSITOS_LOJAS() {
		cn02 = new br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00002.CN00002();
		cn02.autStartProcess();
	}

	@Test
	public  void AUT_IT11003_STVA_ID00030_FRT030_CN00003_PEDIDO_CRIACAO_EDICAO_ALTERACAO_DEPOSITOS_LOJAS() {
		cn03 = new br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00003.CN00003();
		cn03.autStartProcess();
	}
		
}
