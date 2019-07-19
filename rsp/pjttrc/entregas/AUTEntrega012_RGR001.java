package br.lry.qa.rsp.pjttrc.entregas;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * 
 * Scripts para Geração de Massa de Dados
 * 
 * @author Softtek-QA
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AUTEntrega012_RGR001 {

	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00013.cn00001.CN00001 cn00001;

	

	public void AUT_INIT() {
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00013.cn00001.CN00001();
		//cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00013.cn00002.CN00002();

	}
	
	/**
	 * 
	 * Configuração dos parametros de inicialização para realização dos testes de geração de pedidos	 * 
	 */
	@Test
	public void AUT_IT00000_STCFG_ID00030_FRT030_CN00000_CONFIG() {
		
		
		cn00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00013.cn00001.CN00001();
		//cn00002 = new br.lry.qa.rsp.pjttrc.frt001.va.md00007.cn00002.CN00002();

		
	}
	
			
	@Test
	/**
	 * CN00001 - Gera pedido no VA utilizando usuario e-commerce. Pedido com varios itens
	 */
	public void AUT_IT00001_STVA_ID00013_FRT0001_CN00001_GERA_PEDIDO_ECOMMERCE_MASTERCARD() {
			cn00001.autStartProcess01();
	}
	
	
}
