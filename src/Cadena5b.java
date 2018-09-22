/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISHATAKE
 */
public class Cadena5b {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		long hi=System.currentTimeMillis();
		int n=100000;
		String s="";
		char c;
		for(int i=0;i<n;i++){
			c=(char)('A'+i%('Z'-'A'+1));
			//concatenamos el caracter c utilizando el operador +
			s= s+c;
			
		}
		long hf=System.currentTimeMillis();
		System.out.println(s);
		System.out.println((hf-hi)+"milesegundos");

	}
    
}
