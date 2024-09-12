import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Endereco enderecoEntrega;

    public Pedido(int numero, Cliente cliente, Endereco enderecoEntrega) {
        this.numero = numero;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido número: ").append(numero).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Endereço de Entrega: ").append(enderecoEntrega).append("\n");
        sb.append("Itens do Pedido:\n");
        for (ItemPedido item : itens) {
            sb.append(item).append("\n");
        }
        sb.append("Total: R$ ").append(calcularTotal()).append("\n");
        return sb.toString();
    }
}
