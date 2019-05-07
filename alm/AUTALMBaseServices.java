/**
 * 
 */
package br.lry.qa.alm;

import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Runner;
import org.junit.runners.JUnit4;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

import com.borland.silktest.jtf.SilkTestSuite;
import br.lry.qa.alm.webservices.scm.AUTALMManage;
import br.lry.qa.alm.webservices.scm.filters.FilterServiceProxy;
import br.lry.qa.alm.webservices.scm.requirements.RequirementsServiceProxy;
import br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR001;
import br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR002;
import br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR003;
import br.lry.qa.rsp.pjttrc.entregas.*;
import br.stk.framework.tests.AUTFWKTestObjectBase;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestResult;

/**
 * 
 * Framework base de implementação dos projetos
 * 
 * @author Softtek-QA
 *
 */
public class AUTALMBaseServices extends AUTFWKTestObjectBase {
	java.util.List<Object> listClassForSearch = new java.util.ArrayList<Object>();		
	br.lry.qa.alm.webservices.scm.AUTALMManage almObj = null;
	br.lry.qa.alm.webservices.scm.administration.AdministrationServiceProxy almAdm = null;
	br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServiceProxy almExecPlan = null;
	br.lry.qa.alm.webservices.scm.filters.FilterServiceProxy almFilter = null;
	br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServiceProxy almIssue = null;
	br.lry.qa.alm.webservices.scm.requirements.RequirementsServiceProxy almRequeriment = null;
	br.lry.qa.alm.webservices.scm.system.SystemServiceProxy almSystemAdm = null;
	br.lry.qa.alm.webservices.scm.tests.TestsServiceProxy almTests = null;
	String autMethodInitTestes = "AUT_INIT"; 

	
	//************************************** CARGA DE SUITES ******************************	
	/**
	 * 
	 */
	public AUTALMBaseServices() {
		// TODO Auto-generated constructor stub
		listClassForSearch.add(new AUTEntrega001_RGR001());
		listClassForSearch.add(new AUTEntrega001_RGR002());
		listClassForSearch.add(new AUTEntrega001_RGR003());
		listClassForSearch.add(new AUTEntrega002_RGR001());
		listClassForSearch.add(new AUTEntrega002_RGR002());
		listClassForSearch.add(new AUTEntrega002_RGR003());
		listClassForSearch.add(new AUTEntrega003_RGR001());
		listClassForSearch.add(new AUTEntrega003_RGR002());
		listClassForSearch.add(new AUTEntrega003_RGR003());
		listClassForSearch.add(new AUTEntrega004_RGR001());
		listClassForSearch.add(new AUTEntrega004_RGR002());
		listClassForSearch.add(new AUTEntrega004_RGR003());
		listClassForSearch.add(new AUTEntrega005_RGR001());
		listClassForSearch.add(new AUTEntrega005_RGR002());
		listClassForSearch.add(new AUTEntrega005_RGR003());
		listClassForSearch.add(new AUTEntrega006_RGR001());
		listClassForSearch.add(new AUTEntrega006_RGR002());
		listClassForSearch.add(new AUTEntrega006_RGR003());
		listClassForSearch.add(new AUTEntrega007_RGR001());
		listClassForSearch.add(new AUTEntrega007_RGR002());
		listClassForSearch.add(new AUTEntrega007_RGR003());
		listClassForSearch.add(new AUTEntrega008_RGR001());
		listClassForSearch.add(new AUTEntrega008_RGR002());
		listClassForSearch.add(new AUTEntrega008_RGR003());
		listClassForSearch.add(new AUTEntrega009_RGR001());
		listClassForSearch.add(new AUTEntrega009_RGR002());
		listClassForSearch.add(new AUTEntrega009_RGR003());
		listClassForSearch.add(new AUTEntrega010_RGR001());
		listClassForSearch.add(new AUTEntrega010_RGR002());
		listClassForSearch.add(new AUTEntrega010_RGR003());
		listClassForSearch.add(new AUTEntrega011_RGR001());
		listClassForSearch.add(new AUTEntrega011_RGR002());
		listClassForSearch.add(new AUTEntrega011_RGR003());
	}

	
	
	/**
	 * 
	 * Retorna o componente de integração para gestão de ALM - SCM
	 * 
	 * @return br.lry.qa.alm.webservices.scm.AUTALMManage - Componente de integração API-WebService JAXWS
	 */
	public <TALMObject extends br.lry.qa.alm.webservices.scm.AUTALMManage> TALMObject autALMWebServiceManager() {
		try {
			if(almObj==null) {								
				almObj = new br.lry.qa.alm.webservices.scm.AUTALMManage();					
				return (TALMObject) almObj;
			}
			else {
				return (TALMObject) almObj;
			}
		}
		catch(java.lang.Exception e) {			
			System.out.println("AUT INFO: ERROR FOR GET ALM MANAGER OBJECT");
			System.out.println(e.getMessage());
			e.printStackTrace();			
			return null;
		}
	}
	
	/**
	 * 
	 * Componente de gerenciamento da estrutura ALM
	 * 
	 * @return br.lry.qa.alm.webservices.scm.administration.AdministrationServiceProxy - Componente de gerenciamento da estrutura ALM
	 *
	 */
	public <TALMAdministration extends br.lry.qa.alm.webservices.scm.administration.AdministrationServiceProxy> TALMAdministration autALMWSAdministration(){
		if(almAdm==null) {
			almAdm = new br.lry.qa.alm.webservices.scm.administration.AdministrationServiceProxy();
			
			return (TALMAdministration)almAdm;
		}
		else {
			return (TALMAdministration)almAdm;
		}
	}
	
	/**
	 * Retorna o componente para gestão de incidentes
	 * 
	 * @return br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServiceProxy - Componente de gerenciamento de incidentes
	 */
	public <TIssueManager extends br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServiceProxy> TIssueManager autALMIssueManager() {
		try {
			if(almIssue==null) {
				almIssue = new br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServiceProxy();
				return (TIssueManager)almIssue;
			}
			else {
				return (TIssueManager)almIssue;
			}			
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: GET ISSUE MANAGER COMPONENT");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			return null;
		}
	}
	
	
	/**
	 * Retorna o objeto para gerenciamento dos planos de execução
	 * 
	 * @return br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServiceProxy - Componente para gerenciamento dos planos de execução
	 *
	 */
	public <TExecutionPlan extends br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServiceProxy> TExecutionPlan autALMExecutionPlanManager() {
		try {			
			if(almExecPlan==null) {
				almExecPlan = new br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServiceProxy();
				return (TExecutionPlan)almExecPlan;
			}
			else {
				return (TExecutionPlan)almExecPlan;
			}			
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: GET COMPONENT FOR EXECUTION PLAN MANAGER");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			return null;
		}
	}
	
	
	/**
	 * 
	 * Retorna o componente para gerenciar requisitos do sistema
	 * 
	 * @return br.lry.qa.alm.webservices.scm.requirements.RequirementsServiceProxy - Componente para gestão de requisitos
	 * 
	 */
	public <TRequeriment extends br.lry.qa.alm.webservices.scm.requirements.RequirementsServiceProxy> TRequeriment autALMRequerimentsManager() {
		try {
			if(almRequeriment==null) {
				almRequeriment = new br.lry.qa.alm.webservices.scm.requirements.RequirementsServiceProxy();				
				return (TRequeriment)almRequeriment;
			}
			else {
				return (TRequeriment)almRequeriment;
			}			
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: GET OBJECT REQUERIMENTS MANAGER");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			return null;
		}
	}
	
	/**
	 * 
	 * Retorna o componente para gerenciamento de filtros de pesquisa
	 * 
	 * @return br.lry.qa.alm.webservices.scm.filters.FilterServiceProxy - Componente para gerenciamento de filtros
	 * 
	 */
	public <TFiltersManager extends br.lry.qa.alm.webservices.scm.filters.FilterServiceProxy> TFiltersManager autALMFiltersManager() {
		try {
			if(almFilter==null) {				
				almFilter = new br.lry.qa.alm.webservices.scm.filters.FilterServiceProxy();				
				return (TFiltersManager)almFilter;
			}
			else {
				return (TFiltersManager)almFilter;
			}
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: GET FILTER COMPONENT");
			System.out.println(e.getMessage());
			e.printStackTrace();			
			return null;
		}
	}
	
	
	/**
	 * 
	 * Retorna o componente para gerenciamento de parametros do sistema
	 * 
	 * @return br.lry.qa.alm.webservices.scm.system.SystemServiceProxy = Componente para gerenciamento do sistema
	 * 
	 */
	public <TSystemManager extends br.lry.qa.alm.webservices.scm.system.SystemServiceProxy> TSystemManager autALMSystemManager(){
		try {
			if(almSystemAdm==null) {
				almSystemAdm = new br.lry.qa.alm.webservices.scm.system.SystemServiceProxy();				
				return (TSystemManager)almSystemAdm;
			}
			else {
				return (TSystemManager)almSystemAdm;
			}
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: GET SYSTEM MANAGEMENT COMPONENT");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			return null;
		}
	}
	
	
	/** 
	 * 
	 * Retorna o componente para gerenciamento de testes
	 * 
	 * @return br.lry.qa.alm.webservices.scm.tests.TestsServiceProxy - Componente para gerenciamento de testes
	 * 
	 */
	public <TTestsManager extends br.lry.qa.alm.webservices.scm.tests.TestsServiceProxy> TTestsManager autALMTestsManager(){
		try {			
			
			almTests = new br.lry.qa.alm.webservices.scm.tests.TestsServiceProxy();
			
			return (TTestsManager)almTests;
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: GET TESTS MANAGER OBJECT FOR INSTANCE");
			System.out.println(e.getMessage());
			e.printStackTrace();
		
			return null;
		}
	}
	
	
	/**
	 * 
	 * Método de inicialização do gerenciador de inicialização dos testes 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * 
	 */
	public void autStartTestManager(String testName) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		String test = testName;
		java.util.List<String> scenariosFinded = new java.util.ArrayList<String>();
		boolean scenarioOk = false;				
		System.out.println("AUT INFO: START TEST MANAGER : CONTROLLER");
		System.out.println(String.format("SEARCH TEST FOR PROCESS NAME: %s",System.getProperty("#sctm_test_name",test)));
		for(Object cl: listClassForSearch) {
			java.util.HashMap<String, String> scenarios = autGetJUnitManager().autGetTestList(cl.getClass());
			for(String key: scenarios.keySet()) {
				if(key.matches(test)) {
					System.out.println("AUT INFO: TEST PROCESS FINDED: START");	
					for(java.lang.reflect.Method mth : cl.getClass().getMethods()) {
						System.out.println(mth.getName());
						if(mth.getName().matches(test)) {
							scenarioOk = true;
							cl.getClass().getMethod(autMethodInitTestes).invoke(cl);
							cl.getClass().getMethod(test).invoke(cl);
							break;
						}						
					}
				}
			}			
			if(scenarioOk) {break;}
		}			
	}
	
	
	/**
	 * 
	 * Método de inicialização do gerenciador de inicialização dos testes 
	 * 
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	@Test
	public void autStartTestManager() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		autStartTestManager(System.getProperty("#sctm_test_name"));
	}
}

