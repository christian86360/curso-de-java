/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author LugoMaroquin
 */
public class Triangulo extends FigurasGeometricas { 
	
	private double base;
	private double altura;
	
	public Triangulo(int b,int h) {
		// TODO Auto-generated constructor stub
		base=b;
		altura=h;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return  base*altura/2;
	}

}

