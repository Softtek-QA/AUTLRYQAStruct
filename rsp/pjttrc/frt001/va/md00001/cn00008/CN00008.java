package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00008 extends AUTVABaseComponent{
	
	static String numeroPedido;
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CTR00001 cn00008CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CTP00001 cn00008CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00008() {
	
		cn00008CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CTR00001();
		cn00008CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00008.CTP00001();
	}
	
	
	public static String getNumeroPedido() {
		return numeroPedido;
	}


	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}


	/**
	 * 
	 * CN00008 - Realizar um pedido através da cópia de um pedido
	 * Agrupamento de todos os casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess08() {
		
		autInitConfigurationCN00008();
		cn00008CTR00001.autCriaPedidoTelevendas();
		
		cn00008CTP00001.AUT_NUMERO_PEDIDO=cn00008CTR00001.AUT_NUMERO_PEDIDO;	
		
		//System.out.println("Numero de pedido no cenario"+cn00008CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00008_CTP00001,"AUT_NUMERO_PEDIDO"));
		//numeroPedido = cn00008CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00008_CTP00001,"AUT_NUMERO_PEDIDO").toString();
		//System.out.println("Numero do pedido no CTR"+numeroPedido);
		//cn00008CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00008_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		
		cn00008CTP00001.autCopiaPedido();
	}

}
