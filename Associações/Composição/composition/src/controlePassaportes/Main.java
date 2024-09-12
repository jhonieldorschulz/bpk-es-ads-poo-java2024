package controlePassaportes;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João Silva");
        pessoa.emitirPassaporte("123456789");

        System.out.println("Número do passaporte: " + pessoa.getPassaporteNumero());
    }
}
