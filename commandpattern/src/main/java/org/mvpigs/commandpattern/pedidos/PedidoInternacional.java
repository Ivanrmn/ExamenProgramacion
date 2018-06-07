package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido {
    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return null;
    }
}
