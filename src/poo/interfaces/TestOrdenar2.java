/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.interfaces;

/**
 *
 * @author CHRISHATAKE
 */
public class TestOrdenar2 {
    public static void main(String[] args){
        //definimos un array de alumnos
        Alumno arr[]={new Alumno("Juan",20,8.5)
                      ,new Alumno("Pedro",18,5.3)
                     , new Alumno("Alberto",19,4.6)        
                      };
        Util.ordenar(arr);//lo ordena
        muestraArray(arr);
        //defino ordeno y muestro  un array de string
        String[] arr2={"Pablo","Andres","Marcelo"};
        Util.ordenar(arr2);
        muestraArray(arr2);
        
        //defino y ordeno y muestro un array de integers
        Integer[] arr3={new Integer(5)
                       ,new Integer(3)
                      ,new Integer(1)};
        Util.ordenar(arr3);
        muestraArray(arr3);
    }

    private static void muestraArray(Comparable[] arr) {
       for(int i=0; i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
    }

    
        
  
    
    
}

