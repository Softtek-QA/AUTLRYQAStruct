package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00017;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00015.CN00015;
import br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00016.CN00016;


public class CTP00001 extends AUTVABaseComponent  {
	
	public String AUT_NUMERO_PEDIDO;

	/**
	 * 
	 * 
	 * CTP00001 - Usuário televendas copiando um pedido do canal Loja
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	@Test
	public void ctp00017() {
		 autGetDataFlow().autInitDataFlow();
		 
	 		java.util.HashMap<String,Object> parametros = new java.util.HashMap<String,Object>();
			parametros = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001);
			parametros.remove("AUT_NUMERO_PEDIDO");
			parametros.put("AUT_NUMERO_PEDIDO", AUT_NUMERO_PEDIDO);
			//parametros.put("AUT_NUMERO_PEDIDO", autGetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00004_CN00017_CTP00001,"AUT_NUMERO_PEDIDO"));
	     
			CMP00001(parametros);	   
			
			CMP00036(parametros); // seleciona loja
			
			CMP00005(parametros);
		
			CMP00012(parametros);
			
			CMP00014_CPF(parametros);
			AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
			AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
					 
			//Fluxo de  saida
			CMP00016(parametros);
					
			//Meio de pagamento
			CMP00020(parametros).autSelecaoMeioPagamento(parametros);
			AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();

		    CMP00034(parametros);
		    
			CMP00022();	
		 	
	}
}
