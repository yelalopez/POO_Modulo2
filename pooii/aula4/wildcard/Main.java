package br.com.ada.pooii.aula4.wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Generics -> WildCard
        //List<Double> != List<Number>  --> Nao herda de List<Number>;

        List<Double> list = Arrays.asList(1.2, 1.3, 1.4);

        printWithWildcard(list);
    }
    public static void printWithoutWildcard(List<Number> numero){
        for(Number n: numero) System.out.println(n);
    }

    //Wildcard limitado <? extends Number>
    public static void printWithWildcard(List<? extends Number> number){
        for(Number n: number) System.out.println(n);
    }
}


// <T> invariante

