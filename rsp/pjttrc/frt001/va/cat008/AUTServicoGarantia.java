package br.lry.qa.rsp.pjttrc.frt001.va.cat008;


import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;

public class AUTServicoGarantia extends AUTVABaseComponent {

	public boolean autServicoGarantia() {
		try {
			
			System.out.println("Entrei no componente de garantia");
			AUT_AGENT_SILK4J.<DomElement>find("VA.GarantiaServicos.Servicos").setFocus();
			AUT_AGENT_SILK4J.<DomElement>find("VA.GarantiaServicos.Servicos").click();
//			AUT_AGENT_SILK4J.<DomLink>find("VA.AtualizacaoDados.Serviços").click();
			AUT_AGENT_SILK4J.<DomButton>find("VA.GarantiaServicos.AdicionarServico").setFocus();
			AUT_AGENT_SILK4J.<DomButton>find("VA.GarantiaServicos.AdicionarServico").click();
			
			
			return true;
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				return false;
			}
		}

	public boolean agendarServico(java.util.HashMap parametros) {
		try {
			AUT_AGENT_SILK4J.<DomListBox>find("VA.GarantiaServicos.Turno").click();
			AUT_AGENT_SILK4J.<DomListBox>find("VA.GarantiaServicos.Turno").select(1);
			AUT_AGENT_SILK4J.<DomListBox>find("VA.GarantiaServicos.Turno").click();
			AUT_AGENT_SILK4J.<DomLink>find("VA.GarantiaServicos.Avancar").click();
		
			if (AUT_AGENT_SILK4J.<DomElement>find("VA.Desconto.PopUp1").exists("PopUp1", 5000)) {

				AUT_AGENT_SILK4J.<DomTextField>find("VA.GarantiaServicos.Telefone").setText(parametros.get("AUT_TELEFONE_SERVIÇO").toString());
				AUT_AGENT_SILK4J.<DomButton>find("VA.GarantiaServicos.InserirTEL").click();
				AUT_AGENT_SILK4J.<DomListBox>find("VA.GarantiaServicos.Tipotelefone").select(1);
				AUT_AGENT_SILK4J.<DomButton>find("VA.GarantiaServicos.SimCadastrar").click();
			}

			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}

		
	}
	
	public boolean adicionarGarantia(java.util.HashMap parametros) {
		try {
			AUT_AGENT_SILK4J.<DomElement>find("VA.GarantiaServicos.Servicos").setFocus();
			AUT_AGENT_SILK4J.<DomElement>find("VA.GarantiaServicos.Servicos").click();

			if (AUT_AGENT_SILK4J.<DomElement>find("VA.Desconto.PopUp1").isVisible()) {

				AUT_AGENT_SILK4J.<DomLink>find("VA.GarantiaServicos.GarantiaEstendida").setFocus();
				AUT_AGENT_SILK4J.<DomLink>find("VA.GarantiaServicos.GarantiaEstendida").click();
				
				//String index = String.format("VA.GarantiaServicos.//DIV[@class='service-info'][%s]//BUTTON[@class='button button-primary button-full button-overflow']", parametros.get("AUT_INDEX_GARANTIA"));
				String index = String.format("VA.GarantiaServicos.//DIV[@class='warranty-section mar*']//DIV[@class='service-info'][%s]//DIV[@class='margin-top']//BUTTON[@class='button button-primary button-full button-overflow']", parametros.get("AUT_INDEX_GARANTIA"));
				AUT_AGENT_SILK4J.<DomElement>find(index).click();
				
			}

			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return false;
		}

	
	}

	
	}

	
