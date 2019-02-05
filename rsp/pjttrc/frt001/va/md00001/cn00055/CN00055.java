package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055;

	import org.junit.Test;
	import br.lry.components.AUTVABaseComponent;
	import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

	public class CN00055 extends AUTVABaseComponent{
	
		public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055.CTP00001 cn00055CTP00001;

		
		/**
		 * 
		 * 
		 * CN00055 - Realizar um pedido através do canal de Televendas
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		public void autInitConfigurationCN00055() {
		
			cn00055CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00055.CTP00001();
		}
		
		
		/**
		 * 
		 * 
		 * CN00055 - Realizar um pedido através do canal Ecommerce
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		@Test
		public void autStartProcess55() {
			
			autInitConfigurationCN00055();
			cn00055CTP00001.ctp55();
			
		}

	}

