package br.com.ada.pooii.aula7.Exercicio_SRP;

import java.util.List;

public record Pedido(long id, List<Item> itens, String status) {
    public Pedido updateStatusToConfirmed(){
        return new Pedido(id, itens, "Confirmado");
    }
}
