package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00001;

import org.junit.Test;

import com.borland.silktest.jtf.win32.AccessibleControl;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat016.AUTFinalizarPedidoVA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTR00001 - Criação de pedido Televendas
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoTelevendas() {
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001));
		 CMP00037(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001));
		 CMP00009(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001));
		 CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001));
		 CMP00061(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001));
		 CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTR00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomRadioButton>find("VA.FluxoSaida.OpcaoCaixa").select();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.TelaResumo.Finalizar").click();	
		 String AUT_NUMERO_PEDIDO = AUT_AGENT_SILK4J.<DomElement>find("VA.TelaFinalPedidos.NumeroOrcamento").getText();
		 String str= new String(AUT_NUMERO_PEDIDO);
		 String AUT_NUMERO_ORCAMENTO = str.substring(10,20);
		 System.out.println("O número do orçamento é "+AUT_NUMERO_ORCAMENTO);
		 autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTP00001, "AUT_NUMERO_ORCAMENTO", AUT_NUMERO_ORCAMENTO);
		 System.out.println("Pedido na tabela no CTP"+autGetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTP00001, "AUT_NUMERO_ORCAMENTO"));
		 System.out.println("Pedido na tabela no CTP"+autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00001_CTP00001,"AUT_NUMERO_ORCAMENTO"));		 
		 CMP00022();			
		 
	}
}