package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CN00001 extends AUTVABaseComponent{
	
	static String numeroOrcamento;
	
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTR00001 cn00001CTR00001;
	public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTP00001 cn00001CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00016
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00001() {
	
		cn00001CTR00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTR00001();
		cn00001CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001.CTP00001();
	}
	
	
	public static String getNumeroOrcamento() {
		return numeroOrcamento;
	}


	public void setNumeroOrcamento(String numeroOrcamento) {
		this.numeroOrcamento = numeroOrcamento;
	}


	/**
	 * 
	 * CN00001 - Realizar um pedido através da cópia de um pedido
	 * Agrupamento de todos os casos de testes do CN00001
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess01() {
		
		autInitConfigurationCN00001();
		cn00001CTR00001.autCriaPedidoTelevendas();
		System.out.println("Numero de orcamento no cenario"+cn00001CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTP00001,"AUT_NUMERO_ORCAMENTO"));
		numeroOrcamento = cn00001CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTP00001,"AUT_NUMERO_ORCAMENTO").toString();
		System.out.println("Numero do pedido no cenário no CTR"+numeroOrcamento);
		cn00001CTP00001.autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTP00001,"AUT_NUMERO_ORCAMENTO",numeroOrcamento);
		System.out.println("Numero do pedido no cenário no CTP"+cn00001CTP00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTP00001,"AUT_NUMERO_ORCAMENTO"));
		cn00001CTP00001.autCopiaPedido();
	}

}
