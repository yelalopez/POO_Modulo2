package br.com.ada.pooii.aula3.Exercicio2;

public record Pessoa(long id, String nome) implements ObjetoComId<Long> {
    @Override
    public Long getId() {
        return id;
    }
}
