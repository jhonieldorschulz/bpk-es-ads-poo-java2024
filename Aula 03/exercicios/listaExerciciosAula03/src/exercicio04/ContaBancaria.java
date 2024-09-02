package exercicio04;

/**
 * 4 - Crie uma classe ContaBancaria com atributos como
 * numeroConta e saldo.
 * Adicione métodos para depositar e sacar dinheiro.
 */
public class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        if (saldo != null) {
            this.saldo = saldo;
        }
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar(Double valor) {
        if (valor > saldo) {
            System.out.println("Você não tem saldo suficiente para sacar esse valor!");
        } else {
            saldo -= valor; // saldo = saldo - valor;
        }
    }

    public void depositar(Double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido");
        } else {
            saldo += valor;
        }
    }
}
