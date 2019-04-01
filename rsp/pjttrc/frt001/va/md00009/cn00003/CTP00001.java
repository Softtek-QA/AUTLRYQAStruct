package br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00003;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.borland.silktest.jtf.internal.SilkTestRunListener;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.AUTBaseComponent.AUTStoreItem.AUT_SELECT_PRODUCT_OPTIONS_BY_STORE;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.AUT_VA_TURNOS_ENTREGA;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.ENCOMENDA;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.FILIAIS;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.FLUXO_SAIDA_TIPOS;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.TIPOS_RETIRA;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.USAR_DATA_MAIS_PROXIMA;
import br.lry.components.va.cat007.AUTFluxoSaida.AUT_VA_TIPO_FRETE;
import br.lry.dataflow.AUTDataFlow.AUT_CONFIRMACAO_USUARIO;
import br.lry.dataflow.AUTDataFlow.AUT_EDICAO_PEDIDO;
import br.lry.dataflow.AUTDataFlow.AUT_MODO_CONSULTAS_VA_SELECAO_ITEM;
import br.lry.dataflow.AUTDataFlow.AUT_TABLE_PARAMETERS_NAMES;
import br.lry.functions.AUTProjectsFunctions;
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
	java.util.HashMap<String,Object> parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);
	AUT_TABLE_PARAMETERS_NAMES tbl;
	@Test
	public void AUT_IT00003_STVA_ID00004_FRT004_CN00003_GERACAO_PEDIDOS() {
		AUTITestFlowProcess tst = new AUTITestFlowProcess() {
			@Override
			public boolean autInitProcess() {	
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_EDICAO_ITEM_OPCAO", AUT_EDICAO_PEDIDO.QUANTIDADE_ITEM_QUANT_ADICIONAR_PADRAO.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_MODO_CONSULTA_ITEM", AUT_MODO_CONSULTAS_VA_SELECAO_ITEM.EDICAO.name());
				String numeroCartao = AUTProjectsFunctions.gerarItemChaveRandomico(10);
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_NUMERO_CARTAO", numeroCartao);								
				
				System.out.println(CMP11007(parameters).getRowsCount());
				
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);				
				System.out.println(String.format("AUT INFO: NUMERO DO CARTAO PARA PEDIDO: PRE CONFIGURADO: %s",numeroCartao));
				CMP11001(parameters); //Inicializa login pelo boitata
				
				com.borland.silktest.jtf.Utils.sleep(8 * 1000);
				CMP11002(parameters);//Adiciona o item padrão pelo fluxo do boitatá
				
				
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);												
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_QUANTIDADE_MAXIMA_ITENS",6);
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_OPCAO_SELECAO_ITEM",AUT_SELECT_PRODUCT_OPTIONS_BY_STORE.CONDITION_BY_STORE.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_OPCAO_SELECAO_PARAMETRO",FILIAIS.LJ0045.toString());
					
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_QUANTIDADE_PADRAO_EDICAO_ITEM_UNITARIO",AUT_EDICAO_PEDIDO.QUANTIDADE_ITEM_QUANT_ADICIONAR_PADRAO.toString());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_QUANTIDADE_PADRAO_EDICAO_ITEM_FRACIONADO",AUT_EDICAO_PEDIDO.QUANTIDADE_ITEM_QUANT_ADICIONAR_PADRAO.toString());

				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_REMOVER_ITENS_CARRINHO", br.lry.dataflow.AUTDataFlow.AUT_CONFIRMACAO_USUARIO.SIM.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_TIPO_EXCLUSAO_ITEM", br.lry.dataflow.AUTDataFlow.AUT_CONFIRMACAO_USUARIO.EXCLUSAO_GERAL_LIMPAR_CARRINHO.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_PARAMETRO_EXCLUSAO_ITENS",3);
								
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);
				
				java.util.List<AUTStoreItem> listItens = CMP11004(parameters);//Limpa o carrinho de compras e inclui os items especificos do cenário de negócio
				Integer index = 1;
				for(AUTStoreItem item : listItens) {
					String col = String.format("AUT_CT_MATERIAL_%s",index);					
					autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, col, item.getLmMaterial());					
					item.setAutFluxoPedidoAlterarQuantidadePedido(true);						
					item.setInputFluxoPedidoAlterarQuantidadePedido(Integer.parseInt(parameters.get("AUT_QUANTIDADE_PADRAO_EDICAO_ITEM_UNITARIO").toString())+index);						
					index++;
				}
								
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);
				
				CMP11005(parameters);//Converte o carrinho para pedido de compra
				CMP11006(parameters);				
				
				
				CMP11007(parameters).setFluxoEntregasGeral();
				CMP11007(parameters).autGerarPedidosEntrega(FILIAIS.LOJA);
				CMP11007(parameters).autFinalizarPedido();
				
				
				String numeroPedido = CMP11009(parameters);

				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_NUMERO_PEDIDO", numeroPedido);								
				
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);

				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001, "AUT_EDICAO_ITEM_OPCAO", AUT_EDICAO_PEDIDO.QUANTIDADE_ITEM_QUANT_ADICIONAR_POR_ATRIBUTO.name());
					
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00003_CTP00001);
				
				parameters.remove("AUT_ITENS_EDICAO");
				parameters.put("AUT_ITENS_EDICAO",listItens);	
				
				CMP11010(parameters);
				
				//EDITAR QUANTIDADE DOS ITEMS NO CARRINHO
				CMP11011(parameters);

				CMP11007(parameters).autIrProximaPagina();
				CMP11007(parameters).autGerarPedidosEntrega(FILIAIS.LOJA);				
				CMP11007(parameters).autFinalizarPedido();				
				CMP11009(parameters);
				
				//EDITAR QUANTIDADE DOS ITEMS NO CARRINHO
				CMP11011(parameters); //Altera garantia extendida

				
				//EDITAR QUANTIDADE DOS ITEMS NO CARRINHO
				CMP11011(parameters); //Altera datas para entrega a domicilio

				CMP11007(parameters).autIrProximaPagina();
				CMP11007(parameters).autGerarPedidosEntrega(FILIAIS.LOJA);				
				CMP11007(parameters).autFinalizarPedido();				
				CMP11009(parameters);

				CMP11015(parameters); //Executa procedimentos de pagamento no PDV
				
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
