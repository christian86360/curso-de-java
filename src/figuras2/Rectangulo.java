/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras2;

/**
 *
 * @author LugoMaroquin
 */
public class Rectangulo extends FiguraGeometrica {
	
	private double base;
	private double altura;
	

	public Rectangulo(double b,double h) {
	super("Rectangulo");
		// TODO Auto-generated constructor stub
	}
	
	public double area()
	{
		return base*altura;
	}

}

