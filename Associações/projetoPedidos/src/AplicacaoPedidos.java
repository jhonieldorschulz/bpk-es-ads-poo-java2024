public class AplicacaoPedidos {
    public static void main(String[] args) {
        // Criar produtos
        Produto produto1 = new Produto("Café", 5.50);
        Produto produto2 = new Produto("Pão", 3.00);
        Produto produto3 = new Produto("Leite", 6.00);

        // Criar endereço
        Endereco endereco = new Endereco("Rua A", "123", "São Paulo", "12345-678");

        // Criar cliente
        Cliente cliente = new Cliente("João", endereco);

        // Criar pedido
        Pedido pedido = new Pedido(1, cliente, endereco);

        // Adicionar itens ao pedido
        pedido.adicionarItem(new ItemPedido(produto1, 2));
        pedido.adicionarItem(new ItemPedido(produto2, 5));
        pedido.adicionarItem(new ItemPedido(produto3, 3));

        // Exibir detalhes do pedido
        System.out.println(pedido);
    }
}
