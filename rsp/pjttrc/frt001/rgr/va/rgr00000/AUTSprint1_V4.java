/**
 * 
 */
package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;

import com.borland.silktest.jtf.SilkTestSuite;
import com.borland.silktest.jtf.common.VerificationFailedException;

import br.lry.components.AUTBaseComponent.AUT_SYNC_EXECUTION_STATE;
import br.lry.components.AUTBaseComponent.AUT_TEST_STATUS_EXECUCAO;
import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVACadastros.AUT_VA_CADASTROS;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_FLUXO_SAIDA;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_MEIOS_PAGAMENTO;
import br.lry.components.va.AUTVAGeradorPedido.AUT_VA_PLANO_PAGAMENTO;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.process.AUTPDVConsultaPrecoItem;
import br.lry.process.AUTPDVDevolucaoItem;
import br.lry.process.AUTPDVPagamentoPedido;
import br.lry.process.AUTSAPConsultaEstoque;
import br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00001.AUTVA03ConsultaStatusPedido;
import br.stk.framework.tests.AUTFWKTestObjectBase;
import br.stkframework.db.management.AUTDBProject.AUT_PROJECT_SQL_PROPERTY;
import junit.framework.JUnit4TestAdapter;


/**
 * 
 *Regressivo de testes integrados - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTSprint1_V4{	
	public static AUTFWKTestObjectBase gerTests;
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVACadastros cadastrosVA;
	public static AUTVAGeradorPedido geradorPedidos;
	public static AUTVA03ConsultaStatusPedido consultaStatusPedido;
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	String hostExec = "192.168.0.116";

	/**
	 * Enumera as opções de configuração para expressões regulares de configuração, usadas na carga de parametros em empo 
	 * 
	 */
	public static enum AUT_REG_EXPRESSION_CONFIG_TESTS{
		SCENARIO_NAME,
		SCENARIO_TEST,
		PROJECT_NAME,
		PROJECT_ID,
		RESPONSE_DATA_EMPTY,
		SCENARIO_DESCRIPTION_OUTPUT;
		@Override
		public String toString() {
			switch(this) {
			case SCENARIO_DESCRIPTION_OUTPUT:{
				return " : CENARIO : %s";
			}
			case RESPONSE_DATA_EMPTY:{
				return "ND";
			}
			case SCENARIO_NAME:{
				return "(?i:CN\\d+(\\_{0,}\\w+\\_{0,}))";
			}
			case PROJECT_ID:{
				return "ID\\d+";
			}
			case PROJECT_NAME:{
				return "FRT\\d+";
			}
			case SCENARIO_TEST:{
				return "(?i:AUT\\_\\w+\\_ID\\d+\\_FRT\\d+\\_(\\w+\\_{0,})+)";
			}
			default:{
				return this.name();
			}
			}
		}
	}

	public static class AUTRuntimeExecutionScenario{
		java.util.regex.Pattern regExp = java.util.regex.Pattern.compile("\\d+");
		java.util.regex.Matcher verifId = null;
		String formatOut = "AUT DATA : PROJECT NAME : %s ID : %s : SCENARIO : %s : FULL NAME : %s : ID NUMBER: %s";
		public String AUT_PROJECT_NAME=null;
		public String AUT_PROJECT_ID=null;
		public String AUT_SCENARIO_NAME=null;	
		public String AUT_SCENARIO_FULL_NAME = null;
		
		/**
		 * 
		 * Retorna o dígito numérico relacionado ao ID do projeto
		 * 
		 * @return String - digito número do projeto
		 * 
		 */
		public String autGetIdNumber() {
			java.util.regex.Pattern regExp = java.util.regex.Pattern.compile("\\d+");
			java.util.regex.Matcher verif = regExp.matcher(AUT_PROJECT_ID);
			if(verif.find()) {
				Integer id = Integer.parseInt(verif.group());
				return id.toString();
			}
			else {
				return "";
			}
		}
		
		/**
		 * 
		 * Imprime os dados carregados em tempo de execução em tempo de execução
		 * 
		 */
		public void autPrintData() {
			System.out.println(String.format(formatOut, 
					AUT_PROJECT_NAME,
					AUT_PROJECT_ID,
					AUT_SCENARIO_NAME,
					AUT_SCENARIO_FULL_NAME
					,autGetIdNumber()));			
		}
	} 
	
	/**
	 * 
	 * Valida se existe um cenário na pilha de execução
	 * 
	 */
	public static <TScenarioConfig extends AUTRuntimeExecutionScenario> TScenarioConfig autGetCurrentScenarioRuntime() {
		AUTRuntimeExecutionScenario rtmScn = new AUTRuntimeExecutionScenario();
		try {	
			String value = autGetRuntimeScenarioExecution(AUT_REG_EXPRESSION_CONFIG_TESTS.SCENARIO_TEST.toString()); //Verifica a existência de um cenário na pilha de execução dos testes			
			String outScenario = AUT_REG_EXPRESSION_CONFIG_TESTS.SCENARIO_DESCRIPTION_OUTPUT.toString();
			Boolean status = (value==null ? false : true);		
			if(status) {
				java.util.regex.Pattern regExp = java.util.regex.Pattern.compile(AUT_REG_EXPRESSION_CONFIG_TESTS.PROJECT_ID.toString());
				java.util.regex.Matcher verifProjId = regExp.matcher(value);
				rtmScn.AUT_SCENARIO_FULL_NAME=value;
				if(verifProjId.find()) {
					rtmScn.AUT_PROJECT_ID=verifProjId.group();
					regExp = regExp.compile(AUT_REG_EXPRESSION_CONFIG_TESTS.PROJECT_NAME.toString());
					java.util.regex.Matcher verifProjName = regExp.matcher(value);
					if(verifProjName.find()) {
						rtmScn.AUT_PROJECT_NAME=verifProjName.group();
						regExp = regExp.compile(AUT_REG_EXPRESSION_CONFIG_TESTS.SCENARIO_NAME.toString());
						java.util.regex.Matcher verifScenarioName = regExp.matcher(value);
						if(verifScenarioName.find()) {
							rtmScn.AUT_SCENARIO_NAME=verifScenarioName.group();
							rtmScn.autPrintData();
						}
					}
				}						
				outScenario = String.format(outScenario,value).toUpperCase();		
				rtmScn.autPrintData();
				return (TScenarioConfig) rtmScn;
			}
			else {
				rtmScn.AUT_PROJECT_ID=AUT_REG_EXPRESSION_CONFIG_TESTS.RESPONSE_DATA_EMPTY.toString();
				rtmScn.AUT_PROJECT_NAME=AUT_REG_EXPRESSION_CONFIG_TESTS.RESPONSE_DATA_EMPTY.toString();
				rtmScn.AUT_SCENARIO_NAME=AUT_REG_EXPRESSION_CONFIG_TESTS.RESPONSE_DATA_EMPTY.toString();
				rtmScn.AUT_SCENARIO_FULL_NAME=AUT_REG_EXPRESSION_CONFIG_TESTS.RESPONSE_DATA_EMPTY.toString();
				rtmScn.autPrintData();
				return (TScenarioConfig) rtmScn;
			}
			
		}
		catch(java.lang.Exception e) {
			
			System.out.println("AUT ERROR: VALIDATE EXECUTION SCENARIO");
			System.out.println(e.getMessage());
			e.printStackTrace();
			rtmScn.autPrintData();
			return null;
		}
	}
	
	/**
	 * 
	 * Retorna o item correspondente a expressão regular na pilha de execução
	 * 
	 * @param regExpForScenarioExecution - Expresssão Regular
	 * 
	 * @return String - Nome do método que corresponde a expressão regular de configuração
	 */
	public static String autGetRuntimeScenarioExecution(String regExpForScenarioExecution) {
		java.util.regex.Pattern regExp  = java.util.regex.Pattern.compile(regExpForScenarioExecution); //Inicializa o objeto de compilação da expressão regular
		java.util.regex.Matcher verif =null; //Define a variável de análise da expressão
		String valueOutput = null;
		System.out.println("AUT INFO: GET RUNTIME METHOD EXECUTION : INIT");
		for(StackTraceElement stack : Thread.currentThread().getStackTrace()) {
			verif = regExp.matcher(stack.getMethodName());
			if(verif.find()) {
				valueOutput = verif.group();
			}
		}
		System.out.println("AUT INFO: GET RUNTIME METHOD EXECUTION : END");
		return valueOutput;
	}

	
	public void autTeste() {
		autGetCurrentScenarioRuntime();
	}
	public void autTesteConfiguration() {
		autTeste();
	}
	
	public void AUT_HMC_ID00002_FRT002_VALIDACAO_CADASTRO_CLIENTE_PJ() {
		autTesteConfiguration();
	}
	
	public void AUT_IT000012_STVA_ID00001_FRT001_CN00001_CADASTRO_ITEMS() {
		AUTFWKTestObjectBase test = new AUTFWKTestObjectBase();
		System.out.println(test.autGetCurrentScenarioRuntime());
	}
	
	
	public void AUT_HMC_ID0V001_FRT001_CN00001_() {
		//AUT_HMC_ID00001_FRT001_CN00001_VALIDADOR();
	}

	@Test
	public void TESTE() {
		AUT_IT000012_STVA_ID00001_FRT001_CN00001_CADASTRO_ITEMS();
	}
}
