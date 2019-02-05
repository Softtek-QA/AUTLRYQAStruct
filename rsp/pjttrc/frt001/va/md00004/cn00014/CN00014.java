package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014;

import org.junit.Test;

import br.lry.components.AUTBaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00014 extends AUTBaseComponent{
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTR00001 cn00014CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTP00001 cn00014CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00014() {
	
		cn00014CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTR00001();
		cn00014CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CTP00001();
	
	}
	
	
	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00014
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	
	@Test
	public void autStartProcess() {
		
		autInitConfigurationCN00014();
		cn00014CTR00001.autCriaPedidoTelevendas();
		System.out.println("Numero de pedido no cenario"+cn00014CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00014_CTP00001,"AUT_NUMERO_PEDIDO"));
		String numeroPedido = cn00014CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00014_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		cn00014CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00014_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		cn00014CTP00001.autPedidoReeditado();
	}

}
