package br.lry.qa.rsp.pjttrc.frt001.va.md00002.cn00015;

import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat010.AUTDesconto.AUT_VA_MOTIVO;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


/**
 * CTP00001 - Realizar orçamento com garantia estendida, desc não eleg p rateio
 * @param parametros de entrada 
 * 
 */

public class CTP00001 extends AUTVABaseComponent{

	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void cn15() {	
		 
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00015_CTP00001);
		parameters.remove("AUT_NUMERO_PEDIDO");
		parameters.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
		

		CMP00002(parameters);
		CMP00009(parameters);
		CMP00008(parameters);		
		AUT_AGENT_SILK4J.<DomElement>find("VA.GarantiaServicos.Servicos").click();		
		AUT_AGENT_SILK4J.<DomElement>find("VA.GarantiaServicos.Garantia Estendida").click();
		AUT_AGENT_SILK4J.<DomElement>find("VA.GarantiaServicos.AdicionarGarantiaEstendida").click();
		CMP00024(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00015_CTP00001)).autDescontoItem(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00010_CTP00001));	
		String motivo = parameters.get("AUT_MOTIVO").toString();
		AUT_AGENT_SILK4J.<DomListBox>find("VA.Desconto.Motivo_ITEM").select(motivo);		
		String desconto = parameters.get("AUT_DESCONTO").toString();
		AUT_AGENT_SILK4J.<DomTextField>find("VA.Desconto.DescontoPorcentagem_ITEM").setText(desconto);
		
		CMP00061(parameters);
		CMP00004(parameters);		
		CMP00014_CPF(parameters);		
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		
		CMP00016(parameters);
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();	
		AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").click();		
		CMP00020(parameters).autSelecaoMeioPagamento(parameters);		
		CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00002_CN00013_CTP00001));	
		CMP00022();
	}
	}

