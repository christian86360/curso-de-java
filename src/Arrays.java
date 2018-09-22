
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
public class Arrays {
    public static void main(String[] args) {
		//definimos un array de 10 enteros
		int arr[]=new int[10];
		//el scanner para leer los datos por teclado
		Scanner g=new Scanner(System.in);
		//lep el primer valor
		System.out.println("Ingrese un valor (0=>fin):");
		int v=g.nextInt();
		int i=0;
		
		//mientras v sea distinto de cero AND i sea menor que 10
		while(v!=0 && i<0){
			//asignamos  v en arr[i] y luego incrementamos el valor
			System.out.println("ingrese el siguiente valor (0=>fin):");
			v=g.nextInt();
		}
		//recorro el array mostrando su contenido
		for(int j=0;j<i;j++)
		{
			System.out.println(arr[j]);
		}

    
    }
}
