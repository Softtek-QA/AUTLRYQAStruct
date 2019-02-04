package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00074;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.qa.rsp.pjttrc.frt001.va.cat007.AUTFluxoSaida.AUT_VA_FLUXO_SAIDA;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;

/**
 * 
 * 
 * CTP00001 - Pedido com frete adicional 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp74() {
		
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00070(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001)).autVAIncluirItensNoCarrinho(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 

		 /**
		 WebDriver driver = AUT_AGENT_SILK4J.<BrowserApplication>find("//BrowserApplication").getWebDriver();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,500)", "");			
		 driver.findElement(By.id("itementrega-0")).click();
			boolean statusListaEndereco = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.FluxoSaida")
					.exists("ListaEndereco", 10000);
			if (statusListaEndereco) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.ListaEndereco").click();
				autInsertScreenByScenario();
			}
		 AUT_AGENT_SILK4J.<DomListBox>find("VA.FluxoSaida.SelecionarFrete").select(1);
		 AUT_AGENT_SILK4J.<DomButton>find("VA.FluxoSaida.BotaoSalvar").click();
		 new Select(driver.findElement(By.id("deliveryOptionType-0"))).selectByIndex(1);
		 driver.findElement(By.id("nearDate-0-delivery")).click();
		 new Select(driver.findElement(By.id("deliveryOptionShift-0"))).selectByIndex(1);
		 **/
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00074_CTP00001));	
		 CMP00022();		

	}
}
