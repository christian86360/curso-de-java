
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
public class TesFecha3 {

    private int dia;
    private int mes;
    private int ano;

    public TesFecha3(int d, int m, int a) {
        dia = d;
        mes = m;
        ano = a;

    }

    public static void main(String[] args) {

        Scanner g = new Scanner(System.in);
        //el usuario ingrese los datos de la fecha
        System.out.println("Ingresa una fecha (dia,mes y año):");
        int d = g.nextInt();
        int m = g.nextInt();
        int a = g.nextInt();

        TesFecha3 f = new TesFecha3(d, m, a);
        TesFecha3 f2 = new TesFecha3(23, 9, 15);

        System.out.println("Fecha 1 = " + f);
        System.out.println("Fecha 2=" + f2);

        if (f.equals(f2)) {
            System.out.println("Son iguales!");
        } else {
            System.out.println("Son distintas");
        }

    }

}
