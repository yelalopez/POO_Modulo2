package br.com.ada.pooii.aula7.Exercicio_SRP;

public class SMSService  implements Confirmador {

    public SMSService(String operator){
        System.out.println("Sending SMS through " + operator);
    }
    @Override
    public void enviarConfirmacao(String msg) {
        System.out.println("Sending SMS " + msg);
    }
}
