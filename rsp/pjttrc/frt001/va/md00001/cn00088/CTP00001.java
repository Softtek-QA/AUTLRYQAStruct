package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00088;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVAGeradorPedido;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00087.CN00087;

/**
 * 
 * 
 * CTP00001 - Pedido Televendas pagamento Cart Créd 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	public String AUT_NUMERO_PEDIDO;
	public <TGeradorPedido extends br.lry.components.va.AUTVAGeradorPedido> TGeradorPedido ct00085V1() {		
		return (TGeradorPedido)new AUTVAGeradorPedido();
	}
	
	public void ct00088(String numeroPedido) {
		AUT_NUMERO_PEDIDO = numeroPedido;
		ctp88();
	}
	
	
	@Test
	public void ctp88() {
		autGetDataFlow().autInitDataFlow();
		
		 autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001).remove("AUT_NUMERO_PEDIDO");
	     autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001).put("AUT_NUMERO_PEDIDO", CN00088.getNumeroPedido());
	     System.out.println("Numero Pedido no CTP 0111"+autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001));	
		 java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		 parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00088_CTP00001);

		CMP00002(parameters);
		CMP00071(parameters);
		CMP00012(parameters);
		CMP00004(parameters);
		CMP00014(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		CMP00020(parameters).autMeioDePagamentoSimples(parameters);
		CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00057_CTP00001));	
	    CMP00022();	

	}
}
