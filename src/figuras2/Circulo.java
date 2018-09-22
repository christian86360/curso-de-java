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
public class Circulo extends FiguraGeometrica {
	
	public int radio;

    /**
     *
     * @param r
     */
    public Circulo(int r) {
		super("Circulo");
		radio=r;
	}

	public double area() {
		// retorno PI por radio al cuadrado
		return Math.PI*Math.pow(radio, 2);
	}
}
