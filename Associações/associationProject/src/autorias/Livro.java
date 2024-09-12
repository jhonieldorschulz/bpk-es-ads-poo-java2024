package autorias;

public class Livro {
    private String nome;
    private String isbn;
    private Autor autor;

    public Livro(String nome, String isbn, Autor autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor.getNome();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor.getNome() +
                '}';
    }
}
