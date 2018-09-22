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
public class FechaDetallada extends Fecha {

    private static String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Junio" + "Julio", "Agosto", "Setiembre", "Octubre", "Nobiembre", "Diciembre"};

    public String ToString() {
        return getDia() + "de" + meses[getMes() - 1] + "de" + getAnio();

    }

}
