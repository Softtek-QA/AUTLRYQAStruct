package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00049;

	import org.junit.Test;
	import br.lry.components.AUTVABaseComponent;
	import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

	public class CN00049 extends AUTVABaseComponent{
	
		public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00049.CTP00001 cn00049CTP00001;

		
		/**
		 * 
		 * 
		 * CN0049 - CTP000001 - Realizar um pedido com pagamento Vale Troca
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		public void autInitConfigurationCN00049() {
		
			cn00049CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00049.CTP00001();
		}
		
		
		/**
		 * 
		 * 
		 * CN0049 - CTP000001 - Realizar um pedido com pagamento Vale Troca
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		@Test
		public void autStartProcess49() {
			
			autInitConfigurationCN00049();
			cn00049CTP00001.autCopiaPedido();
			
		}

	}

