package org.mvpigs.commandpattern.interfaces;

/**
 * La interfaz TratamientoPedido implementa el metodo
 * tratar
 * @param
 * @return 	boolean
 * 			true si se cumplen las condiciones para tratar el pedido
 * 			false si no se cumplen las condiciones para tratar el pedido
 */

public interface TratamientoPedido {

	boolean tratar();
	
}
