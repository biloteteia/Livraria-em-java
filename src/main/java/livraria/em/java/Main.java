package livraria.em.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Biblioteca bb = new Biblioteca();
        
        int decisao;
        
        do {
            System.out.println("\nMenu:\n1 - Adicionar livros\n2 - Remover livros\n3 - Exibir livros\n4 - Sair");
            System.out.print("\nO que deseja fazer? ");
            decisao = sc.nextInt();
            sc.nextLine(); // limpa o enter apos a decisao ser tomada
            // sempre que usar um nextInt() tem q fazer isso
            
            switch(decisao) {
                case 1:
                    if (bb.livros.size() < 5) {
                        System.out.print("\nDigite o numero do livro: ");
                        int numero = sc.nextInt();
                        sc.nextLine();

                        System.out.print("O titulo: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Ano: ");
                        int ano = sc.nextInt();
                        sc.nextLine();

                        Livro livro = new Livro(numero, titulo, autor, ano);
                        bb.adicionarLivro(livro);
                        break;
                    }
                    else {
                        System.out.println("\nNao suportamos mais que 5 livros. :(");
                        break;
                    }
                case 2:
                    if (bb.livros.isEmpty()) {
                        System.out.println("\nNenhum livro na lista para remocao.");
                        break;
                    }
                    else {
                        System.out.println();
                        for (Livro l : bb.livros) {
                            System.out.println(l.getNum() + " - " + l.getTitulo());
                        }
                        System.out.print("Digite o numero do livro que deseja remover: ");
                        int numRemover = sc.nextInt();
                        sc.nextLine();
                    
                        bb.removerLivro(numRemover);
                        break;
                    }  
                case 3:
                    bb.listarLivros();
                    break;
                case 4:
                    System.out.println("\nFim do programa, volte sempre! :)");
                    break;
                default:
                    System.out.println("\nOpcao invalida, tente novamente.");
            }
        } while(decisao != 4);
        sc.close(); // fecha o scanner
    }
}
