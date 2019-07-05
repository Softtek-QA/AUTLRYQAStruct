package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00001 extends AUTVABaseComponent{
	
	static String numeroOrcamento;
	

	/**
	 * 
	 * CN00001 - Realizar um pedido através da cópia de um pedido
	 * Agrupamento de todos os casos de testes do CN00001
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess01() {
		
			
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTR00001 ctr1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTR00001();
		br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTP00001 ctp1 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTP00001();
		
		ctr1.autCriaPedidoTelevendas();
		
		ctr1.AUT_NUMERO_PEDIDO=ctr1.AUT_NUMERO_PEDIDO;	

		//ctr1.autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001,"AUT_NUMERO_PEDIDO");
		
		ctp1.autCopiaPedido();
		
	}

}
