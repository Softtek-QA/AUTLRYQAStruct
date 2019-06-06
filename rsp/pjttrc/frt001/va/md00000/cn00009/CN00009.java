package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00009;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00009 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00009 - Realizar cadastro de cliente utilizando "Não sei meu cep"
	 * Agrupamento de todos os casos de testes do CN00009
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess09() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00009.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00009.CTP00001();	
		ctp1.autCadastroClienteSemCEP();
	
	}
}
