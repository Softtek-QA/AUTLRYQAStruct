package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001;

import org.junit.Test;

public class CN00001 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001.CTP00001 cn00001CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00001
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00001() {
	
		cn00001CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00001
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autStartProcess() {
		
		autInitConfigurationCN00001();
		cn00001CTP00001.autTrocaLoja();
	}

}
