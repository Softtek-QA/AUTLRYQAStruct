package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001;

import java.util.HashMap;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

/**
 * 
 * 
 * CTP00001 - Realizar a troca de loja utilizando usuário televenda
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends  AUTVABaseComponent {
	
	
	@Test
	public void cn0001() {
		 autGetDataFlow().autInitDataFlow();
		 CMP00001(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00001_CTP00001));
		 //CMP00009(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00001_CTP00001));
		 //CMP00022();
	}

}
