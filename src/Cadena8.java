
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
public class Cadena8 {
    public static void main(String[] args) {
		
		Scanner g=new Scanner(System.in);
		System.out.println("Ingresa una cadena");
		String  s1=g.next();
		
		System.out.println("Ingresa otara cadena");
		
		String s2=g.next();
		//muestra la cadena para mostrar lo que contiene
		System.out.println("s1=[" +  s1 +"]");
		System.out.println("s2=[" +  s2 +"]");
		
		//esto esta mal
		/*if(s1 == s2)
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("Son distintas");
		}*/
		//Corecto conparacion de cadenas
		if(s1.equals(s2) )
		{
			System.out.println("Son iguales");
		}
		else
		{
			System.out.println("Son distintas");
		}

	}
    
}
