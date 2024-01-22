package br.com.ada.pooii.aula2;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Bicicleta bike = new Bicicleta();
        Moto moto = new Moto();

        carro.acelerar(20);
        bike.frear();
        System.out.println(moto.velocidadePermitida());


    }
}
