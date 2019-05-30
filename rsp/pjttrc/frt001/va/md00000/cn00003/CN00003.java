package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00003;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00003 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00001 - Realizar um cadastro de um cliente Pessoa Juridica
	 * Agrupamento de todos os casos de testes do CN00001
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess03() {
		
			
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00003.CTP00001 ctr = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00003.CTP00001();
		
		ctr.autCadastro();
		
		
	}

}
