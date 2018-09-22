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
public class TestEstatico {
  
	private int a=0;
	
	public void unMetodo(){
		System.out.println("este es unMetodo()");
	}
	public static void main(String[] args)
	{/*
		//no tengo acceso ala variable a
		System.out.println("a vale "+a);//eror no copila
		//no tenemos aceso al metodo unMetodo()
		unMetodo();
		*/
		TestEstatico t=new TestEstatico();
		System.out.println("a vale:"+t.a);//acceso ala variable a
		t.unMetodo();//acceso al metodo
	}
}
