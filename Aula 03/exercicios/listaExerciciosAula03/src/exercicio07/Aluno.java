package exercicio07;

import java.util.ArrayList;
import java.util.List;

/**
 * 7 - Implemente uma classe Aluno com atributos
 * nome, matricula, e curso.
 * Adicione um método para calcular a média de notas.
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private Double media = 0.0;

    private List<Double> notas;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public void registrarNota(Double nota) {
        notas.add(nota);
        calcularMedia();
    }

    private void calcularMedia() {
//        media = notas.stream()
//                .mapToDouble(n -> n)
//                .average()
//                .getAsDouble();

        Double somatorio = 0.0;
        for (Double nota : notas) {
            somatorio+=nota;
        }

        media = somatorio / notas.size();

    }

    public Double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
