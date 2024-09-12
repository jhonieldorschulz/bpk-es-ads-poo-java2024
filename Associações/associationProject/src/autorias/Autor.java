package autorias;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String nacionalidade;

    private List<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade != null && !nacionalidade.isEmpty()) {
            this.nacionalidade = nacionalidade;
        } else {
            System.out.println("Nacionalidade inválida!");
        }

    }

    public void escreverLivro(Livro livro) {
        this.livros.add(livro);
    }


    public List<Livro> getLivros() {
        return livros;
    }

//    @Override
//    public String toString() {
//        String autorias = "";
//        for (Livro livro : livros) {
//            autorias += livro.getNome() + ", ";
//        }
//        return """
//                Autor: %s
//                Livros: %s
//                """.formatted(nome, autorias);
//    }


    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", livros=" + livros +
                '}';
    }
}
