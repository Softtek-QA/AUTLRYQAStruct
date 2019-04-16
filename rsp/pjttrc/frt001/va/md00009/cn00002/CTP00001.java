package br.lry.qa.rsp.pjttrc.frt001.va.md00009.cn00002;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.borland.silktest.jtf.internal.SilkTestRunListener;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomRadioButton;
import com.borland.silktest.jtf.xbrowser.DomTextField;

import br.lry.components.AUTVABaseComponent;
import br.lry.components.AUTBaseComponent.AUTStoreItem.AUT_SELECT_PRODUCT_OPTIONS_BY_STORE;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.AUT_VA_TURNOS_ENTREGA;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.ENCOMENDA;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.FILIAIS;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.FLUXO_SAIDA_TIPOS;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.TIPOS_RETIRA;
import br.lry.components.AUTVABaseComponent.AUTVAFluxosSaidaComponente.USAR_DATA_MAIS_PROXIMA;
import br.lry.components.AUTVABaseComponent.AUTVAFormasPagamento.CAMPOS_CONFIGURACAO;
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
	java.util.HashMap<String,Object> parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);
	AUT_TABLE_PARAMETERS_NAMES tbl;
	@Test
	public void AUT_IT00003_STVA_ID00004_FRT004_CN00002_GERACAO_PEDIDOS() {
		AUTITestFlowProcess tst = new AUTITestFlowProcess() {
			@Override
			public boolean autInitProcess() {	
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_EDICAO_ITEM_OPCAO", AUT_EDICAO_PEDIDO.QUANTIDADE_ITEM_QUANT_ADICIONAR_PADRAO.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_MODO_CONSULTA_ITEM", AUT_MODO_CONSULTAS_VA_SELECAO_ITEM.EDICAO.name());
				String numeroCartao = AUTProjectsFunctions.gerarItemChaveRandomico(10);
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_NUMERO_CARTAO", numeroCartao);								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_INIT_APP", true);								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_TIPO_ACESSO_LOGIN", AUT_TIPO_ACESSO_LOGIN.USUARIO_LOJA.name());								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_LOJA_TELEVENDAS", AUT_BOITATA_LOJAS.SAO_BERNARDO_CAMPO.name());								

				
				System.out.println(CMP11007(parameters).getRowsCount());				
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);				
				System.out.println(String.format("AUT INFO: NUMERO DO CARTAO PARA PEDIDO: PRE CONFIGURADO: %s",numeroCartao));
				CMP11001(parameters); //Inicializa login pelo boitata
				
				com.borland.silktest.jtf.Utils.sleep(8 * 1000);
				CMP11002(parameters);//Adiciona o item padrão pelo fluxo do boitatá
				
				
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);												
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_QUANTIDADE_MAXIMA_ITENS",5);
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_OPCAO_SELECAO_ITEM",AUT_SELECT_PRODUCT_OPTIONS_BY_STORE.CONDITION_BY_ID.name());
				//Configuração de itens para cenário
				//autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_OPCAO_SELECAO_PARAMETRO","41,42,43,44,45,46,47,48,49,50,51");
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_OPCAO_SELECAO_PARAMETRO","41,42,43,44,45");
					
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_QUANTIDADE_PADRAO_EDICAO_ITEM_UNITARIO",AUT_EDICAO_PEDIDO.QUANTIDADE_ITEM_QUANT_ADICIONAR_PADRAO.toString());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_QUANTIDADE_PADRAO_EDICAO_ITEM_FRACIONADO",AUT_EDICAO_PEDIDO.QUANTIDADE_ITEM_QUANT_ADICIONAR_PADRAO.toString());

				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_REMOVER_ITENS_CARRINHO", br.lry.dataflow.AUTDataFlow.AUT_CONFIRMACAO_USUARIO.SIM.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_TIPO_EXCLUSAO_ITEM", br.lry.dataflow.AUTDataFlow.AUT_CONFIRMACAO_USUARIO.EXCLUSAO_GERAL_LIMPAR_CARRINHO.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_PARAMETRO_EXCLUSAO_ITENS",3);

				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_MODO_CONSULTA_ITEM",AUT_MODO_CONSULTAS_VA_SELECAO_ITEM.EDICAO.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_PARAMETRO_EXCLUSAO_ITENS",3);

				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);
				
				
				java.util.List<AUTStoreItem> listItens = CMP11004(parameters);//Limpa o carrinho de compras e inclui os items especificos do cenário de negócio				
				Integer index = 1;
				for(AUTStoreItem item : listItens) {
					String col = String.format("AUT_CT_MATERIAL_%s",index);					
					autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, col, item.getLmMaterial());					
					switch(index) {
					case 1:{
						item.setAutFluxoPedidoAlterarQuantidadePedido(true);						
						item.setInputFluxoPedidoAlterarQuantidadePedido(Integer.parseInt(parameters.get("AUT_QUANTIDADE_PADRAO_EDICAO_ITEM_UNITARIO").toString()));						
						break;
					}
					case 2:{		
						break;
					}
					}
					index++;
				}
								
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);
				
				CMP11005(parameters);//Converte o carrinho para pedido de compra
				CMP11006(parameters);				
				
				CMP11007(parameters).autIrProximaPagina();
				CMP11007(parameters).autConfigurarFluxosSaidaEntrega(FILIAIS.LOJA);				
				CMP11007(parameters).autFinalizarPedido();				
				String numeroPedido = CMP11009(parameters);
				
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_NUMERO_PEDIDO", numeroPedido);								
				
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);
				
				
				CMP11013(parameters);
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_INIT_APP", false);								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_TIPO_ACESSO_LOGIN", AUT_TIPO_ACESSO_LOGIN.USUARIO_TELEVENDAS.name());								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_MODO_CONSULTA_ITEM", AUT_MODO_CONSULTAS_VA_SELECAO_ITEM.EDICAO_DO_BOITATA.name());								

				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);								

				CMP11001(parameters); //Executa procedimentos para login pelo fluxo : Boitatá								
				CMP11010(parameters); //Inicia o fluxo de edição de pedido pelo boitatá				
				
				
				//CT-1-3
				
				
				//EDITAR QUANTIDADE DOS ITEMS NO CARRINHO
				
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_OPCAO_SELECAO_ITEM",AUT_SELECT_PRODUCT_OPTIONS_BY_STORE.CONDITION_BY_ID.name());				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_OPCAO_SELECAO_PARAMETRO","46,47,48,49,50,51");				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_OPCAO_SELECAO_ITEM",AUT_SELECT_PRODUCT_OPTIONS_BY_STORE.INCLUSAO_PARCIAL_ITENS_CARRINHO_CRIADO.name());				
				
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);								
				java.util.List<AUTStoreItem> listItensInclusao = CMP11004(parameters);//Limpa o carrinho de compras e inclui os items especificos do cenário de negócio	
				
				for(AUTStoreItem item : listItensInclusao) {
					String col = String.format("AUT_CT_MATERIAL_%s",index);					
					autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, col, item.getLmMaterial());					
					switch(index) {
					case 1:{
						item.setAutFluxoPedidoAlterarQuantidadePedido(true);						
						item.setInputFluxoPedidoAlterarQuantidadePedido(Integer.parseInt(parameters.get("AUT_QUANTIDADE_PADRAO_EDICAO_ITEM_UNITARIO").toString()));												
						break;
					}
					case 2:{		
						break;
					}
					}
					index++;
				}
				
				
				CMP11007(parameters).autIrProximaPagina();
				CMP11007(parameters).autConfigurarFluxosSaidaEntrega(FILIAIS.LOJA);
				CMP11007(parameters).autIrProximaPagina();
				
				CMP11025(parameters).getGerenciadorFormasPagamentoCartoes().processarPagamento(parameters);
				
				CMP11007(parameters).autFinalizarPedidoFromConfigFormasPagamento();
				
				CMP11013(parameters);
				//CT-4-7
				
				
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_INIT_APP", false);								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_TIPO_ACESSO_LOGIN", AUT_TIPO_ACESSO_LOGIN.USUARIO_GERENTE_APROVADOR.name());								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_MODO_CONSULTA_ITEM", AUT_MODO_CONSULTAS_VA_SELECAO_ITEM.EDICAO_DO_BOITATA.name());								

				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);								

				CMP11001(parameters); //Executa procedimentos para login pelo fluxo : Boitatá								

				CMP11019_V2(parameters);
				//CT-8-9
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_MODO_CONSULTA_ITEM", AUT_MODO_CONSULTAS_VA_SELECAO_ITEM.CONSULTA_STATUS_PEDIDO.name());
				parameters = autGetDataFlow().autGetParametersFromTable(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001);								
				
				CMP11010(parameters);
				
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_EDICAO_ITEM_OPCAO", AUT_EDICAO_PEDIDO.DATA_AGENDAMENTO_FLUXO_ENTREGAS.name());
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_INDEX_NOVA_DATA_AGENDA", 2);
				
				parameters.remove("AUT_ITENS_EDICAO");
				parameters.put("AUT_ITENS_EDICAO", listItensInclusao);

				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_INIT_APP", false);								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_TIPO_ACESSO_LOGIN", AUT_TIPO_ACESSO_LOGIN.USUARIO_LOJA.name());								
				autSetCurrentParameter(AUT_TABLE_PARAMETERS_NAMES.RSP_PJTTRC_FRT001_VA_MD00009_CN00002_CTP00001, "AUT_MODO_CONSULTA_ITEM", AUT_MODO_CONSULTAS_VA_SELECAO_ITEM.EDICAO_DO_BOITATA.name());								

				CMP11001(parameters);
				
				/*
				CMP11011(parameters);
				
				
				CMP11007(parameters).autIrProximaPagina();
				CMP11007(parameters).setUsarDataMaisProximaPorIndexLinha(USAR_DATA_MAIS_PROXIMA.SIM, 1, 2);				
				CMP11007(parameters).autIrProximaPagina();
*/
				
				/*
				//EDITAR QUANTIDADE DOS ITEMS NO CARRINHO
				CMP11010(parameters); //Incluir itens no carrinho 6-10
				

				//EDITAR QUANTIDADE DOS ITEMS NO CARRINHO
				CMP11011(parameters); //Alterar forma de pagamento

				//EDITAR QUANTIDADE DOS ITEMS NO CARRINHO
				CMP11011(parameters); //Habilitar opçao para ingnorar anti fraude

				
				CMP11007(parameters).autConfigurarFluxosSaidaEntrega(FILIAIS.LOJA);
				CMP11007(parameters).autFinalizarPedido();
				
				CMP11022(parameters);
				*/
				
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
