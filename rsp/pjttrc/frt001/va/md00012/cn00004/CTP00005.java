package br.lry.qa.rsp.pjttrc.frt001.va.md00012.cn00004;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTPDVBaseComponent;
import br.lry.components.AUTSAPBaseComponent;
import br.lry.components.AUTVABaseComponent;
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
	public void PagaPedidoSAP(String numPedido) {

		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_PDV_MD00012_CN00004_CTP00003);

		parametros.remove("AUT_NUMERO_PEDIDO");
		parametros.put("AUT_NUMERO_PEDIDO", numPedido);
		
//		CMP00090(parametros);
//		
//		CMP00091(parametros);
//		
//		AUT_STATUS_ESPERADO = "Pago";
		AUT_NUMERO_PEDIDO = numPedido;
		 
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00004_CTP00004, "AUT_STATUS_ESPERADO",AUT_STATUS_ESPERADO);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00004_CTP00004, "AUT_NUMERO_PEDIDO",AUT_NUMERO_PEDIDO);
	}

	public void FaturaPedidoSAP(String numPedido) {
		// TODO Auto-generated method stub
		String remessa;
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String, Object> parametros = new java.util.HashMap<String, Object>();
		parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_SAP_MD00012_CN00004_CTP00005);

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
		
		AUT_STATUS_ESPERADO = "Faturado total";
		AUT_NUMERO_PEDIDO = numPedido;
		 
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00004_CTP00006, "AUT_STATUS_ESPERADO",AUT_STATUS_ESPERADO);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00012_CN00004_CTP00006, "AUT_NUMERO_PEDIDO",AUT_NUMERO_PEDIDO);			
	}
}