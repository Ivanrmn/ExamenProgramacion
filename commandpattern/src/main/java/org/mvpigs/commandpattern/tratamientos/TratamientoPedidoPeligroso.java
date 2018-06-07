package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoPeligrosoOrden;

public class TratamientoPedidoPeligroso implements TratamientoPedido {

    PedidoPeligrosoOrden pedidoPeligrosoOrden;

    public TratamientoPedidoPeligroso(PedidoPeligrosoOrden pedidoPeligrosoOrden,
                                      PedidoPeligroso pedidoPeligroso){
        this.pedidoPeligrosoOrden = pedidoPeligrosoOrden;
    }

    public TratamientoPedidoPeligroso(PedidoPeligroso pedidoConPeligro) {
    }


    @Override
    public boolean tratar() {
        if(pedidoPeligrosoOrden.instrucciones() == "no ponerselo en el dedo"){
            return false;
        } else {
            return true;
        }
    }
}
