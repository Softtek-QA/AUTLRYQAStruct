package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00088 extends AUTVABaseComponent{
	
	static String numeroPedido;
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088.CTR00001 cn00088CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088.CTP00001 cn00088CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00088() {
	
		cn00088CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088.CTR00001();
		cn00088CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088.CTP00001();
	}
	
	
	public static String getNumeroPedido() {
		return numeroPedido;
	}


	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	/**
	 * 
	 * CN00088 - Realizar um pedido através da cópia de um pedido
	 * Agrupamento de todos os casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess88() {
		
		autInitConfigurationCN00088();
		cn00088CTR00001.ctr88();
		System.out.println("Numero de pedido no cenario"+cn00088CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001,"AUT_NUMERO_PEDIDO"));
		numeroPedido = cn00088CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		System.out.println("Numero do pedido no CTR"+numeroPedido);
		cn00088CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		cn00088CTP00001.ctp88();
	}

}
