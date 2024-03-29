package br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00001;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.BrowserWindow;

import br.lry.components.AUTVABaseComponent;

public class CN00001 extends AUTVABaseComponent {

	/** 
	 * 
	 * Inicia o fluxo de execução padrão do cenário
	 * 
	 * @return boolean - True caso o processo seja finalizado com sucesso, false caso contrário
	 * 
	 */
	@Test
	public void autStartProcess() {
		try {
			System.out.println("AUT INFO: START LOGIN PROCESS");
			br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00001.CTP00001 ct1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00001.CTP00001();			
			ct1.AUT_IT00001_STVA_ID00033_FRT033_CN00001_GERACAO_PEDIDOS_DEBUG();			
		}
		catch(java.lang.Exception e) {
			System.out.println("AUT ERROR: START LOGIN PROCESS");
			System.out.println(e.getMessage());
			e.printStackTrace();					
		}
	}
	
	
	/**
	 * Construtor
	 * 
	 */
	public CN00001() {
		// TODO Auto-generated constructor stub
	}

}
