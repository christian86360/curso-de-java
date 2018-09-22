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
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public String toString() {
		//sobre escribimos el metodo toString(Lo aremos de objetos)
        //retornamos una cadena tal como queramos que se vea la fecha
        return dia + "/" + mes + "/" + anio;
    }

    public int getDia() {
        //retornamos el valor dea
        return dia;
    }

    public void setDia(int dia) {
        //asignamos el valor de parametro ala variable dia
        this.dia = dia;

    }

    public int getMes() {
        return mes;

    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
