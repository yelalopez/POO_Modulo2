package br.com.ada.pooii.aula7.Exercicio_SRP;

public class WhatsappService implements Confirmador {

    @Override
    public void enviarConfirmacao(String msg) {
        System.out.println("Sending Whatsapp Message: " + msg);
    }
}
