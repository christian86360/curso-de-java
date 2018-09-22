/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_orientada_objetos;

/**
 *
 * @author CHRISHATAKE
 */
public class Prog1 {
       private int x,y;
	public Prog1(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	public String operacion(){
		
		String b="";
		for(this.x=x; this.x <= this.y; this.x+=2){
             b += this.x + ",";			
			
		}
		return b;
	}
	public void imprimri(){
		System.out.print(operacion());
	}
	
	
	
	public static void main(String[] arg){
		
		Prog1 obj=new Prog1(1,100);
		obj.imprimri();
		
		
	}
}
