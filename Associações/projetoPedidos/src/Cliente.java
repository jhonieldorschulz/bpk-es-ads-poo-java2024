public class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return nome + ", Endereço: " + endereco;
    }
}
