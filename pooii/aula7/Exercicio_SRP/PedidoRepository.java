package br.com.ada.pooii.aula7.Exercicio_SRP;

public class PedidoRepository implements ContratoRepository{

    public PedidoRepository(String url, String password){
        System.out.println("Connecting to DB");
        System.out.println("URL: " + url);
        System.out.println("Senha: " + password);
    }
    @Override
    public Pedido buscarPedido(long id) {
        System.out.println("Searching order by ID " + id);;
        return new Pedido(id, null, "Pendente");
    }
    @Override
    public void atualizar(long id, Pedido pedido) {
        System.out.println("Updating order " + id +  " in DB. Your order: " + pedido);
    }
    public void salvar(Pedido pedido){
        System.out.println("Saving order in DB " + pedido);
    }

    public void deletar(long id){
        System.out.println("Deleting order by id in the database " + id);
    }
}
