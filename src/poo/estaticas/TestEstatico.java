/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.estaticas;

/**
 *
 * @author CHRISHATAKE
 */
public class TestEstatico {
private int a=0;
public void unMetodo()
{
    System.out.println("Este es unMetodo()");
}

 public static void main(String[] args){
     //no tengo acceso ala variable a
     //System.out.println("a vale"+a);//error no compila
     //no tengo acceso al metodo unMetodo()
    // unMetodo();//error
     TestEstatico t=new TestEstatico();
     System.out.println("a vale: "+t.a);//accedo a la variable a
     t.unMetodo();//acceso al metodo
 }
}
