package br.com.ada.pooii.aula7.Exercicio_SRP;

public class EmailService implements Confirmador {
    public EmailService(String client, String password) {
        System.out.println("Sending email to " + ", password " + password);
    }
    @Override
    public void enviarConfirmacao(String msg) {
        System.out.println("Confirmation email  " + msg);
    }
}
