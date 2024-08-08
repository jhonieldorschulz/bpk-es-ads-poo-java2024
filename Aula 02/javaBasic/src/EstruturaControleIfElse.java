import java.util.Scanner;

public class EstruturaControleIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if (idade >= 18){
            System.out.println("Maior de idade");
        }else {
            System.out.println("Menor de idade");
        }

        /**
         * A partir do Java 8, se tornou possível trabalhar com if ternário
         */
       String resposta = (idade >= 18 ? "Maior de idade" : "Menor de idade");
       System.out.println(resposta);


        /**
         * Verificando se o usuário  tem CNH
         */
        System.out.println("Tem carteira nacional de habilitação?(S/N):");
        String respostaCNH = scanner.nextLine();
        System.out.println("respostaCNH:" + respostaCNH.equals("S"));
        /**
         * Note que o método equals() retorna um valor booleano, sendo assim
         * se torna desnecessário atribuir se temCNH = true ou  temCNH = false
         * pois o próprio equals() já atribui essa resposta
         */
        boolean temCNH = respostaCNH.equals("S");//essa instrução elimina a necessidade de um if

        /**
         * A seguir será verificado se o usuário é maior de idade e se temCNH para
         * então dar permissão para condução de veículos de quatro rodas.
         * Para o operador lógico AND, no Java usa-se os caracteres &&
         */
        if((idade >= 18) && (temCNH)){
            System.out.println("Permissão de condução de veículos concedida.");
        }else{
            System.out.println("Permissão negada.");
        }

        /**
         * Mas essa verificação poderia ser invertida usando o operador lógico OR que
         * em Java usa-se os caracteres ||
         */
        if((idade < 18) || (!temCNH)){ // !temCNH é uma condição de negação -> NOT temCNH
            System.out.println("Permissão negada.");
        }else{
            System.out.println("Permissão de condução de veículos concedida.");
        }




    }
}
