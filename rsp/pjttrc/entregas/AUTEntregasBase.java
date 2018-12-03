/**
 * 
 * Gerenciamento de entregas base do projeto
 * 
 * 
 */
package br.lry.qa.rsp.pjttrc.entregas;

import com.sun.org.apache.xerces.internal.parsers.SecurityConfiguration;

import br.lry.components.AUTBaseComponent;

/**
 * 
 * @author Softtek-QA
 *
 */
public class AUTEntregasBase extends AUTBaseComponent {
	java.lang.Class currentSuite = null; 
	br.lry.qa.rsp.pjttrc.entregas.AUTVAWorkFlowEndToEnd0001 entEndToEnd = null;	
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001 ent1 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002 ent2 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003 ent3 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004 ent4 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005 ent5 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006 ent6 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007 ent7 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008 ent8 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009 ent9 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010 ent10 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011 ent11 = null;
	
	public void autSetCurrentSuite(Class suite) {
		currentSuite = suite;
	}
	
	public boolean autLoaderCurrentSuite() {
		try {
			System.out.println("AUT INFO: LOADER SUITE TESTS : START");
			if(currentSuite==null) { //Para tratamentos futuros
				autInitConfigurationProjectExecution(currentSuite,AUT_TEST_STATUS_EXECUCAO.WAIT);
			}
			else {
				autInitConfigurationProjectExecution(currentSuite,AUT_TEST_STATUS_EXECUCAO.WAIT);				
			}
			
			System.out.println("AUT INFO: LOADER SUITE TESTS : END");
			return true;
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: LOADER SUITE TESTS");
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	/**
	 * 
	 * Suite de testes integrados
	 * 
	 * @return TTestesIntegrados - Suite de teste integrado
	 * 
	 */
	public <TTSuiteTestesIntegrados extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001> TTSuiteTestesIntegrados autEntrega001() {
		if(ent1==null) {
			
			ent1 = new AUTEntrega001();		
			
			return (TTSuiteTestesIntegrados)ent1;
		}
		else {
			return (TTSuiteTestesIntegrados)ent1;
		}
	}
	

	/**
	 * 
	 * Suite - Módulo de Cadastros - Vendas Assistidas
	 * 
	 * @return TSuiteModuloCadastros - Suite de testes
	 * 
	 */
	public <TSuiteModuloCadastros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002> TSuiteModuloCadastros autEntrega002() {
		if(ent2==null) {			
			ent2 = new AUTEntrega002();		
			
			return (TSuiteModuloCadastros)ent2;
		}
		else {
			return (TSuiteModuloCadastros)ent2;
		}
	}
	
	
	/**
	 * 
	 * Suite - Módulo - Televendas - Vendas Assistidas
	 * 
	 * @return TSuiteModuloCadastros - Suite de testes
	 * 
	 */
	public <TSuiteModuloTelevendas extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003> TSuiteModuloTelevendas autEntrega003() {
		if(ent3==null) {			
			ent3 = new AUTEntrega003();					
			return (TSuiteModuloTelevendas)ent3;
		}
		else {
			return (TSuiteModuloTelevendas)ent3;
		}
	}

	
	
	/**
	 * 
	 * Suite - Módulo - Pedidos I - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos1 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos1 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004> TSuiteModuloPedidos1 autVAModuloPedidosI() {
		if(ent4==null) {			
			ent4 = new AUTEntrega004();					
			return (TSuiteModuloPedidos1)ent4;
		}
		else {
			return (TSuiteModuloPedidos1)ent4;
		}
	}

	/**
	 * 
	 * Suite - Módulo - Pedidos II - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos2 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos2 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005> TSuiteModuloPedidos2 autVAModuloPedidosII() {
		if(ent5==null) {			
			ent5 = new AUTEntrega005();					
			return (TSuiteModuloPedidos2)ent5;
		}
		else {
			return (TSuiteModuloPedidos2)ent5;
		}
	}
	
	
	/**
	 * 
	 * Suite - Módulo - Pedidos III - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos3 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos3 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006> TSuiteModuloPedidos3 autVAModuloPedidosIII() {
		if(ent6==null) {			
			ent6 = new AUTEntrega006();					
			return (TSuiteModuloPedidos3)ent6;
		}
		else {
			return (TSuiteModuloPedidos3)ent6;
		}
	}
	
	/**
	 * 
	 * Suite - Módulo - ORÇAMENTOS - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos3 - Suite de testes
	 * 
	 */
	public <TSuiteModuloOrcamentos extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007> TSuiteModuloOrcamentos autVAModuloOrcamentos() {
		if(ent7==null) {			
			ent7 = new AUTEntrega007();					
			return (TSuiteModuloOrcamentos)ent7;
		}
		else {
			return (TSuiteModuloOrcamentos)ent7;
		}
	}
	
	/**
	 * 
	 * Suite - Módulo - Antifraude - Vendas Assistidas
	 * 
	 * @return TSuiteModuloAntifraude - Suite de testes
	 * 
	 */
	public <TSuiteModuloAntifraude extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008> TSuiteModuloAntifraude autVAModuloAntifraude() {
		if(ent8==null) {			
			ent8 = new AUTEntrega008();					
			return (TSuiteModuloAntifraude)ent8;
		}
		else {
			return (TSuiteModuloAntifraude)ent8;
		}
	}

	/**
	 * 
	 * Suite - Módulo - APROVAÇÃO COMERCIAL - Vendas Assistidas
	 * 
	 * @return TSuiteAprovacoesComercial - Suite de testes
	 * 
	 */
	public <TSuiteAprovacoesComercial extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009> TSuiteAprovacoesComercial autVAModuloAprovacoesComercial() {
		if(ent9==null) {			
			ent9 = new AUTEntrega009();				
			return (TSuiteAprovacoesComercial)ent9;
		}
		else {
			return (TSuiteAprovacoesComercial)ent9;
		}
	}

	
	/**
	 * 
	 * Suite - Módulo - Exclusões - Vendas Assistidas
	 * 
	 * @return TSuiteExclusoes - Suite de testes
	 * 
	 */
	public <TSuiteExclusoes extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010> TSuiteExclusoes autVAModuloExclusoes() {
		if(ent10==null) {			
			ent10 = new AUTEntrega010();				
			return (TSuiteExclusoes)ent10;
		}
		else {
			return (TSuiteExclusoes)ent10;
		}
	}
	
	/**
	 * 
	 * Suite - Fluxos reutilizaveis a nível de projeto - Vendas Assistidas
	 * 
	 * @return TSuiteOutros - Suite de testes
	 * 
	 */
	public <TSuiteOutros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011> TSuiteOutros autVAModuloOutros() {
		if(ent11==null) {			
			ent11 = new AUTEntrega011();				
			return (TSuiteOutros)ent11;
		}
		else {
			return (TSuiteOutros)ent11;
		}
	}
	
	
	/**
	 * 
	 * Construtor
	 * 
	 * 
	 */
	public AUTEntregasBase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param syncronizeDataFlow
	 */
	public AUTEntregasBase(boolean syncronizeDataFlow) {
		super(syncronizeDataFlow);
		// TODO Auto-generated constructor stub
	}

}
