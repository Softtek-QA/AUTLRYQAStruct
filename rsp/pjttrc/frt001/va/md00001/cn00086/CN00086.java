package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00086 extends AUTVABaseComponent{
	
	static String numeroPedido;
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086.CTR00001 cn00086CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086.CTP00001 cn00086CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00086() {
	
		cn00086CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086.CTR00001();
		cn00086CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00086.CTP00001();
	}
	
	
	public static String getNumeroPedido() {
		return numeroPedido;
	}


	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	/**
	 * 
	 * CN00086 - Realizar um pedido através da cópia de um pedido
	 * Agrupamento de todos os casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess86() {
		
		autInitConfigurationCN00086();
		cn00086CTR00001.ctr86();
		System.out.println("Numero de pedido no cenario"+cn00086CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00086_CTP00001,"AUT_NUMERO_PEDIDO"));
		numeroPedido = cn00086CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00086_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		System.out.println("Numero do pedido no CTR"+numeroPedido);
		cn00086CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00086_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		cn00086CTP00001.ctp86();
	}

}
