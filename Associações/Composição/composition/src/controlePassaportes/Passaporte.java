package controlePassaportes;

public class Passaporte {
    private String numero;

    public Passaporte(String numero) {
        this.numero = numero;
        System.out.println("Passaporte emitido com o número: " + numero);
    }

    public String getNumero() {
        return numero;
    }
}
