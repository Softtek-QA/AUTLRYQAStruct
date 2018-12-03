package br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00018;

public class CN00018 {
	
	public static  br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00018.CTP00001 cn00018CTP00001;

	
	/**
	 * 
	 * 
	 * Configurações para execução dos casos de testes do CN00018
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autInitConfigurationCN00018() {
	
		cn00018CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00004.cn00018.CTP00001();
	}
	

	/**
	 * 
	 * 
	 * Agrupamento de todos os casos de testes do CN00018
	 * @param parametro - Parametros de entrada do sistema
	 * @return
	 */
	public void autStartProcess() {
		
		autInitConfigurationCN00018();
		cn00018CTP00001.autPedidoTelevendasPagarLoja();
	}

}
