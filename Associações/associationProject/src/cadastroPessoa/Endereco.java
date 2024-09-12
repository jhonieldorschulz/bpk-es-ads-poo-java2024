package cadastroPessoa;

public class Endereco {
    private String logradouro;
    private String cep;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String logradouro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Endereco(String logradouro, String cep, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
