/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Scanner;

/**
 *
 * @author LugoMaroquin
 */
public class TestMisColeccion {

	public static void main(String[] args) {

		Scanner g=new Scanner(System.in);
		//crea una coleccion con capacidad inicial =5
		MiColeccion mc=new MiColeccion(5);
		//leo el primer nombre
		System.out.println("Ingresa  Nombre:");
		String nom=g.next();
		
		while(!nom.equals("Fin"))
		{
			//inserto siempre en la posicion 0
			mc.insertar(nom, 0);
			//leo el siguiente nombre
			nom=g.next();
		}
		String aux;
		//recorro la coleccion y tomo cada uno de sus elementos
		for(int i=0;i<mc.cantida();i++)
		{
			//el metodo obtener retorna un Object entonces
			//entonces tengo que castear a String
			aux=(String)mc.obtener(i);
			System.out.println(aux+" - "+aux.length()+" caracter");
		}
	}

}

