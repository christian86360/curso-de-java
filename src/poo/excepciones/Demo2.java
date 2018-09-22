/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.excepciones;

/**
 *
 * @author CHRISHATAKE
 */
public class Demo2 {
    public static void main(String[] args)
    {
        try
        {
            int i=Integer.parseInt("No es una cadena numerica....");
            
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Entre al catch");
        }
        finally
        {
            System.out.println("Esto sale siempre !");
        }
    }
    
}
