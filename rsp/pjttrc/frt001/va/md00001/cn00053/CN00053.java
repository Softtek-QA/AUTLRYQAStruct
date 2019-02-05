package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00053;

	import org.junit.Test;
	import br.lry.components.AUTVABaseComponent;
	import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

	public class CN00053 extends AUTVABaseComponent{
	
		public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00053.CTP00001 cn00053CTP00001;

		
		/**
		 * 
		 * 
		 * CN00053 - Realizar um pedido através do canal de Televendas
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		public void autInitConfigurationCN00053() {
		
			cn00053CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00053.CTP00001();
		}
		
		
		/**
		 * 
		 * 
		 * CN00053 - Realizar um pedido através do canal de Televendas
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		@Test
		public void autStartProcess53() {
			
			autInitConfigurationCN00053();
			cn00053CTP00001.autCopiaPedido();
			
		}

	}

