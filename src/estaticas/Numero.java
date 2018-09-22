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
public class Numero {
	private double valor;
	
	public Numero sumar (double a)
	{
		valor +=a;
		return this;
	}
	
	public String toString()
	{
		
		return Double.toString(valor);
				
				
	}
	
	public static double sumar(double a,double b)
	{
		return a+b;
	}

    void sumar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}