/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISHATAKE
 */
public class Cadena5a {
    public void main(String[] arg){
		//pbtengo el milisegundo actual
		long hi=System.currentTimeMillis();
		//iniciamos un StrinBuffer inicialmente vacio
		StringBuffer sb=new StringBuffer();
		
		//voy a concatenar n carecteres
		int n=100000;
		
		char c;
		for(int i=0;i<n;i++){
			//obtengo caracter entre'A' y 'Z'
			c=(char)('A'+i%('Z'-'A'+1));
			//concatenamos el caracter en el StringBuffer
			sb.append(c);
		}
		//obtenemos el milisegundo actual
		long hf=System.currentTimeMillis();
		//muestro  la cadena resultante
		System.out.println(sb.toString());
		//muestro la cantidad de milisegundos insumidos
		System.out.println((hf-hi)+"milisegundos");
		
		
	}
}
