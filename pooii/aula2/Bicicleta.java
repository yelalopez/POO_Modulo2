package br.com.ada.pooii.aula2;

public class Bicicleta implements Veiculo{
    @Override
    public void acelerar(int velocidade) {
        System.out.println("acelerando a bike");
    }

    @Override
    public void frear() {
        System.out.println("freando a bike");
    }
}
