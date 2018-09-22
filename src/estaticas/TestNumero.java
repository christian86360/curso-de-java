/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estaticas;

/**
 *
 * @author LugoMaroquin
 */
public class TestNumero {
	
	
	public static void main(String [] args)
	{
		//sumamos utilizando el metodo estatico
		double d=Numero.sumar(2, 3);
		System.out.println(d);
		
		//definimos un numero con el valor 5 y luego
		//sumamos 4 con el metodo sumar de instacia
		Numero n1 = new  Numero();
		n1.sumar(4);
		System.out.println(n1);
		//sumamos y concatenamos invocaciones al metodo sumar
		//n1.sumar(4).sumar(6).sumar(8).sumar(1);
      System.out.println(n1);
	}

}
