package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class Oficina implements Procesador {
    @Override
    public boolean procesa(TratamientoPedido pedido) {
        return false;
    }
}
