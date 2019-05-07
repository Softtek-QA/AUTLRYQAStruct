package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.microfocus.silktest.jtf.swing.JFrame;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.AUTVACadastros.AUT_VA_ESTADOS;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.win32.AccessibleControl;

/**
 * 
 * 
 * CTP00001 - REALIZAR_PEDIDO_ATRAVES_DO_ECOMMERCE
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp54() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00054_CTP00001);
		
		
		CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00054_CTP00001));
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtAdicionarCarrinho").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtVoltaCarrinho").click();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.MaterialPesquisa").typeKeys(parameters.get("AUT_CODIGO_ITEM").toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaPesquisaBoitata.BtPesquisaMaterial").mouseMove();
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaPesquisaBoitata.BtPesquisaMaterial").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaPesquisaBoitata.BtPesquisaLocalidade").domMouseMove();
		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaPesquisaBoitata.BtPesquisaLocalidade").click();
		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaPesquisaBoitata.BtPesquisaLocalidade").select("SP | São Paulo e Região");
		AUT_AGENT_SILK4J.<DomListBox>find("VA.TelaPesquisaBoitata.BtPesquisaLocalidade").typeKeys("/n");		
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtAddComprar").setFocus();
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtAddComprar").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtFinalizaCompra").mouseMove();
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtFinalizaCompra").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaPesquisaBoitata.BtContinuarPagamento").setFocus();
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaPesquisaBoitata.BtContinuarPagamento").click();		
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtNumeroCartao").mouseMove();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtNumeroCartao").typeKeys(parameters.get("AUT_NUMERO_CARTAO").toString());
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtNomeCartao").mouseMove();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtNomeCartao").typeKeys(parameters.get("AUT_NOME_TITULAR").toString());
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtValidadeCartao").mouseMove();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtValidadeCartao").typeKeys(parameters.get("AUT_VALIDADE").toString());
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtCVVCartao").mouseMove();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.TelaPesquisaBoitata.TxtCVVCartao").typeKeys(parameters.get("AUT_CODIGO_CARTAO").toString());
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaPesquisaBoitata.BtFinalizaPagamento").mouseMove();
		AUT_AGENT_SILK4J.<DomButton>find("VA.TelaPesquisaBoitata.BtFinalizaPagamento").click();
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtLeroySuperior").mouseMove();
		AUT_AGENT_SILK4J.<DomLink>find("VA.TelaPesquisaBoitata.BtLeroySuperior").click();
		AUT_AGENT_SILK4J.<AccessibleControl>find("Boitata.Fechar").click();
}
}