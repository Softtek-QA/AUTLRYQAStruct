package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017;

import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00017 {
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTR00001 cn00017CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTP00001 cn00017CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00017
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00017() {
	
		cn00017CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTR00001();
		cn00017CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017.CTP00001();
	
	}
	
	
	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00017
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autStartProcess() {
		
		autInitConfigurationCN00017();
		cn00017CTR00001.autCriaPedidoVAHybris();
		System.out.println("Numero de pedido no cenario"+cn00017CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001,"AUT_NUMERO_PEDIDO"));
		String numeroPedido = cn00017CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		cn00017CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001,"AUT_PEDIDO",numeroPedido);
		cn00017CTP00001.autCopiaPedidoLoja();
	}


}
