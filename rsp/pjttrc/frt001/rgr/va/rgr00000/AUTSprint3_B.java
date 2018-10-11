package br.lry.qa.rsp.pjttrc.frt001.rgr.va.rgr00000;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.lry.components.hmc.AUTHMCCadastros;
import br.lry.components.va.AUTVACadastros;
import br.lry.components.va.AUTVATelevendas;


/**
 * 
 *Regressivo de testes Cadatros de Cliente - Vendas Assistidas
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTSprint3_B {
	public static AUTHMCCadastros cadastrosHMC;	
	public static AUTVATelevendas televendasVA;
	public static AUTVACadastros cadastrosVA;
	public static String USUARIO_GLOBAL = "00000000",SENHA_GLOBAL="1234";
	public static String AUT_LOJA_CADASTRO ="0035";	
	String hostExec = "192.168.0.116";
	
	/**
	 * 
	 * Configura os parametros de inicialização para realização de cadastros no HMC
	 * 
	 */
	@Test
	public void AUT_CN00000_CONFIG() {
		
		
		televendasVA = new AUTVATelevendas();
		
	}
	
	
	
	@Test
	public void AUT_TESTE() {
		televendasVA.pedidoTelevendasCARTCREDenvAntifraude();
	}
	
	}
