package br.com.ada.pooii.aula4.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsMethod {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3);


        //declaracao implicita
        Util.<Integer>swapElements(lista, 0, 1);
        Integer maxNum = Util.findMax(lista);

        System.out.println(lista);
        System.out.println("Max: " + maxNum);

        //Testando String

        List<String> names = Arrays.asList("Eva", "Luna", "Tiago", "Yelitza");

        Util.swapElements(names, 0, names.size() -1);
        String maxLengthName = Util.findMax(names);

        System.out.println("Última:" + names);
        System.out.println(maxLengthName);


    }
}
