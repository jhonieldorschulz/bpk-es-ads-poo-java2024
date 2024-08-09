import java.util.Scanner;


public class AplicacaoEntradaSaidaDados {
    /**
     * O método main é o ponto de entrada do programa.
     * É o método que é executado quando o programa é iniciado.
     * String[] args permite que argumentos sejam passados para o programa a partir
     * da linha de comando.
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Aqui, um objeto Scanner é criado para capturar a
         * entrada do usuário a partir do console (System.in).
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * System.out.print exibe a mensagem "Digite o seu nome:" no console, sem pular para
         * a próxima linha.
         * scanner.nextLine() lê a linha digitada pelo usuário e a armazena na variável nome.
         */
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        /**
         * System.out.print exibe a mensagem "Digite sua idade:" no console.
         * scanner.nextInt() lê um número inteiro digitado pelo usuário e o armazena na variável idade.
         */
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        /**
         * A variável userInfo é uma string formatada, usando uma sintaxe de bloco de texto (text block) do Java,
         * introduzida a partir do Java 13.
         * O método formatted() substitui os placeholders %s pelos valores das variáveis nome e idade.
         * System.out.println(userInfo); exibe a string formatada no console, mostrando o nome e a idade do usuário.
         */
        String userInfo = """
                 Nome: %s
                 Idade: %s
                """.formatted(nome, idade);
        System.out.println(userInfo);




    }
}