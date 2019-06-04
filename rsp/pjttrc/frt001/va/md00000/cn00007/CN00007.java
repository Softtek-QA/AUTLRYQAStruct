package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00007;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00007 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00007 - Realizar um cadastro de cliente com CPF já previamente cadastrado
	 * Agrupamento de todos os casos de testes do CN00007
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess07() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00007.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00007.CTP00001();	
		ctp1.autCadastroClientePFExistente();
			
	}
}
