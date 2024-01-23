package br.com.ada.pooii.aula6.ExercicioUser;

public class User {
    private String name;
    private String email;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

//Exercicio de Refatoração de Código
//public class User {
//    private String name;
//    private String email;
//    private String cpf;
//
//    // Métodos de acesso (getters/setters)
//
//    public void saveUser() {
//        // Salva o usuário no banco de dados
//        // Esta é uma violação do SRP, pois a classe User também está lidando com a persistência dos dados
//    }
//
//    public void sendEmail(String message) {
//        // Envia um e-mail para o usuário
//        // Esta é outra violação do SRP, pois User também está lidando com comunicação por e-mail
//    }
//
//    public void sendSMS(String message) {
//        // Envia um SMS para o usuário
//        // Esta é outra violação do SRP, pois User também está lidando com comunicação por SMS
//    }
//
//    public boolean isValidCPF() {
//        // Faz o calculo para verificar se o CPF é valido
//        // Esta é mais uma violação do SRP, pois User também tem que saber o calculo do CPF.
//    }
//}