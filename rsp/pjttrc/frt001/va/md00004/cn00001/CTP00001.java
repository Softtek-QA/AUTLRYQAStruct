package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTP00001 extends AUTVABaseComponent{
	
	AUTDataFlow data = new AUTDataFlow();
	
	
	
	/**
	 * CTP00001 - Realizar a troca de loja utilizando usuário televenda
	 */
	@Test
	public void autRealizarTrocaLoja() {
		data.autInitDataFlow();
		CMP00001(data.autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00001_CTP00001));
		//CMP00036(data.autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00001_CTP00001));
		
	}
	
	
	
	
	
	
	

}
