package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00002;

import org.junit.Test;

public class CN00002 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00002.CTP00001 cn00002CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00002
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00002() {
	
		cn00002CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00002.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00002
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autStartProcess() {
		
		autInitConfigurationCN00002();
		cn00002CTP00001.autIgnorarAntiFraude();
	}
}
