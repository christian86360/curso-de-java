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
public class Circulo extends FigurasGeometricas {
	
	private int radio;
	public Circulo(int r){
		radio=r;
	}

	@Override
	public double area() {
		// retorno PI por radio al cuadrado
		return Math.PI*Math.pow(radio, 2);
	}
	
	

}
