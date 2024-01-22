package br.com.ada.pooii.aula5.exercicio_pilha;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<E> implements Stack<E> {

    private final List<E> list;

    public StackImpl(){
        this.list = new ArrayList<>();
    }

    @Override
    public void push(E elemento) {
        list.add(elemento);
    }

    @Override
    public E pop() {
        if(!isEmpty())
            return list.remove(list.size() - 1);
        return null;
    }

    @Override
    public E peek() {
        if(!isEmpty()) {
            return list.getLast();
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
