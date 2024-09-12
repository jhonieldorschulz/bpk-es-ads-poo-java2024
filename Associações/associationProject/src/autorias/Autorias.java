package autorias;

public class Autorias {
    public static void main(String[] args) {
        Autor autor = new Autor("Stephen King");
        autor.escreverLivro(new Livro("A Torre Negra - Escolha dos Três", "010101", autor));
        autor.escreverLivro(new Livro("O Exorcista", "555", autor));
        System.out.println(autor);

        for (Livro livro : autor.getLivros()) {
            System.out.println(livro.getAutor());
        }
    }
}
