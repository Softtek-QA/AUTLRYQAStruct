package br.lry.qa.rsp.pjttrc.frt001.va.md00013.cn00001;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
/**
 * 
 * 
 * @author Administrador
 *
 */

public class CTP00001 extends AUTVABaseComponent {
	
	
	public  static String AUT_NUMERO_PEDIDO;
	
	@Test
	public void GeraPedidoEcommerceMastercard() {
		
		autGetDataFlow().autInitDataFlow();
		java.util.HashMap<String,Object> parameters = new java.util.HashMap<String,Object>();
		parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00013_CN00001_CTP00001);
		
		String[] itens = parameters.get("AUT_CODIGO_ITEM").toString().split(";");
		String[] qdeItem = parameters.get("AUT_QUANTIDADE_ITEM").toString().split(";");
		boolean maisItens = false;
		
		if(itens.length>1)
			maisItens = true;
		
		//Login
		CMP00002(parameters);
	
		for(int i=0; i<=itens.length;i++) {
			
			parameters.remove("AUT_CODIGO_ITEM");
			parameters.put("AUT_CODIGO_ITEM", itens[i]);
			
			parameters.remove("AUT_QUANTIDADE_ITEM");
			parameters.put("AUT_QUANTIDADE_ITEM", qdeItem[i]);

			//pesquisa material no boitata
			CMP00009_2(parameters);
			
			//Adiciona no Carrinho Ecommerce
			CMP00046();
			
			//Carrinho Ecommerce
			CMP00047(maisItens, parameters);
			
		}
	
		//Cria pedido no Boitata - Ecommerce
		CMP00068(parameters);

		//Logout
		CMP00023_2();
	 
	}
}
