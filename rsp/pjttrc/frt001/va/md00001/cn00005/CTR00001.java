package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00005;

import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomCheckBox;
import com.borland.silktest.jtf.xbrowser.DomElement;
import br.lry.components.AUTVABaseComponent;
import br.lry.components.va.cat002.AUTRecuperacao;
import br.lry.components.va.cat016.AUTFinalizarPedidoVA;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;


public class CTR00001 extends AUTVABaseComponent {
	

	/**
	 * 
	 * 
	 * CTR00001 - Criar carrinho no VA Hybris
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	
	@Test
	public void autCriaCarrinho() {
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTR00001));
		 CMP00037(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTR00001));
		 CMP00009(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTR00001));
		 CMP00008(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTR00001));
		 String carrinho = AUTRecuperacao.AUT_NUMERO_CARRINHO;
		 autSetCurrentParameter(AUT_CURRENT_PARAMETERS_TABLE_NAME.RSP_PJTTRC_FRT001_VA_MD00001_CN00005_CTP00001, "AUT_NUMERO_CARRINHO", carrinho);		 
		 System.out.println("O número do carrinho no CTR é"+carrinho);
		 CMP00022();		
	}
}