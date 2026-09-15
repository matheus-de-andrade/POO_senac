package aula_ed;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    Scanner tc = new Scanner(System.in);

    private String nome;
    private double preco;
    private int qtd_estoque;

    ArrayList<String> produtos = new ArrayList<>();

    public void gerenciarProdutos(){
        System.out.print("1- Adicionar item\n2- Remover item\n3- Atualizar item\n4- Listar items\n5- Buscar item");
        int opcao = tc.nextInt();

        switch(opcao){
            case 1: {
            System.out.print("\nVamos adicionar um item:\n\nNome: ");
            this.nome = tc.nextLine();
            System.out.print("\nPreço: ");
            this.preco = tc.nextDouble();
            System.out.print("\nQuantidade em estoque: ");
            this.qtd_estoque = tc.nextInt();
            this.add();
            }
            case 2: {
                System.out.print("\nQual item deseja remover?");
                int i = tc.nextInt();
                produtos.remove(i);
            }
            case 3: {
                System.out.print("Qual item deseja atualizar? ");
                int i = tc.nextInt();
                System.out.print(this.nome + " -> ");
                this.nome = (i).nome.set(tc.nextLine());
            }
            case 4:{
                for(int i = 0; i >= produtos.size(); i++){
                    System.out.print("Nome: " + this.nome());
                    
                }
                
            }
        }

    }

}
