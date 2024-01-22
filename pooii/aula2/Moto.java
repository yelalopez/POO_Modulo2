package br.com.ada.pooii.aula2;

public class Moto implements VeiculoMotorizado{
    @Override
    public void ligar() {
        System.out.println("ligando a moto");

    }

    @Override
    public void desligar() {
        System.out.println("desligando a moto");
    }

    @Override
    public void acelerar(int velocidade) {
        if (velocidade <= velocidadePermitida()) {
            System.out.println("acelerando a moto em: " + velocidade);
        } else {
            System.out.println("excesso de velocidade");
        }
    }

    @Override
    public void frear() {
        System.out.println("freando a moto");
    }

    @Override
    public Integer velocidadePermitida() {
        return 100;
    }
}
