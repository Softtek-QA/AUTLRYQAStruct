package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00011;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00011 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00011 - Realizar cadastro de cliente com cep invalido
	 * Agrupamento de todos os casos de testes do CN00011
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess11() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00011.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00011.CTP00001();	
		ctp1.autCadastroClienteCEPInvalido();
	}
}
