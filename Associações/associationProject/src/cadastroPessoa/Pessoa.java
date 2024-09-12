package cadastroPessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private Integer idade;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<>();
        this.incluirEndereco(endereco);
    }

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

    public void incluirEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }

    public void removerEndereco(Endereco endereco){
        this.enderecos.remove(endereco);
    }


    @Override
    public String toString() {
        if(this.enderecos.isEmpty()){
            return """
                Nome: %s
                Idade: %s
                """.formatted(nome, idade);
        }else {

            String dadosPessoais = "Nome: " + nome + "\n" +
                    "Idade: " + idade + "\n" +
                    "Endereços: " + enderecos;



            return dadosPessoais;
        }

    }
}
