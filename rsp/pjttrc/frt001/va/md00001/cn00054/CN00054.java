package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054;

	import org.junit.Test;
	import br.lry.components.AUTVABaseComponent;
	import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

	public class CN00054 extends AUTVABaseComponent{
	
		public static br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054.CTP00001 cn00054CTP00001;

		
		/**
		 * 
		 * 
		 * CN00054 - Realizar um pedido através do canal de Televendas
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		public void autInitConfigurationCN00054() {
		
			cn00054CTP00001 = new br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00054.CTP00001();
		}
		
		
		/**
		 * 
		 * 
		 * CN00054 - Realizar um pedido através da opção de Clique e Retira
		 * @param parametro - Parametros de entrada do sistema
		 * @return
		 */
		@Test
		public void autStartProcess54() {
			
			autInitConfigurationCN00054();
			cn00054CTP00001.ctp54();
			
		}

	}

