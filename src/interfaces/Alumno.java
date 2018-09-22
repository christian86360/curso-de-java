/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author LugoMaroquin
 */
public class Alumno implements Comparable<Alumno>{
	
	private String nombre;
	private int edad;
	private double notaPromedio;
	//constructor
	public Alumno(String nom,int e,double np)
	{
		this.nombre=nom;
		this.edad=e;
		this.notaPromedio=np;
	}
//metodo heredado de la interface Comparable
	@Override
	public int compareTo(Alumno otroAlumno) {
     		
		return this.edad - otroAlumno.edad;
	}
	public String toString()
	{
		return nombre+" , "+edad+" , "+notaPromedio;
	}
	

}

