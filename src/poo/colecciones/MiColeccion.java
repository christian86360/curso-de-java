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
public class MiColeccion<T> {
    private Object datos[]=null;
    private int len=0;
    
    //el contructor se especifica la capacidad inicial
    public MiColeccion(int capacidadInicial)
    {
        datos=new Object[capacidadInicial];
    }
    
    public Object obtener(int i)
    {
        return datos[i];
    }
    //iniciamos cuantos elementos de la coleccion
    public int cantidad()
    {
        return len;
    }
    
    public void insertar(T elm,int i)
    {
        if(len==datos.length)
        {
            Object aux[]=datos;
            datos=new Object[datos.length*2];
            for(int j=0; j<len; j++)
            {
                datos[j+1]=datos[j];
            }
            aux=null;
        }
        for(int j=len-1; j>=i; j--)
        {
            datos[j+1]=datos[j];
        }
        datos[i]=elm;
        len++;
    }
    
    public int buscar(T elm)
    {
        int i=0;
        //mientras no pase del tope y mientras no encuentre.....
        for(;i<len && !datos[i].equals(elm);i++);
        
            //si no pasa entonces encontre si no......no encontre
            return i<len ? i:-1;
        
    }
    
    public void agregar(T elm)
    {
        insertar (elm,len);
    }
    //eliminamos un elemento desplazando los demas hacia arriba
    public T eliminar(int i)
    {
        Object aux=datos[i];
        for(int j=i; j<len-1; j++)
        {
            datos[j]=datos[j+1];
        }
        len--;
        return (T)aux;
    }
    
}
