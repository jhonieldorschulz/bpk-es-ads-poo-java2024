package exercicio04;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 1000.0);
//         conta1.numeroConta = 321;
//        conta1.saldo = 500;

        System.out.println(conta1.getNumeroConta());
        System.out.println(conta1.getSaldo());
//        System.out.println("Numero da Conta: "  + conta1.getNumeroConta());
//        conta1.sacar(200.0);

    }
}
