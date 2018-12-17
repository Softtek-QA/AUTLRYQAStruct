package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00009;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00014.CN00014;

/**
 * 
 * 
 * CTP00001 - Pedido Televendas pag Cart Créd e Voucher pedido reeditado
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent {
	
	@Test
	public void autPedidoReeditado () {
		 autGetDataFlow().autInitDataFlow();
	     String numeroPedido = CN00009.cn00009CTR00001.autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001,"AUT_NUMERO_PEDIDO").toString();
	     System.out.println("Numero do pedido"+numeroPedido);
		 autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001,"AUT_NUMERO_PEDIDO",numeroPedido);
		 CMP00001(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001));
		 CMP00036(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTR00001));
		 CMP00005(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001));
		 CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001));
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
 
		 AUT_AGENT_SILK4J.<DomCheckBox>find("VA02.FluxoSaida.DataMaisProxima").click();
				 
		 DomListBox listComboDep=  AUT_AGENT_SILK4J.<DomListBox>find("VA02.FluxoSaida.SelecionaDep");
		 selectValor(listComboDep);
		 
		 DomListBox listComboEntrega= AUT_AGENT_SILK4J.<DomListBox>find("VA02.ConfirmacaoLogin.Turno");
		 selectValor(listComboEntrega);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTR00001)).autVAMultiplosMeiosPagamentoTelevendas(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00014_CTP00001));
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00009_CTR00001));		 
		 CMP00022();		
	}


}
