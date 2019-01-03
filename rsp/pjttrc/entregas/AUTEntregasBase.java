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
	br.lry.qa.rsp.pjttrc.entregas.AUTVAWorkFlowEndToEnd_RGR0001 entEndToEnd = null;	
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR001 ent1 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002_RGR001 ent2 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003_RGR001 ent3 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004_RGR001 ent4 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005_RGR001 ent5 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006_RGR001 ent6 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007_RGR001 ent7 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008_RGR001 ent8 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009_RGR001 ent9 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010_RGR001 ent10 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011_RGR001 ent11 = null;

	br.lry.qa.rsp.pjttrc.entregas.AUTVAWorkFlowEndToEnd_RGR002 entEndToEnd2 = null;	
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR002 ent12 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002_RGR002 ent22 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003_RGR002 ent32 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004_RGR002 ent42 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005_RGR002 ent52 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006_RGR002 ent62 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007_RGR002 ent72 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008_RGR002 ent82 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009_RGR002 ent92 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010_RGR002 ent102 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011_RGR002 ent112 = null;


	
	br.lry.qa.rsp.pjttrc.entregas.AUTVAWorkFlowEndToEnd_RGR003 entEndToEnd3 = null;	
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR003 ent13 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002_RGR003 ent23 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003_RGR003 ent33 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004_RGR003 ent43 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005_RGR003 ent53 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006_RGR003 ent63 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007_RGR003 ent73 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008_RGR003 ent83 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009_RGR003 ent93 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010_RGR003 ent103 = null;
	br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011_RGR003 ent113 = null;

	
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
	
	
	
	
	//*********************************** REGRESSIVO - 1 ***************************************
	//******************************************************************************************
	/*
	 * 
	 * Suite de testes integrados
	 * 
	 * @return TTestesIntegrados - Suite de teste integrado
	 * 
	 */
	public <TTSuiteTestesIntegrados extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR001> TTSuiteTestesIntegrados autEntrega001RGR001() {
		if(ent1==null) {
			
			ent1 = new AUTEntrega001_RGR001();		
			
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
	public <TSuiteModuloCadastros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002_RGR001> TSuiteModuloCadastros autEntrega002RGR001() {
		if(ent2==null) {			
			ent2 = new AUTEntrega002_RGR001();		
			
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
	public <TSuiteModuloTelevendas extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003_RGR001> TSuiteModuloTelevendas autEntrega003RGR001() {
		if(ent3==null) {			
			ent3 = new AUTEntrega003_RGR001();					
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
	public <TSuiteModuloPedidos1 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004_RGR001> TSuiteModuloPedidos1 autEntrega004RGR001() {
		if(ent4==null) {			
			ent4 = new AUTEntrega004_RGR001();					
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
	public <TSuiteModuloPedidos2 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005_RGR001> TSuiteModuloPedidos2 autEntrega005RGR001() {
		if(ent5==null) {			
			ent5 = new AUTEntrega005_RGR001();					
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
	public <TSuiteModuloPedidos3 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006_RGR001> TSuiteModuloPedidos3 autEntrega006RGR001() {
		if(ent6==null) {			
			ent6 = new AUTEntrega006_RGR001();					
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
	public <TSuiteModuloOrcamentos extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007_RGR001> TSuiteModuloOrcamentos autEntrega007RGR001() {
		if(ent7==null) {			
			ent7 = new AUTEntrega007_RGR001();					
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
	public <TSuiteModuloAntifraude extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008_RGR001> TSuiteModuloAntifraude autEntrega008RGR001() {
		if(ent8==null) {			
			ent8 = new AUTEntrega008_RGR001();					
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
	public <TSuiteAprovacoesComercial extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009_RGR001> TSuiteAprovacoesComercial autEntrega009RGR001() {
		if(ent9==null) {			
			ent9 = new AUTEntrega009_RGR001();				
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
	public <TSuiteExclusoes extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010_RGR001> TSuiteExclusoes autEntrega010RGR001() {
		if(ent10==null) {			
			ent10 = new AUTEntrega010_RGR001();				
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
	public <TSuiteOutros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011_RGR001> TSuiteOutros autEntrega011RGR001() {
		if(ent11==null) {			
			ent11 = new AUTEntrega011_RGR001();				
			return (TSuiteOutros)ent11;
		}
		else {
			return (TSuiteOutros)ent11;
		}
	}
	
	
	
	
	
	
	
	//*********************************** REGRESSIVO - 2 ***************************************
	//******************************************************************************************
	/*
	 * 
	 * Suite de testes integrados
	 * 
	 * @return TTestesIntegrados - Suite de teste integrado
	 * 
	 */
	public <TTSuiteTestesIntegrados extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR002> TTSuiteTestesIntegrados autEntrega001RGR002() {
		if(ent12==null) {
			
			ent12 = new AUTEntrega001_RGR002();		
			
			return (TTSuiteTestesIntegrados)ent12;
		}
		else {
			return (TTSuiteTestesIntegrados)ent12;
		}
	}
	

	/**
	 * 
	 * Suite - Módulo de Cadastros - Vendas Assistidas
	 * 
	 * @return TSuiteModuloCadastros - Suite de testes
	 * 
	 */
	public <TSuiteModuloCadastros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002_RGR002> TSuiteModuloCadastros autEntrega002RGR002() {
		if(ent22==null) {			
			ent22 = new AUTEntrega002_RGR002();		
			
			return (TSuiteModuloCadastros)ent22;
		}
		else {
			return (TSuiteModuloCadastros)ent22;
		}
	}
	
	
	/**
	 * 
	 * Suite - Módulo - Televendas - Vendas Assistidas
	 * 
	 * @return TSuiteModuloCadastros - Suite de testes
	 * 
	 */
	public <TSuiteModuloTelevendas extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003_RGR002> TSuiteModuloTelevendas autEntrega003RGR002() {
		if(ent32==null) {			
			ent32 = new AUTEntrega003_RGR002();					
			return (TSuiteModuloTelevendas)ent32;
		}
		else {
			return (TSuiteModuloTelevendas)ent32;
		}
	}

	
	
	/**
	 * 
	 * Suite - Módulo - Pedidos I - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos1 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos1 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004_RGR002> TSuiteModuloPedidos1 autEntrega004RGR002() {
		if(ent42==null) {			
			ent42 = new AUTEntrega004_RGR002();					
			return (TSuiteModuloPedidos1)ent42;
		}
		else {
			return (TSuiteModuloPedidos1)ent42;
		}
	}

	/**
	 * 
	 * Suite - Módulo - Pedidos II - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos2 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos2 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005_RGR002> TSuiteModuloPedidos2 autEntrega005RGR002() {
		if(ent52==null) {			
			ent52 = new AUTEntrega005_RGR002();					
			return (TSuiteModuloPedidos2)ent52;
		}
		else {
			return (TSuiteModuloPedidos2)ent52;
		}
	}
	
	
	/**
	 * 
	 * Suite - Módulo - Pedidos III - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos3 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos3 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006_RGR002> TSuiteModuloPedidos3 autEntrega006RGR002() {
		if(ent62==null) {			
			ent62 = new AUTEntrega006_RGR002();					
			return (TSuiteModuloPedidos3)ent62;
		}
		else {
			return (TSuiteModuloPedidos3)ent62;
		}
	}
	
	/**
	 * 
	 * Suite - Módulo - ORÇAMENTOS - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos3 - Suite de testes
	 * 
	 */
	public <TSuiteModuloOrcamentos extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007_RGR002> TSuiteModuloOrcamentos autEntrega007RGR002() {
		if(ent72==null) {			
			ent72 = new AUTEntrega007_RGR002();					
			return (TSuiteModuloOrcamentos)ent72;
		}
		else {
			return (TSuiteModuloOrcamentos)ent72;
		}
	}
	
	/**
	 * 
	 * Suite - Módulo - Antifraude - Vendas Assistidas
	 * 
	 * @return TSuiteModuloAntifraude - Suite de testes
	 * 
	 */
	public <TSuiteModuloAntifraude extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008_RGR002> TSuiteModuloAntifraude autEntrega008RGR002() {
		if(ent82==null) {			
			ent82 = new AUTEntrega008_RGR002();					
			return (TSuiteModuloAntifraude)ent82;
		}
		else {
			return (TSuiteModuloAntifraude)ent82;
		}
	}

	
	/**
	 * 
	 * Suite - Módulo - APROVAÇÃO COMERCIAL - Vendas Assistidas
	 * 
	 * @return TSuiteAprovacoesComercial - Suite de testes
	 * 
	 */
	public <TSuiteAprovacoesComercial extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009_RGR002> TSuiteAprovacoesComercial autEntrega009RGR002() {
		if(ent92==null) {			
			ent92 = new AUTEntrega009_RGR002();				
			return (TSuiteAprovacoesComercial)ent92;
		}
		else {
			return (TSuiteAprovacoesComercial)ent92;
		}
	}

	
	/**
	 * 
	 * Suite - Módulo - Exclusões - Vendas Assistidas
	 * 
	 * @return TSuiteExclusoes - Suite de testes
	 * 
	 */
	public <TSuiteExclusoes extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010_RGR002> TSuiteExclusoes autEntrega010RGR002() {
		if(ent102==null) {			
			ent102 = new AUTEntrega010_RGR002();				
			return (TSuiteExclusoes)ent102;
		}
		else {
			return (TSuiteExclusoes)ent102;
		}
	}
	
	/**
	 * 
	 * Suite - Fluxos reutilizaveis a nível de projeto - Vendas Assistidas
	 * 
	 * @return TSuiteOutros - Suite de testes
	 * 
	 */
	public <TSuiteOutros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011_RGR002> TSuiteOutros autEntrega011RGR002() {
		if(ent112==null) {			
			ent112 = new AUTEntrega011_RGR002();				
			return (TSuiteOutros)ent112;
		}
		else {
			return (TSuiteOutros)ent112;
		}
	}

	

	
	//*********************************** REGRESSIVO - 3 ***************************************
	//******************************************************************************************
	/*
	 * 
	 * Suite de testes integrados
	 * 
	 * @return TTestesIntegrados - Suite de teste integrado
	 * 
	 */
	public <TTSuiteTestesIntegrados extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega001_RGR003> TTSuiteTestesIntegrados autEntrega001RGR003() {
		if(ent13==null) {
			
			ent13 = new AUTEntrega001_RGR003();		
			
			return (TTSuiteTestesIntegrados)ent13;
		}
		else {
			return (TTSuiteTestesIntegrados)ent13;
		}
	}
	

	/**
	 * 
	 * Suite - Módulo de Cadastros - Vendas Assistidas
	 * 
	 * @return TSuiteModuloCadastros - Suite de testes
	 * 
	 */
	public <TSuiteModuloCadastros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega002_RGR003> TSuiteModuloCadastros autEntrega002RGR003() {
		if(ent23==null) {			
			ent23 = new AUTEntrega002_RGR003();		
			
			return (TSuiteModuloCadastros)ent23;
		}
		else {
			return (TSuiteModuloCadastros)ent23;
		}
	}
	
	
	/**
	 * 
	 * Suite - Módulo - Televendas - Vendas Assistidas
	 * 
	 * @return TSuiteModuloCadastros - Suite de testes
	 * 
	 */
	public <TSuiteModuloTelevendas extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega003_RGR003> TSuiteModuloTelevendas autEntrega003RGR003() {
		if(ent33==null) {			
			ent33 = new AUTEntrega003_RGR003();					
			return (TSuiteModuloTelevendas)ent33;
		}
		else {
			return (TSuiteModuloTelevendas)ent33;
		}
	}

	
	
	/**
	 * 
	 * Suite - Módulo - Pedidos I - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos1 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos1 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega004_RGR003> TSuiteModuloPedidos1 autEntrega004RGR003() {
		if(ent43==null) {			
			ent43 = new AUTEntrega004_RGR003();					
			return (TSuiteModuloPedidos1)ent43;
		}
		else {
			return (TSuiteModuloPedidos1)ent43;
		}
	}

	/**
	 * 
	 * Suite - Módulo - Pedidos II - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos2 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos2 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega005_RGR003> TSuiteModuloPedidos2 autEntrega005RGR003() {
		if(ent53==null) {			
			ent53 = new AUTEntrega005_RGR003();					
			return (TSuiteModuloPedidos2)ent53;
		}
		else {
			return (TSuiteModuloPedidos2)ent53;
		}
	}
	
	
	/**
	 * 
	 * Suite - Módulo - Pedidos III - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos3 - Suite de testes
	 * 
	 */
	public <TSuiteModuloPedidos3 extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega006_RGR003> TSuiteModuloPedidos3 autEntrega006RGR003() {
		if(ent63==null) {			
			ent63 = new AUTEntrega006_RGR003();					
			return (TSuiteModuloPedidos3)ent63;
		}
		else {
			return (TSuiteModuloPedidos3)ent63;
		}
	}
	
	/**
	 * 
	 * Suite - Módulo - ORÇAMENTOS - Vendas Assistidas
	 * 
	 * @return TSuiteModuloPedidos3 - Suite de testes
	 * 
	 */
	public <TSuiteModuloOrcamentos extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega007_RGR003> TSuiteModuloOrcamentos autEntrega007RGR003() {
		if(ent73==null) {			
			ent73 = new AUTEntrega007_RGR003();					
			return (TSuiteModuloOrcamentos)ent73;
		}
		else {
			return (TSuiteModuloOrcamentos)ent73;
		}
	}
	
	/**
	 * 
	 * Suite - Módulo - Antifraude - Vendas Assistidas
	 * 
	 * @return TSuiteModuloAntifraude - Suite de testes
	 * 
	 */
	public <TSuiteModuloAntifraude extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega008_RGR003> TSuiteModuloAntifraude autEntrega008RGR003() {
		if(ent83==null) {			
			ent83 = new AUTEntrega008_RGR003();					
			return (TSuiteModuloAntifraude)ent83;
		}
		else {
			return (TSuiteModuloAntifraude)ent83;
		}
	}

	
	/**
	 * 
	 * Suite - Módulo - APROVAÇÃO COMERCIAL - Vendas Assistidas
	 * 
	 * @return TSuiteAprovacoesComercial - Suite de testes
	 * 
	 */
	public <TSuiteAprovacoesComercial extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega009_RGR003> TSuiteAprovacoesComercial autEntrega009RGR003() {
		if(ent93==null) {			
			ent93 = new AUTEntrega009_RGR003();				
			return (TSuiteAprovacoesComercial)ent93;
		}
		else {
			return (TSuiteAprovacoesComercial)ent93;
		}
	}

	
	/**
	 * 
	 * Suite - Módulo - Exclusões - Vendas Assistidas
	 * 
	 * @return TSuiteExclusoes - Suite de testes
	 * 
	 */
	public <TSuiteExclusoes extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega010_RGR003> TSuiteExclusoes autEntrega010RGR003() {
		if(ent103==null) {			
			ent103 = new AUTEntrega010_RGR003();				
			return (TSuiteExclusoes)ent103;
		}
		else {
			return (TSuiteExclusoes)ent103;
		}
	}
	
	/**
	 * 
	 * Suite - Fluxos reutilizaveis a nível de projeto - Vendas Assistidas
	 * 
	 * @return TSuiteOutros - Suite de testes
	 * 
	 */
	public <TSuiteOutros extends br.lry.qa.rsp.pjttrc.entregas.AUTEntrega011_RGR003> TSuiteOutros autEntrega011RGR003() {
		if(ent113==null) {			
			ent113 = new AUTEntrega011_RGR003();				
			return (TSuiteOutros)ent113;
		}
		else {
			return (TSuiteOutros)ent113;
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
