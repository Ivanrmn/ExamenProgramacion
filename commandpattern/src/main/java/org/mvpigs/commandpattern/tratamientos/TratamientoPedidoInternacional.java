package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    PedidoInternacional pedidoInternacional;

    public TratamientoPedidoInternacional(PedidoInternacional pedidoInternacional){
        this.pedidoInternacional = pedidoInternacional;
    }

    @Override
    public boolean tratar() {
        if(pedidoInternacional.destino() == "Mordor"){
            return false;
        } else {
            return true;
        }
    }
}
