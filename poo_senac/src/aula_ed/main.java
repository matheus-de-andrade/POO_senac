package aula_ed;

import java.util.ArrayList;

public class main {

    public static void main(String[] args){

        // Criar uma ArrayList de números inteiros
        ArrayList<Integer> lista = new ArrayList<>();

        // Adicionar elementos à lista
        lista.add(10); 
        lista.add(20); 
        lista.add(30); 
        lista.add(40); 

        // Acessar elementos da lista
        int primeiroElemento = lista.get(0);
        System.out.println("Primeiro elemento: " + primeiroElemento);

        // Remover um elemento da lista
        lista.remove(2); // Remove o elemento com índice 2 (o valor 30)

        // Iterar pela lista e imprimir os elementos
        System.out.println("Elementos da lista:");
        for (int elemento : lista) {
            System.out.println(elemento);
        }

        // Verificar o tamanho da lista
        int tamanho = lista.size();
        System.out.println("Tamanho da lista: " + tamanho);
    }
}


