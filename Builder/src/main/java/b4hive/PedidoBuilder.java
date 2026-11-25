package b4hive;

public class PedidoBuilder {
    private final Pedido pedido;

    public PedidoBuilder() {
        pedido = new Pedido();
    }

    public Pedido build() {
        if (pedido.getNumero() == 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        if (pedido.getNomeCliente().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        if (pedido.getTamanho() == null || pedido.getTamanho().isEmpty()) {
            throw new IllegalArgumentException("Tamanho inválido");
        }
        return pedido;
    }

    public PedidoBuilder setNumero(int numero) {
        pedido.setNumero(numero);
        return this;
    }

    public PedidoBuilder setNomeCliente(String nomeCliente) {
        pedido.setNomeCliente(nomeCliente);
        return this;
    }

    public PedidoBuilder setTamanho(String tamanho) {
        pedido.setTamanho(tamanho);
        return this;
    }

    public PedidoBuilder setMassa(String massa) {
        pedido.setMassa(massa);
        return this;
    }

    public PedidoBuilder setMolho(String molho) {
        pedido.setMolho(molho);
        return this;
    }

    public PedidoBuilder setQueijo(boolean queijo) {
        pedido.setQueijo(queijo);
        return this;
    }

    public PedidoBuilder setIngredientePrincipal(String ingredientePrincipal) {
        pedido.setIngredientePrincipal(ingredientePrincipal);
        return this;
    }

    public PedidoBuilder setObservacao(String observacao) {
        pedido.setObservacao(observacao);
        return this;
    }

    public PedidoBuilder setParaEntrega(boolean paraEntrega) {
        pedido.setParaEntrega(paraEntrega);
        return this;
    }
}
