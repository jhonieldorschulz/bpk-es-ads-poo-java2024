package cadastroPessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Pessoa pai;
    private Pessoa mae;
    private Endereco enderecoAtual;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Endereco getEnderecoAtual() {
        return enderecoAtual;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }
}
