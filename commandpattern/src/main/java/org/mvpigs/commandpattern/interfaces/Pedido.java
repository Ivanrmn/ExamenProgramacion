package org.mvpigs.commandpattern.interfaces;

/**
 * La interfaz Pedido implementa los metodos:
 * 
 * peso
 * @param
 * @return      el peso del pedido
 * 
 * destino
 * @return 		el destino del pedido
 */

public interface Pedido {
	
	public int peso();
	public String destino();

}
