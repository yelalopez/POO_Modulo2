package br.com.ada.pooii.aula2;

public class Carro implements VeiculoMotorizado{
    @Override
    public void ligar() {
        System.out.println("ligando o carro");

    }

    @Override
    public void desligar() {
        System.out.println("desligando o carro");
    }

    @Override
    public void acelerar(int velocidade) {
        if (velocidade <= velocidadePermitida()) {
            System.out.println("acelerando o carro em: " + velocidade);
        } else {
            System.out.println("excesso de velocidade");
        }
    }

    @Override
    public void frear() {

    }

    @Override
    public Integer velocidadePermitida() {
        return 220;
    }
}
