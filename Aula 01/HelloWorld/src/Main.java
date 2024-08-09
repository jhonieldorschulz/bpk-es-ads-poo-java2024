//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * Define uma classe pública chamada AplicacaoEntradaSaidaDados.
 * Esta é a estrutura principal do código.
 */
public class Main {

    /**
     * O método main é o ponto de entrada do programa.
     * É o método que é executado quando o programa é iniciado.
     * O parâmetro String[] args permite que argumentos sejam passados para o programa a partir da linha de comando,
     * mas neste exemplo, não estamos utilizando esses argumentos.
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}