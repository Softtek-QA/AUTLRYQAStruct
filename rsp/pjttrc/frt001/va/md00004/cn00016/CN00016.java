package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00016 extends AUTVABaseComponent{
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CTR00001 cn00016CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CTP00001 cn00016CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00016() {
	
		cn00016CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CTR00001();
		cn00016CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CTP00001();
	}
	
	
	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autStartProcess() {
		
		autInitConfigurationCN00016();
		cn00016CTR00001.autCriaPedidoTelevendas();
		System.out.println("Numero de pedido no cenario"+cn00016CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00016_CTP00001,"AUT_NUMERO_PEDIDO"));
		String numeroPedido = cn00016CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00016_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		cn00016CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00016_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		cn00016CTP00001.autCopiaPedido();
	}

}
