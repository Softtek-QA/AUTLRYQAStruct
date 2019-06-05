package br.lry.qa.rsp.pjttrc.frt001.va.md00000.cn00016B;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00016B extends AUTVABaseComponent{
	
	

	/**
	 * 
	 * CN00016B - REALIZAR_CADASTRO_FILHO_PARA_CLIENTE_PJ_EXCECAO
	 * Agrupamento de todos os casos de testes do CN00005
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess16B() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00000_CN00016A_CTP00001);

		CMP00001(parametros);
		
		
		CMP00067(parametros).autCadastroClientePJExcecao(parametros);
		//CMP00034();
		CMP00022();
	}
}
