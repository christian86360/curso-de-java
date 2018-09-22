/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.colecciones;

import java.util.Scanner;

/**
 *
 * @author CHRISHATAKE
 */
public class TestMiColecciones {
    
    public static void main(String[] args)
    {
        Scanner g=new Scanner(System.in);
        //creo una coleccion con capacidad inicial =5
        MiColeccion mc=new MiColeccion(5);
        //leo el primer nombre
        System.out.println("Ingrese Nombre:");
        String nom=g.next();
        
        while(!nom.equals("Fin"))
        {
            //inserto simpre en la pocicion 0
            mc.insertar(nom, 0);
            //leo el siguiente nombre
            nom=g.next();
        }
        String aux;
        //recorro la coleccion y tomo cada uno de sus elementos
        for(int i=0; i<mc.cantidad();i++)
        {
            //el metodo obtener retorno unObject entonces
            //entonces tengo que castear a String
            aux=(String)mc.obtener(i);
            System.out.println(aux+"-"+aux.length()+"caracteres");
        }
    }
    
}
