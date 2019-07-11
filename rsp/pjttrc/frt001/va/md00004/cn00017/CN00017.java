package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017;

import br.lry.components.AUTBaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00017 extends AUTBaseComponent{
	

	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00017
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autStartProcess() {
				
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTP00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTR00001();
		
		ctr1.ctr00017();
		
		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	

		//ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001,"AUT_NUMERO_PEDIDO");
		
		ctp1.ctp00017();
	}


}
