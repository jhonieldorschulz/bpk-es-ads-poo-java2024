package exercicio06;

/**
 * 6 - Crie uma classe Computador com atributos como
 * processador, memoriaRAM, e armazenamento.
 * Adicione métodos para ligar e desligar o computador.
 */
public class Computador {

    private String processador;

    private String memoriaRAM;

    private String armazenamento;

    private Boolean ligado;


    public Computador(String processador, String memoriaRAM, String armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void ligar() {
        System.out.println("Ligando computador");
        ligado = true;
    }

    public void desligar() {
        System.out.println("Desligando computador");
        ligado = false;
    }

    public String getStatusComputador() {
        return ligado ? "Computador está ligado" : "Computador está desligado";
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRAM='" + memoriaRAM + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                '}';
    }
}
