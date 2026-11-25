package b4hive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PedidoBuilderTest {

    @Test
    void deveRetornarExcecaoParaPedidoSemNumero() {
        PedidoBuilder builder = new PedidoBuilder();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> builder
                        .setNomeCliente("Ana")
                        .setTamanho("Grande")
                        .build());

        assertEquals("Número inválido", exception.getMessage());
    }

    @Test
    void deveRetornarExcecaoParaPedidoSemNomeDoCliente() {
        PedidoBuilder builder = new PedidoBuilder();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> builder
                        .setNumero(10)
                        .setTamanho("Grande")
                        .build());

        assertEquals("Nome do cliente inválido", exception.getMessage());
    }

    @Test
    void deveRetornarExcecaoParaPedidoSemTamanho() {
        PedidoBuilder builder = new PedidoBuilder();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> builder
                        .setNumero(10)
                        .setNomeCliente("Ana")
                        .build());

        assertEquals("Tamanho inválido", exception.getMessage());
    }

    @Test
    void deveRetornarPedidoValido() {
        Pedido pedido = new PedidoBuilder()
                .setNumero(10)
                .setNomeCliente("Ana")
                .setTamanho("Grande")
                .setMassa("Fina")
                .setMolho("Tomate")
                .setQueijo(true)
                .setIngredientePrincipal("Calabresa")
                .setObservacao("Bem passada")
                .setParaEntrega(true)
                .build();

        assertEquals(10, pedido.getNumero());
        assertEquals("Ana", pedido.getNomeCliente());
        assertEquals("Grande", pedido.getTamanho());
        assertEquals("Calabresa", pedido.getIngredientePrincipal());
        assertTrue(pedido.isQueijo());
        assertTrue(pedido.isParaEntrega());
    }
}
