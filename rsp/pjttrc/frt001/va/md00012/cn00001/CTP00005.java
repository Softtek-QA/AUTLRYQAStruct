package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00001;

import org.junit.Test;

import com.borland.silktest.jtf.BaseState;
import com.borland.silktest.jtf.Control;
import com.borland.silktest.jtf.PushButton;
import com.borland.silktest.jtf.Window;
import com.borland.silktest.jtf.win32.ListView;
import com.microfocus.silktest.jtf.sap.SapButton;
import com.microfocus.silktest.jtf.sap.SapGridView;
import com.microfocus.silktest.jtf.sap.SapRadioButton;
import com.microfocus.silktest.jtf.sap.SapTextField;
import com.microfocus.silktest.jtf.sap.SapWindow;
import com.microfocus.silktest.jtf.sap.common.types.VKey;

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
		String remessa;
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_SAP_MD00012_CN00001_CTP00005);

		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", numPedido);
		
		//Login
		CMP00092(parametros);
		
		//Faturar Pedido no SAP
		CMP00093().autFiltroInicial(parametros);
		remessa = CMP00093().autGerarOrdemRemessa();
		CMP00093().autGerarOrdemTransporte(remessa);
		CMP00093().autConfirmaOTVisivel();
		
		//Realizar Conferencia e Saída de Marcadoria
		CMP00094().autConferenciaPedido(parametros);
		CMP00094().autSaidaMercadoria(parametros);
	
		//Validar se Faturamento e Saída de MArcadoria Finalizou com Sucesso
		CMP00093().autFiltroInicial(parametros);
		CMP00093().autValidaFaturamentoSAP();
		
		//Logout
		CMP00095();
		
		AUT_STATUS_ESPERADO = "Faturado total";
		AUT_NUMERO_PEDIDO = numPedido;
		 
	}
}

