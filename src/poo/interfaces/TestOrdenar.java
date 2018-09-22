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
public class TestOrdenar {

    
  public static void main(String[] args){
        //definimos un array de alumnos
        Alumno arr[]={new Alumno("Juan",20,8.5)
                      ,new Alumno("Pedro",18,5.3)
                     , new Alumno("Alberto",19,4.6)        
                      };
        Util.ordenar(arr);//lo ordena
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
        }
    
}
