package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00015 extends AUTBaseComponent{
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTR00001 cn00015CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTP00001 cn00015CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00015
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00015() {
	
		cn00015CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTR00001();
		cn00015CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTP00001();
	
	}
	
	
	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess() {
		
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CTR00001();
		ctr1.ctr00015();
		ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00015_CTP00001,"AUT_NUMERO_PEDIDO");
		ctp1.ctp00015();
	}

}
