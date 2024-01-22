package br.com.ada.pooii.aula5.exercicio_pilha;

public class Main {
    public static void main(String[] args) {

        Stack<String> minhaStack = new StackImpl<>();

        //PUSH
        System.out.println("___Push___");
        minhaStack.push("Yela");
        minhaStack.push("Mariana");
        minhaStack.push("Erika");
        minhaStack.push("Carolina");


        //POP
        System.out.println("___Pop___");
        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.pop();
        System.out.println(nome);

        //PEEK
        System.out.println("___Peek___");
        nome = minhaStack.peek();
        System.out.println(nome);

        //isEMPTY
        System.out.println("___IsEmpty___");
        Boolean isEmpty = minhaStack.isEmpty();
        System.out.println(isEmpty);

        System.out.println();






    }
}
