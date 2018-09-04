/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.internal.runners.TestMethod;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.*;
import com.borland.silktest.jtf.internal.JunitUtil;
import com.borland.silktest.silk4j.playback.TestResult;
import com.borland.silktest.silk4j.playback.TestRunResultProcessor;

import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001.AUTVA01CadastroCliente;


/**
 * 
 *Regressivo de testes integrados - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTSprint1{	
	public static AUTVACadastros cadastros = null; //Define a suite de testes focados em cadastros de clientes nas lojas
	public static AUTVAGeradorPedido pedidos = null; //Define a suite de testes para criação de pedidos	
	public static AUTHMCCadastros cadastrosHMC = null;
	
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	
	/**
	 * 
	 * Retorna o gerenciador de componentes automatizados para módulo de cadastro
	 * 
	 * @return AUTVACadastros - Objeto para gerenciamento de cadastros
	 * 
	 */
	public AUTVACadastros autGetIncludeClientManagement() {
		return new AUTVACadastros();
	}
	
	
	/**
	 * 
	 * Retorna o gerenciador de componentes automatizados de pedidos
	 * 
	 * @return AUTVAGeradorPedido - Gerenciador de pedidos
	 * 
	 */
	public AUTVAGeradorPedido autGetRequestsManagement() {		
		pedidos = new AUTVAGeradorPedido(USUARIO_GLOBAL,SENHA_GLOBAL);
		return pedidos;
	}
	
	@Test
	public void AUT_CT000_HMC_CADASTRO_USUARIOS_VA() {
		cadastrosHMC = new AUTHMCCadastros();
		cadastrosHMC.autCadastrarUsuarioHMC();
	}
	
	
	
	@Test
	public void AUT_CT001_CADASTROS_CONFIGURACAO() {
		cadastros = autGetIncludeClientManagement();
	}
	
	@Test
	public void AUT_CT002_CADASTRO_PESSOA_FISICA() {
		cadastros.autInitClientMenuCadastroPF();
	}
	
	
	@Test
	public void AUT_CT003_CADASTRO_PESSOA_ESTRANGEIRO() {
		cadastros.autInitClientMenuCadastroExtrangeiro();
	}

	@Test
	public void AUT_CT004_CADASTRO_PESSOA_JURIDICA() {
		cadastros.autInitClientMenuCadastroPJ();
	}

	@Test
	public void AUT_CT005_CONFIGURACAO_PARAMETROS_PEDIDOS() {
		USUARIO_GLOBAL = cadastros.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN,"AUT_USER").toString();
		SENHA_GLOBAL = cadastros.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN,"AUT_PASSWORD").toString();
		pedidos = autGetRequestsManagement();		
		pedidos.AUT_CLIENT_DOC_CPF = cadastros.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS,"AUT_CPF").toString();
		pedidos.AUT_CLIENT_DOC_CNPJ = cadastros.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS,"AUT_CNPJ").toString();
		pedidos.AUT_CLIENT_DOC_PASSAPORT = cadastros.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_CADASTROS,"AUT_PASSAPORTE").toString();	
		pedidos.AUT_VA_USER = USUARIO_GLOBAL;
		pedidos.AUT_VA_PASSWORD = SENHA_GLOBAL;
		pedidos.AUT_CLIENT_TYPE = AUT_VA_CADASTROS.FISICA;			
	}
	
	@Test
	public void AUT_CT006_GERAR_PEDIDO_CAIXA_PAG_DINHEIRO_CLIENT_PF() {
		pedidos.autCaixaPagDinheiro();
	}

	@Test
	public void AUT_CT007_GERAR_PEDIDO_CAIXA_PAG_CARTAO_CLIENT_PF() {
		pedidos.autCaixaPagCartaoCredito();
	}

	@Test
	public void AUT_CT008_GERAR_PEDIDO_CAIXA_PAG_CARTAO_CELEBRE_CLIENT_PF() {
		pedidos.autCaixaPagCartaoCelebre();
	}

	@Test
	public void AUT_CT009_GERAR_PEDIDO_RET_INTERNA_IMED_PAG_CARTAO_CLIENT_PF() {
		pedidos.autRetiraInternaImediataPagCartaoCredito();
	}

	@Test
	public void AUT_CT0010_GERAR_PEDIDO_RET_INTERNA_IMED_PAG_CARTAO_CELEBRE_CLIENT_PF() {
		pedidos.autRetiraInternaImediataPagCartaoCelebre();
	}
	
	@Test
	public void AUT_CT011_GERAR_PEDIDO_RET_INTERNA_IMED_PAG_DINHEIRO_CLIENT_PF() {
		pedidos.autRetiraInternaImediataPagDinheiro();
	}

	@Test
	public void AUT_CT012_GERAR_PEDIDO_RET_EXTERNA_IMED_PAG_CARTAO_CLIENT_PF() {
		pedidos.autRetiraExternaImediataPagCartaoCredito();
	}

	@Test
	public void AUT_CT013_GERAR_PEDIDO_RET_EXTERNA_IMED_PAG_CARTAO_CELEBRE_CLIENT_PF() {
		pedidos.autRetiraExternaImediataPagCartaoCelebre();
	}
	
	@Test
	public void AUT_CT014_GERAR_PEDIDO_RET_EXTERNA_IMED_PAG_DINHEIRO_CLIENT_PF() {
		pedidos.autRetiraExternaImediataPagDinheiro();
	}
	
	
	/**
	 * 
	 * Construtor padrão da classe
	 * 
	 */
	public AUTSprint1() {
		super();
		
	}
}
