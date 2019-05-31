package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00006;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00006 extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00005 - Realizar um cadastro de um cliente PF com vários telefones
	 * Agrupamento de todos os casos de testes do CN00005
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess06() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00006.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00006.CTP00001();	
		ctp1.autCadastroPFVariosTelefones();
			
	}
}
