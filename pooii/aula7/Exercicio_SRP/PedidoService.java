package br.com.ada.pooii.aula7.Exercicio_SRP;

import java.util.List;

public class PedidoService {

    private final ContratoRepository contratoRepository;
    private final Confirmador confirmador;

    public PedidoService(ContratoRepository contratoRepository, Confirmador confirmador){
        this.contratoRepository = contratoRepository;
        this.confirmador = confirmador;
    }
    public void confirmarPedido(long id){
        //Valida ID
        Pedido pedidoEncontrado = contratoRepository.buscarPedido(id);
        //Busca no DB
        Pedido pedidoAtualizado = pedidoEncontrado.updateStatusToConfirmed();
        //Atualiza pedido no BD
        contratoRepository.atualizar(id, pedidoAtualizado);
        //Envia email de confirmacao
        confirmador.enviarConfirmacao("Pedido confirmado: " + pedidoAtualizado);
    }

    public double calcularTotalPedido(){
        return 0.0;
    }
    public List<Item> getItens() {
        return null;
    }
    public long getQtdItens() {
        return 0;
    }
    public void addItem(Item item) {

    }
    public void deletarItem(Item item) {

    }
}