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
			
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTR00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CTP00001();
		
		ctr1.autCriaPedidoTelevendas();

		ctp1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	
				
		ctp1.autCopiaPedido();
	}

}
