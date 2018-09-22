/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author LugoMaroquin
 */
public class MiCola<T> {
	private static final int capacidadInicial=5;
	private MiColeccion2<T> coll =new MiColeccion2<T>(capacidadInicial);
	
	public void encolar(T elm)
	{
		//agrega el elemento al final de la coleccion
		coll.agregar(elm);
	}

	public T desencolar()
	{
		//retorna y elimina de la coleccion el primer elemento
		return coll.eliminar(0);
	}
}
