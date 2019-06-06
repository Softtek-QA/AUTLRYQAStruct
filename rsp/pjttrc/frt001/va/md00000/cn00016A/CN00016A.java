package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016A;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00016A extends AUTVABaseComponent{
	
	

	/**
	 * 
<<<<<<< HEAD
	 * CN00016A - Realizar um cadastro de um cliente Estrangeiro
	 * Agrupamento de todos os casos de testes do CN00016A
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	
	@Test
	public void autStartProcess16A() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016A.CTP00001 ctp = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016A.CTP00001();
		
		//ctp.autCadastroEstrangeiro();
=======
	 * CN00016A - REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO
	 * Agrupamento de todos os casos de testes do CN00005
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess16A() {
		br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016A.CTP00001 ctp = new br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016A.CTP00001();
		
		ctp.autCadastroFilhoPJExcecao();
>>>>>>> branch 'new_develop' of https://github.com/Softtek-QA/AUTLRYQAStruct.git
	}
}
