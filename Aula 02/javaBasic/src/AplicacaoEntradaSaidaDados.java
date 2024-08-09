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

        String nome = input("Digite o seu nome: ");
        int idade = inputInt("Digite sua idade: ");

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


    /**
     *
     * @param msgDialog
     * @return
     * Método extraído da refatoração para reaproveitamento no processamento de entrada de dados
     * informados pelo usuário no terminal.
     *
     *
     */
    public static String input(String msgDialog){
        Scanner scanner = new Scanner(System.in);
        String strPrint = msgDialog.contains(":")? msgDialog: msgDialog + ":";
        System.out.print(strPrint);
        return scanner.nextLine();
    }

    /**
     * Método para invocar o método input e retornar a informação digitada pelo usuário já
     * convertida para String
     * @param msgDialog
     * @return
     */
    public static int inputInt(String msgDialog){
        String strInput = input(msgDialog);
        return Integer.parseInt(strInput);
    }

}