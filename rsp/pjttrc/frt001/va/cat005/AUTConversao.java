package br.lry.qa.rsp.pjttrc.frt001.va.cat005;

import com.borland.silktest.jtf.xbrowser.DomButton;
import br.lry.components.AUTVABaseComponent;

public class AUTConversao extends AUTVABaseComponent{

	
	/**
	 * Realizar conversão de carrinho para pedido
	 * @return - Verdadeiro para o carrinho convertido em pedido
	 */
	public boolean autVAConvercaoParaPedido() {
		try {
			AUT_AGENT_SILK4J.<DomButton>find("VA02.Pedidos.ConverterPedido").click();	
			return true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
	}
	
	
	
}
