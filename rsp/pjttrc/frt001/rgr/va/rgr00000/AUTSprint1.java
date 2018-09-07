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
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_FLUXO_SAIDA;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_MEIOS_PAGAMENTO;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_PLANO_PAGAMENTO;
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
	public static AUTHMCCadastros cadastrosHMC = null;	
	public static AUTVACadastros cadastrosVA = null;
	
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	
	/**
	 * 
	 * Configura os parametros de inicialização para realização de cadastros no HMC 
	 * 
	 */
	@Test
	public void AUT_CT000_CONFIG_HMC_CADASTROS() {
		cadastrosHMC = new AUTHMCCadastros();
	}
	
	/**
	 * 
	 * Executa os procedimentos de cadastro para loja-0035
	 * 
	 */
		@Test
	public void AUT_CT000_HMC_CADASTRO_USUARIO_LOJA_0035() {
		AUT_LOJA_CADASTRO = "0035";
		cadastrosHMC.autCadastrarUsuarioHMC(AUT_LOJA_CADASTRO);
	}	

	
	/**
	 * 
	 * Configura os parametros de inicialização para cadastros de clientes-VA
	 * 
	 */
	@Test
	public void AUT_CT001_VA_CONFIG_CADASTRO_CLIENTES() {
		cadastrosVA = new AUTVACadastros();
		cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_USER", cadastrosHMC.AUT_USUARIO_CADASTRO_OUTPUT);
		cadastrosVA.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.AUT_VA_LOGIN, "AUT_PASSWORD", cadastrosHMC.AUT_USUARIO_CADASTRO_PWD_OUTPUT);		
	}	
	
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Física
	 * 
	 */
	@Test
	public void AUT_CT002_VA_CADASTRO_CLIENTE_PF_0035() {
		cadastrosVA.autInitClientMenuCadastroPF();
	}

	
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Pessoa Jurídica
	 * 
	 */
	@Test
	public void AUT_CT003_VA_CADASTRO_CLIENTE_PJ_LJ0035() {
		cadastrosVA.autInitClientMenuCadastroPJ();
	}

	
	/**
	 * 
	 * Executa procedimentos para cadastro de cliente - Estrangeiro
	 * 
	 */
	@Test
	public void AUT_CT004_VA_CADASTRO_CLIENTE_ESTRANGEIRO_LJ0035() {
		cadastrosVA.autInitClientMenuCadastroExtrangeiro();
	}
	
}
