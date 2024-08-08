import java.util.Scanner;

public class EstruturaControleSwitchCase {
    public static void main(String[] args) {

        /**
         * A estrutura de controle SWITCH padrão do Java
         * herda da mesma sintaxe de C/C++
         */

        System.out.print("Informe uma opção de 1 a 7:");
        Scanner scanner = new Scanner(System.in);
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        /**
         * Mas a partir do Java 14 é possível abreviar essa estrutura
         * usando o Arrow Expression ->
         */
        switch (opcao){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção inválida");
        }
    }
}
