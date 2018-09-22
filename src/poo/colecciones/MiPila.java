/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.colecciones;

/**
 *
 * @author CHRISHATAKE
 */
public class MiPila<T> {
    //la capacidad inicial la hardcodeamos en esta constante
    private static final int capacidaInicial=5;
    //instacio la coleccion que mantendra los datos de la pila
    private MiColeccion<T> coll=new MiColeccion<T>(capacidaInicial);
    //el metodo apilar recibe un parametro de tipo T
    
    public void apilar(T elm)
    {
        coll.insertar(elm, 0);
    }       
    //el metodo sesapilar retorna un elemento de tipo T
    public T desapilar()
    {
        return coll.eliminar(0);
    }
    
}
