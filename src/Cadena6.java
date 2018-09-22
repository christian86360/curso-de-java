
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHRISHATAKE
 */
public class Cadena6 {
    public static void main(String[] args) {
		Scanner g=new Scanner(System.in);
		System.out.println("Ingresa un valor entero:");
       int v=g.nextInt();
       System.out.println("Valor Ingresado: "+v);
       System.out.println("binario="+Integer.toBinaryString(v));
       System.out.println("octal="+Integer.toOctalString(v));
       System.out.println("hexadecimal="+Integer.toHexString(v));
       
       System.out.println("Ingresa una base numerica: ");
       int b=g.nextInt();
       
       String sBasesN=Integer.toString(v,b);
       System.out.println(v+" en base ("+b+")="+sBasesN);
	}

    
}
