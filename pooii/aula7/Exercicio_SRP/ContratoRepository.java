package br.com.ada.pooii.aula7.Exercicio_SRP;

public interface ContratoRepository {
    Pedido buscarPedido(long id);
    void atualizar(long id, Pedido pedido);

}
