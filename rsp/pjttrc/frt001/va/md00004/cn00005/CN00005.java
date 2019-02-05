package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00005;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;

public class CN00005  extends AUTBaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00004.CTP00001 cn00005CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00004
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00005() {
	
		cn00005CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00004.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00004
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	
	public void autStartProcess() {
		
		autInitConfigurationCN00005();
		cn00005CTP00001.autAprovaAutoAntifraude();
	}


}
