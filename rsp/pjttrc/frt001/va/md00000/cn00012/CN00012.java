package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00012;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00012 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00012 - Realizar cadastro com mais de um endereço
	 * Agrupamento de todos os casos de testes do CN00012
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess12() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00012.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00012.CTP00001();	
		ctp1.autCadastroClienteVariosEnderecos();
	}
}
