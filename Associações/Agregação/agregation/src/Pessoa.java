public class Pessoa {
    private String nome;
    private CarteiraDeMotorista carteira;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setCarteira(CarteiraDeMotorista carteira) {
        this.carteira = carteira;
    }

    public CarteiraDeMotorista getCarteira() {
        return carteira;
    }

    public String getNome() {
        return nome;
    }
}
