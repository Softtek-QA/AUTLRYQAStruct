package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001;

import org.junit.Test;
import br.lry.components.AUTSAPBaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

public class CTP00005 extends AUTSAPBaseComponent {
	
	public static String AUT_NUMERO_PEDIDO;
	public static String AUT_STATUS_ESPERADO;
	
	/**
	 * 
	 * 
	 *  
	 * parametro - Parametros de entrada do sistema
	 * @param
	 * @return
	 */
	@Test
	public void FaturaPedidoSAP(String numPedido) {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_SAP_MD00012_CN00001_CTP00005);

		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", numPedido);
		
		CMP00092(parametros);
		
//		CMP00091(parametros);
//		
//		AUT_STATUS_ESPERADO = "Pago";
//		AUT_NUMERO_PEDIDO = numPedido;
		 
//		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00001_CTP00006, "AUT_STATUS_ESPERADO",AUT_STATUS_ESPERADO);
//		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00001_CTP00006, "AUT_NUMERO_PEDIDO",AUT_NUMERO_PEDIDO);
	}
}