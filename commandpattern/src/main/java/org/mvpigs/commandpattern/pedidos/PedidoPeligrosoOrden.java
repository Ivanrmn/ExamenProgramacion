package org.mvpigs.commandpattern.pedidos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso {
    public PedidoPeligrosoOrden(String prueba1, String prueba2) {
    }

    @Override
    public String instrucciones() {
        return null;
    }

    @Override
    public int peso() {
        return 0;
    }

    @Override
    public String destino() {
        return null;
    }


}
