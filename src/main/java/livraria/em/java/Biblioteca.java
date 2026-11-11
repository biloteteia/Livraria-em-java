package livraria.em.java;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    
    void adicionarLivro(Livro livro) {
        boolean encontrado = false;
        
        for (Livro l : livros) {
            if (l.getNum() == livro.getNum()) {
                System.out.println("\nJa existe um livro com esse numero!");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            livros.add(livro);
            System.out.println("\nLivro adicionado com sucesso!");
        }
    }
    
    void removerLivro(int numero) {
        boolean encontrado = false;

        for (Livro l : livros) {
            if (numero == l.getNum()) {
                livros.remove(l);
                encontrado = true;
                System.out.println("\nLivro removido com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nLivro nao encontrado. :(");
        }
    }
    
    void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("\nNenhum livro na lista.");
        }
        else {
            System.out.println("\nLista:");
            System.out.println("-----------------------------");
            
            for (Livro l : livros) {
                l.exibirInfo();
            }
        }
    }
}