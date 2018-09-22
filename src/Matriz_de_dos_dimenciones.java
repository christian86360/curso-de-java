
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
public class Matriz_de_dos_dimenciones {
    public static void main(String[] args) {
	
		Scanner g=new Scanner(System.in);
		
		System.out.println("Ingresa cantidad de filas:");
		int f=g.nextInt();
		
		System.out.println("Ingresa cantidad de columnas:");
		int m=g.nextInt();
		
		//creamos una matriz de n filas x m columnas
		int mat[][]=new int[f][m];
		
		int nro;
		for(int i=0;i<f;i++)
		{
		for(int j=0;j<m;j++)
		{
			//generamos un numero aleatoriamente
			nro=(int)(Math.random()*100);
			//asignamos el numero en la matriz
			mat[i][j]=nro;
		}

	}
		for(int i=0;i<f;i++)
		{
			for(int j=0;j<m;j++)
			{
				//imprimimos la celda de la matriz
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
    
}
