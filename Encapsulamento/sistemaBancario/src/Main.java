//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("123", 1000.0);
        Conta conta2 = new Conta("456", 500.0);

        TransacaoService transacaoService = new TransacaoService();
        transacaoService.processarTransacao(conta1, conta2, 200.0);

        System.out.println("Saldo conta " + conta1.getNumero() + " : " + conta1.getSaldo());
        System.out.println("Saldo conta " + conta2.getNumero() + " : " + conta2.getSaldo());
    }
}