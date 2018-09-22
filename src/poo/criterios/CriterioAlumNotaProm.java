/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.criterios;
import poo.interfaces.Alumno;
/**
 *
 * @author CHRISHATAKE
 */
public class CriterioAlumNotaProm extends Criterio<Alumno>
{

    CriterioAlumNotaProm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int CriterioAlumnoNotaProm(Alumno a,Alumno b)
    {
        double diff =a.getNotaPromedio()-b.getNotaPromedio();
        return diff>0 ? 1: diff <0 ? -1 : 0;
    }

    @Override
    public int comparar(Alumno a, Alumno b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
