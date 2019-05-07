package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009;

import br.lry.components.AUTBaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00009  extends AUTBaseComponent{
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009.CTR00001 cn00009CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009.CTP00001 cn00009CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00009
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00009() {
	
		cn00009CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009.CTR00001();
		cn00009CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009.CTP00001();
	
	}
	
	
	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00014
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autStartProcess() {
		
		autInitConfigurationCN00009();
		cn00009CTR00001.autCriaPedidoTelevendas();
		//System.out.println("Numero de pedido no cenario"+cn00009CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001,"AUT_NUMERO_PEDIDO"));
		//String numeroPedido = cn00009CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		//cn00009CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00014_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		//cn00009CTP00001.autPedidoReeditado();
	}

}
