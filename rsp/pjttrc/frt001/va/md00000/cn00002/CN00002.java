package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00002;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00002 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00002 - Realizar um cadastro de um cliente Pessoa Fisica
	 * Agrupamento de todos os casos de testes do CN00002
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess02() {
		
			
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00002.CTP00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00002.CTP00001();
		
		ctr1.autCadastroPF();
		
		
	}

}
