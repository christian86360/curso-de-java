/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.colecciones;

import java.util.Collection;
import poo.criterios.UNombre;

/**
 *
 * @author CHRISHATAKE
 */
public class TestVector {
    public static void main(String[] args){
        //el metodo obtenerLista retorna una Collection
        Collection<String> coll=UNombre.obtenerLista();
        
        //itero la collection de nombres y muestro cada elemento
        for(String nom: coll)
        {
            System.out.println(nom);
        }
    }
    
}
