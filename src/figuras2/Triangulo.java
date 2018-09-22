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
public class Triangulo extends FiguraGeometrica {
   private double base;
   private double altura;
	public Triangulo(int b,int h) {
      super("Triangulo");
	 base=b;
	 altura=h;
	}
	public double area() {
		// TODO Auto-generated method stub
		return  base*altura/2;
	}

}
