package cadastroPessoa;

public class CadastroPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bobby Sponja", 40,
                new Endereco("Biopark", "Toledo", "PR"));
        System.out.println(pessoa);

        Endereco endereco = new Endereco("Ana Paula", "Marechal", "PR");
        pessoa.incluirEndereco(endereco);
        System.out.println(pessoa);

        pessoa.removerEndereco(endereco);
        System.out.println(pessoa);
    }
}
