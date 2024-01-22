package br.com.ada.pooii.aula4.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Adicionar elementos a um List
        //List<String> list = Arrays.asList("Maria", "Joana", "Laura", "Erika");


        List<String> nomesList = new ArrayList<>();
        nomesList.add("Maria");
        nomesList.add("Joana");
        nomesList.add("Laura");
        nomesList.add("Erika");

        Picker<String> stringPicker = new Picker<>(nomesList);
        System.out.println(stringPicker.escolhe());


    }
}
