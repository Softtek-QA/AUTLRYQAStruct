package br.lry.qa.rsp.pjttrc.frt001.va.md00001.cn00070;

import org.junit.Test;

import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import br.lry.components.AUTVABaseComponent;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;

import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;

/**
 * 
 * 
 * CTP00001 - Pedido que usa mais de uma filial de saída 
 * @param parametro - Parametros de entrada do sistema
 * @return
 */
public class CTP00001 extends AUTVABaseComponent{

	@Test
	public void ctp70() {
		
		 autGetDataFlow().autInitDataFlow();
		 CMP00002(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 CMP00070(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001)).autVAIncluirItensNoCarrinho(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 CMP00012(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 CMP00004(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 CMP00014(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00024(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001)).autDescontoSecao(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
			boolean statusListaEndereco = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.FluxoSaida")
					.exists("ListaEndereco", 10000);
			if (statusListaEndereco) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.ListaEndereco").click();
				autInsertScreenByScenario();
			}

			boolean statusPopUpFrete = AUT_AGENT_SILK4J.<BrowserWindow>find("VA.FluxoSaida")
					.exists("PopUpFreteAdicional", 10000);
			if (statusPopUpFrete) {
				AUT_AGENT_SILK4J.<DomElement>find("VA.FluxoSaida.PopUpFreteAdicional").click();
				autInsertScreenByScenario();
			}
			/**
		 WebDriver driver = AUT_AGENT_SILK4J.<BrowserApplication>find("//BrowserApplication").getWebDriver();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,500)", "");
		 AUT_AGENT_SILK4J.<BrowserWindow>find("//BrowserApplication").executeJavaScript(code);
		 
		 driver.findElement(By.id("itementrega-0")).click();
		 new Select(driver.findElement(By.id("deliveryOptionType-0"))).selectByIndex(1);
		 new Select(driver.findElement(By.id("deliveryOptionDeposit-0"))).selectByVisibleText(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001,"AUT_FILIAL_ESTOQUE").toString());
		 driver.findElement(By.id("nearDate-0-delivery")).click();
		 new Select(driver.findElement(By.id("deliveryOptionShift-0"))).selectByIndex(1);
		 driver.findElement(By.id("itementrega-1")).click();
		 new Select(driver.findElement(By.id("deliveryOptionType-1"))).selectByIndex(1);
		 new Select(driver.findElement(By.id("deliveryOptionDeposit-1"))).selectByVisibleText(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001,"AUT_FILIAL_ESTOQUE").toString());
		 driver.findElement(By.id("nearDate-1-delivery")).click();
		 new Select(driver.findElement(By.id("deliveryOptionShift-1"))).selectByIndex(1);
		 **/
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();		 
		 CMP00020(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00019_CTP00001)).autSelecaoMeioPagamento(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00070_CTP00001));
		 AUT_AGENT_SILK4J.<DomButton>find("VA.AtualizacaoDados.Avançar").click();
		 CMP00034(autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00001_CN00019_CTP00001));	
		 CMP00022();		

	}
}
