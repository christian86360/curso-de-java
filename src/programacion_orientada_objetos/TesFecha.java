package programacion_orientada_objetos;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LugoMaroquin
 */
public class TesFecha {

    public static void main(String[] args) {

        //instaciamos un objeto de la clase fecha
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
        //imprimimos el dia
        System.out.println("Dia=" + f.getDia());
        System.out.println("Mes=" + f.getMes());
        System.out.println("Año=" + f.getAnio());
        //Imprimos la fexha
        System.out.println(f);

    }
}
