package br.com.ada.pooii.aula4.generics;

import java.util.List;
import java.util.Random;

public class Picker<T> {

    private List<T> array;

    public Picker(List<T> array){
        this.array = array;
    }

    public T escolhe(){
        Random random = new Random();
        int randomNumber = random.nextInt(array.size());
        return this.array.get(randomNumber);
    }

}
