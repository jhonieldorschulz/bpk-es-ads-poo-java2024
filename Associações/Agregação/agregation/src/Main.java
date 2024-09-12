//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos Silva");
        CarteiraDeMotorista carteira = new CarteiraDeMotorista("123456789", "12/2028");

        pessoa.setCarteira(carteira);

        System.out.println("Pessoa: " + pessoa.getNome());
        System.out.println("Carteira de Motorista: " + pessoa.getCarteira().getNumero());
        System.out.println("Validade: " + pessoa.getCarteira().getValidade());
    }
}