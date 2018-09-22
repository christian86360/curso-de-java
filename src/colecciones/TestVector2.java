/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Collection;

/**
 *
 * @author LugoMaroquin
 */
public class TestVector2 {

	public static void main(String[] args) {
		//el metodo obtenerLista retorna una Collection
		Collection<String> coll=UNombres.obtenerLista();
		//itero la coleccion de nombres y muestro cada elemento
		for(String nom:coll)
		{
			System.out.println(nom);
		}
		
		

	}

}

