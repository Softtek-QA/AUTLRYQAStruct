package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00014;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00014 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * 
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess14(){
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00014.CTP00001 ctr = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00014.CTP00001();
		
		ctr.autCadastroExecao();
	}
}
