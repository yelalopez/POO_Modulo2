package br.com.ada.pooii.aula4.generics;


import java.util.List;


public class Util {

    //metodos genericos
    public static <T> void swapElements(List<T> lista, int de, int para){
        T elementDe = lista.get(de);
        T elementPara = lista.get(para);

        //swapping elements
        lista.set(de, elementPara);
        lista.set(para, elementDe);

    }

    public static <T extends Comparable<T>> T findMax(List<T> lista){
        if(lista.isEmpty()){
            return null;
        }

        T maxElement = lista.get(0);

        for(T item: lista){
            if(item.compareTo(maxElement) > 0){
                maxElement = item;
            }
        }

        return maxElement;
    }
}
