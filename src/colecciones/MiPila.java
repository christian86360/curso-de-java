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
public class MiPila<T> {

	//la capacidad inicial la hardcodeamos en esta constante
	private static final int capacidadInicial=5;
	//instaciamos la coleccion que mantendra los datos de la pila
	private MiColeccion2<T> coll=new MiColeccion2<T>(capacidadInicial);
	//el metodo apilar recibe un parametro de tipo t
	public void apilar(T elm)
	{
		coll.insertar(elm, 0);
		
	}
	//el metodo desapilar retorna un elemento de tipo T
	public T desapilar()
	{
		return coll.eliminar(0);
	}
	
}
