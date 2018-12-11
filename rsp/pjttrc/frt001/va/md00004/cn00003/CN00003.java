package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00003;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;

public class CN00003  extends AUTBaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00003.CTP00001 cn00003CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00003
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00003() {
	
		cn00003CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00003.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00003
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autStartProcess() {
		
		autInitConfigurationCN00003();
		cn00003CTP00001.autAprovarAntiFraude();
	}
}
