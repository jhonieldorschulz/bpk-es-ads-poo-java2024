public class TransacaoService {
    public void processarTransacao(Conta contaOrigem, Conta contaDestino, double valor) {
        validarConta(contaOrigem);
        validarConta(contaDestino);
        verificarSaldo(contaOrigem, valor);
        realizarTransferencia(contaOrigem, contaDestino, valor);
        registrarTransacao(contaOrigem, contaDestino, valor);
    }

    private void validarConta(Conta conta) {
        if(conta == null) {
            throw new IllegalArgumentException("Conta inválida");
        }
    }

    private void verificarSaldo(Conta conta, double valor) {
        if(conta.getSaldo() < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
    }

    private void realizarTransferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        contaOrigem.debitar(valor);
        contaDestino.creditar(valor);
    }

    private void registrarTransacao(Conta contaOrigem, Conta contaDestino, double valor) {
        // Lógica para registrar a transação (log, persistência, etc.)
        System.out.println("Transação registrada: " + valor + " de "
                + contaOrigem.getNumero() + " para " + contaDestino.getNumero());
    }

}
