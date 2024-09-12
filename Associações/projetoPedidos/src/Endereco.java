public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String cep;

    public Endereco(String rua, String numero, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + ", " + cidade + ", " + cep;
    }
}
