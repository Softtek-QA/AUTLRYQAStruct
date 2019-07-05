package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00010;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00010 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00010 - Realiza cadastro de cliente com um cpf invalido
	 * Agrupamento de todos os casos de testes do CN00010
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess10() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00010.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00010.CTP00001();	
		ctp1.autCadastroClienteCPFInvalido(); 
	}
}
