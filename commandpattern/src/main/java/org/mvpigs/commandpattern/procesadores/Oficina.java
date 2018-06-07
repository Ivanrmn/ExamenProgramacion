package org.mvpigs.commandpattern.procesadores;

import org.mvpigs.commandpattern.interfaces.Procesador;
import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.tratamientos.TratamientoPedidoInternacional;
import org.mvpigs.commandpattern.tratamientos.TratamientoPedidoMultiple;
import org.mvpigs.commandpattern.tratamientos.TratamientoPedidoPeligroso;

public class Oficina implements Procesador {
    TratamientoPedidoInternacional tratamientoPedidoInternacional;
    TratamientoPedidoMultiple tratamientoPedidoMultiple;
    TratamientoPedidoPeligroso tratamientoPedidoPeligroso;
    Status status;

    public Oficina(TratamientoPedidoInternacional tratamientoPedidoInternacional,
                   TratamientoPedidoMultiple tratamientoPedidoMultiple,
                   TratamientoPedidoPeligroso tratamientoPedidoPeligroso,
                   Status status){
        this.tratamientoPedidoInternacional = tratamientoPedidoInternacional;
        this.tratamientoPedidoMultiple = tratamientoPedidoMultiple;
        this.tratamientoPedidoPeligroso = tratamientoPedidoPeligroso;
        this.status = status;
    }

    @Override
    public boolean procesa(TratamientoPedido pedido) {
        if(tratamientoPedidoPeligroso.tratar() == true) {
            return true;
        }else if (tratamientoPedidoPeligroso.tratar() == false){
            return false;
        }

        if(tratamientoPedidoInternacional.tratar() == true) {
            return true;
        }else if (tratamientoPedidoInternacional.tratar() == false){
            return false;
        }

        if(tratamientoPedidoMultiple.tratar() == true) {
            return true;
        }else {
            return false;

        }
    }


    public String printarStatus(boolean procesado) {
        if(procesado == true){
            return String.valueOf(status.ACEPTADO);
        } else {
            return String.valueOf(status.RECHAZADO);
        }
    }
}
