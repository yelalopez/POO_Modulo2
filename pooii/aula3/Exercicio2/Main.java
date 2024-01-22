package br.com.ada.pooii.aula3.Exercicio2;

public class Main {
    public static void main(String[] args) {

        MinhaLista<Pessoa, Long> listaDeNomes = new MinhaLista<>();

        Pessoa jorge = new Pessoa(1, "Jorge");
        listaDeNomes.adicionar(jorge);

        Pessoa maria = new Pessoa(2, "Maria");
        listaDeNomes.adicionar(maria);

        Pessoa jess = new Pessoa(3, "Jess");
        listaDeNomes.adicionar(jess);

        System.out.println("Elemento na posição 2: " + listaDeNomes.obter(2)); // Saída: Pessoa[id=3, nome="jess]
        System.out.println("A lista contém a pessoa Maria? " + listaDeNomes.contem(maria)); // Saída: true
        System.out.println("Qual a posicao do elemento de ID 3? " + listaDeNomes.indice(3L)); //

    }
}
