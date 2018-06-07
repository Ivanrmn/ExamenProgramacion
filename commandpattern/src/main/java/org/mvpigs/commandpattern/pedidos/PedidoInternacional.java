package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.Pedido;

import java.util.UUID;

public class PedidoInternacional implements Pedido, Comparable<UUID> {

    public PedidoInternacional(String mordor, int i) {
    }

    @Override
    public int peso() {
        return peso();
    }

    @Override
    public String destino() {
        if(destino() == "Mordor") {
            return null;
        }else {
            return destino();
        }
    }

    @Override
    public int compareTo(UUID id) {
        return 0;
    }
}
