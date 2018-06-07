package org.mvpigs.commandpattern.tratamientos;

import org.mvpigs.commandpattern.interfaces.TratamientoPedido;
import org.mvpigs.commandpattern.pedidos.PedidoInternacional;
import org.mvpigs.commandpattern.pedidos.PedidoNacional;

public class TratamientoPedidoMultiple implements TratamientoPedido {

    private int numBultos;

    public int getNumBultos() {
        return numBultos;
    }

    public void setNumBultos(int numBultos) {
        this.numBultos = numBultos;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    private int pesoTotal;

    PedidoInternacional pedidoInternacional;
    PedidoNacional pedidoNacional;

    public TratamientoPedidoMultiple(PedidoInternacional pedidoInternacional,
                                     PedidoNacional pedidoNacional){
        this.pedidoInternacional = pedidoInternacional;
        this.pedidoNacional = pedidoNacional;
    }

    @Override
    public boolean tratar() {
        if(pedidoInternacional.peso() > 0 || pedidoNacional.peso() > 0){
            return true;
        }else {
            return false;
        }
    }

    public void calcularTotalBultos(){

    }

    public void calcularPesoTotal(){
        int pesoTotal;
        pesoTotal = pedidoNacional.peso() + pedidoInternacional.peso();
    }
}
