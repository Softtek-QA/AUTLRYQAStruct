package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00057;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;



public class CTP00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTP00001 - Realizar um pedido sem um cliente cadastrado e efetuar o cadastro de Pessoa Jurídica
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void autCriaPedidoComCadastroPJ() {
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00057_CTP00001);
		
		 CMP00002(parameters);
			
		 CMP00009(parameters);
			
		 CMP00008(parameters);
			
		 CMP00012(parameters);
		 	
		 CMP00004(parameters);		
			
		 CMP00067(parameters);
		
		 DomElement btCheckAceitoNovidades = AUT_AGENT_SILK4J.<DomElement>find("VA.CadastroClientesDados.AceitarPropagandasSim");
			btCheckAceitoNovidades.setFocus();
			btCheckAceitoNovidades.mouseMove();
			btCheckAceitoNovidades.click();
			
			DomElement btCheckAceitoSMSLeroy = AUT_AGENT_SILK4J.<DomElement>find("VA.CadastroClientesEstrangeiro.BotaoPropagSMS");
			btCheckAceitoSMSLeroy.setFocus();
			btCheckAceitoSMSLeroy.mouseMove();
			btCheckAceitoSMSLeroy.click();		
			
			DomElement btCheckBotaoOfertas = AUT_AGENT_SILK4J.<DomElement>find("VA.CadastroClientesPJ.AceitoPropagLeroy");
			btCheckBotaoOfertas.setFocus();
			btCheckBotaoOfertas.mouseMove();
			btCheckBotaoOfertas.click();
			AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();	 
		 
		 
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 	
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 
	//	 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.BotaoProsseguir").click();
		 	
		 CMP00016(parameters);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00020(parameters).autSelecaoMeioPagamento(parameters);
			
		// AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 //AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Finalizar").click();
		 
		 CMP00034(parameters);
		autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00057_CTP00001, "AUT_NUMERO_PEDIDO", "");
		
		 CMP00022();
	}
}