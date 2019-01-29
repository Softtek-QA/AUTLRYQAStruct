package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00016;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;

public class CN00016  extends AUTVABaseComponent{
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00016.CTP00001 cn00016CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00015
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	public void autInitConfigurationCN00016() {
	
		cn00016CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00016.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * CN00015 - Realizar um pedido com desconto fora da alçada do usuário
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	
	@Test
	public void autStartProcess16() {
		autInitConfigurationCN00016();
		cn00016CTP00001.autCriaPedidoDescontoForaAlcadaUsuario();
	}

}
