package livraria.em.java;

public class Livro {
    private int numero, ano;
    private String titulo, autor;
    
    // construtor
    public Livro(int numero, String titulo, String autor, int ano) {
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    
    // getters
    public int getNum() { return this.numero; }
    public int getAno() { return this.ano; }
    public String getTitulo() { return this.titulo; }
    public String getAutor() { return this.autor; }
    
    // setters
    public void setNum(int id) { this.numero = id; }
    public void setAno(int a) { this.ano = a; }
    public void setTitulo(String t) { this.titulo = t; }
    public void setAutor(String a) { this.autor = a; }
    
    public void exibirInfo() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("-----------------------------");
    }
}