package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00087 extends AUTVABaseComponent{
	
	static String numeroPedido;
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTR00001 cn00087CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTP00001 cn00087CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00087() {
	
		cn00087CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTR00001();
		cn00087CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTP00001();
	}
	
	
	public static String getNumeroPedido() {
		return numeroPedido;
	}


	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	/**
	 * 
	 * CN00087 - Realizar um pedido através da cópia de um pedido
	 * Agrupamento de todos os casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess87() {
		
		autInitConfigurationCN00087();
		cn00087CTR00001.autCriaPedidoTelevendas();
		System.out.println("Numero de pedido no cenario"+cn00087CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00087_CTP00001,"AUT_NUMERO_PEDIDO"));
		numeroPedido = cn00087CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00087_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		System.out.println("Numero do pedido no CTR"+numeroPedido);
		cn00087CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00087_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		cn00087CTP00001.autCopiaPedido();
	}

}
