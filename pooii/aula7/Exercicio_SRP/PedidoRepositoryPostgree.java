package br.com.ada.pooii.aula7.Exercicio_SRP;

public class PedidoRepositoryPostgree implements ContratoRepository{

    public PedidoRepositoryPostgree(String url, String password, String database, String protocolo){
        System.out.println("Connecting to DB");
        System.out.println("URL: " + url);
        System.out.println("Senha: " + password);
        System.out.println("Database: " + database);
        System.out.println("Protocolo: " + protocolo);
    }
    @Override
    public Pedido buscarPedido(long id) {
        System.out.println("[POSTGREE] - Searching order by ID: " + id);
        return new Pedido(id, null, "Pendente");
    }
    @Override
    public void atualizar(long id, Pedido pedido) {
        System.out.println("[POSTGREE] - Updating order by ID: " + id + "in the DB. Your order: " + pedido);
    }
    public void salvar(Pedido pedido){
        System.out.println("[POSTGREE] - Saving order in DB " + pedido);
    }

    public void deletar(long id){
        System.out.println("[POSTGREE] - Deleting order by id in the database " + id);
    }
}
