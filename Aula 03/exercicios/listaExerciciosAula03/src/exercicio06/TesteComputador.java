package exercicio06;

public class TesteComputador {
    public static void main(String[] args) {
        Computador dellGaming = new Computador("Intel I7", "16Gb RAM", "1T" );
        System.out.println(dellGaming);

        System.out.println(dellGaming.getStatusComputador());

        dellGaming.ligar();
        System.out.println(dellGaming.getStatusComputador());

        dellGaming.desligar();
        System.out.println(dellGaming.getStatusComputador());
    }
}
