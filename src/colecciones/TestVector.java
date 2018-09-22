/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Vector;

/**
 *
 * @author LugoMaroquin
 */
public class TestVector {

	public static void main(String[] args){
		
		//instacio un Vector especializado en String
		Vector<String> v=new Vector<String>();
		
		//le asigno algunos valores
		v.add("Pablo");
		v.add("Juan");
		v.add("Carlos");
		
		String aux;
		//el metodo size indica cuantos elementos contiene el vector
		for(int i=0; i<v.size();i++){
			//el metodo get retorna el i-esimo elemento
			aux=v.get(i);
			System.out.println(aux);
		}
		
		
	}
}
