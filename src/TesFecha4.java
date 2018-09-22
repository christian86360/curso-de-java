
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LugoMaroquin
 */
public class TesFecha4
{
     private int dia;
     private int mes;
     private int anio;
     //retornamos la fecha expresada en dias
     private int fechaToDias()
     {
    	 return anio*360+mes*30+dia;
     }
     //asignamos la fecha expresada en dias alos atributos
     private void diasToFecha(int i)
     {
    	 //dividimos por 360 y obtenemos el anio
    	 anio=(int)i/360;
    	 //el resto de la divicion anterior 
    	 //podemos obtener el mes y el dia
    	 int resto= i%360;
    	 //el mes es resto dividido 30
    	 mes =(int)resto/30;
    	 //el resto de la divicion son dias
    	 dia=resto % 30;
    	 //ahuste por si dia quedo en cero
    	 if(dia == 0)
    	 {
    		 dia=30;
    		 mes--;
    	 }
    	 //ajuste sin mes quedo en cero
    	 if(mes == 0)
    	 {
    		 mes=12;
    		 anio--;
    	 }
     }
	public void addDias(int d)
	{
		//convierto la fecha a dias y le sumo d
		int sum=fechaToDias()+d;
		//la fecha resultante sum la separo en dias , mes y anio
		diasToFecha(sum);
	}
	
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		//el usuario ingrese los datos de la fecha
		System.out.println("Ingresa fecha(dd/mm/aaaa):");
		//leeomos la fecha (cadena de caracteres ingresadas)
		String sFecha=a.nextLine();
		//creamos un objeto
		
		TesFecha4 f=new TesFecha4();
		//lo muestro
		System.out.println("La fecha ingresada es:"+f);
		//el usuario ingresa una cantidad de dias a sumar
	System.out.println("Ingresa dias a sumar(Pueden cer negativos):");
	int diasSum=a.nextInt();
	//muestor la nueva fecha (con los dias sumadoe)
	System.out.println("sumado"+diasSum+"dias ,queda:"+f);
		
		
	
	

	}

}
