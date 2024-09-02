package exercicio07;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Javaman", "01", "Doutorado em IA");

        aluno.registrarNota(100.0);
        aluno.registrarNota(60.0);

        System.out.println("Média: " + aluno.getMedia());

    }
}
