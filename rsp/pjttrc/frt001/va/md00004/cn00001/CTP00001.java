package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00001;


import org.junit.Test;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTP00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTP00001 - Realizar a troca de loja utilizando usuário televenda
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */

	public void autTrocaLoja() {
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00001_CTP00001));
		 CMP00037(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00001_CTP00001));
		 CMP00023();
	}
}
