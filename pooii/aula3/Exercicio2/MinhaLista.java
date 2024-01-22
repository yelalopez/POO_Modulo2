package br.com.ada.pooii.aula3.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends ObjetoComId<U>, U> {

    private final List<T> elementos = new ArrayList<>();
    public void adicionar(T elemento){
        this.elementos.add(elemento);
    }

    public T obter(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return this.elementos.get(indice);
        }
        throw new IndexOutOfBoundsException("Posicao Invalida");

    }

    public int indice(U id){
        for(int i = 0; i < this.elementos.size(); i++){
            T elementoDaPosicao = this.elementos.get(i);
            boolean isIgual = elementoDaPosicao.getId().equals(id);
            if(isIgual){
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento){
        return this.elementos.contains(elemento);


//         for(int i = 0; i < this.elementos.size(); i++){
//              T elementoNaPosiciao = this.elementos.get(i);
//
//              if (elemento.equals(elementoNaPosiciao)){
//                  return true;
//              }
//         }
//         return false;
    }




}
