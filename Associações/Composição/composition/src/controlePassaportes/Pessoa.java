package controlePassaportes;

public class Pessoa {
    private String nome;
    private Passaporte passaporte;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Pessoa criada: " + nome);
    }

    public void emitirPassaporte(String numero) {
        passaporte = new Passaporte(numero); // Pessoa controla a criação do passaporte
    }

    public String getPassaporteNumero() {
        if (passaporte != null) {
            return passaporte.getNumero();
        } else {
            return "Nenhum passaporte emitido.";
        }
    }
}
