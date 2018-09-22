/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author LugoMaroquin
 */
public class TestOrdenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definimos un array de Alumnos
		Alumno arr[] = {new Alumno("Juan",20,8.5),new Alumno("Pedro",18,5.3),new Alumno("Alberto",19,4.6)};
		Util.ordenar(arr);//lo ordeno
		muestaArray(arr);
		//definino,ordeno y muestro un array de String
		String[] arr2={"Pablo","Andres","Marcelo"};
		Util.ordenar(arr2);
		muestaArray(arr2);
		//defino , ordeno y muestro un array de Integer
		Integer[] arr3={new Integer(5),new Integer(3),new Integer(1)};
		Util.ordenar(arr3);
		muestaArray(arr3);
		//lo muestro ordenado
	
		
	}
	private static void muestaArray(Comparable arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

