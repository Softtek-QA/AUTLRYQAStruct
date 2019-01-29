package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00050;

	import org.junit.Test;
	import br.lry.components.AUTVABaseComponent;
	import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

	public class CN00050 extends AUTVABaseComponent{
	
		public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00050.CTP00001 cn00050CTP00001;

		
		/**
		 * 
		 * 
		 * CN0050 - CTP000001 -Realizar um pedido com pagamento Voucher
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		public void autInitConfigurationCN00050() {
		
			cn00050CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00050.CTP00001();
		}
		
		
		/**
		 * 
		 * 
		 * CN0050 - CTP000001 -Realizar um pedido com pagamento Voucher
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		@Test
		public void autStartProcess50() {
			
			autInitConfigurationCN00050();
			cn00050CTP00001.autCopiaPedido();
			
		}

	}

