package br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00001;

import org.junit.Test;

import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions.*;
import br.stk.framework.tests.AUTFWKTestObjectBase.AUTTestFlowManager.AUTITestFlowProcess;
import br.stk.framework.tests.AUTFWKTestObjectBase.AUTTestFlowManager.AUTTestProcessDefinition;

/**
 * 
 * 1. Iniciar um pedido de venda para cliente do tipo pessoa física;
 * 
 * @author Softtek-QA
 *
 */
public class CTP00001 extends AUTVABaseComponent {
	java.util.HashMap<Integer,java.util.HashMap<String,Object>> parameters = autGetDataFlow().autGetAllParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00001_CTP00001);
	AUT_TABLE_PARAMETERS_NAMES tbl;
	@Test
	public void autStartTest() {
		AUTITestFlowProcess tst = new AUTITestFlowProcess() {
			@Override
			public boolean autInitProcess() {
				// TODO Auto-generated method stub
				CMP11001(parameters.get(1));
				com.borland.silktest.jtf.Utils.sleep(5 * 1000);
				CMP11002(parameters.get(1));
				CMP11003(parameters.get(1));
				return true;
			}

			@Override
			public boolean autStartProcess() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean autEndProcess() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean autSyncronizeProcess() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean autStartParalelProcess() {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		
		tst.autStartProcessExecutionFlow();
		
	}
}
