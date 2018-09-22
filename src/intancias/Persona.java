/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intancias;
import programacion_orientada_objetos.Fecha;

/**
 *
 * @author LugoMaroquin
 */
public class Persona {
	
	private String nombre;//atributos
	private String dni;//atributos
	private Fecha fechaNacimoiento;//atributos
	
	private int cont=0;//variable de estado
	public Persona(String nombre,String dni,Fecha fecNac)
	{
		this.nombre=nombre;
		this.dni=dni;
		this.fechaNacimoiento=fecNac;
	}
	public String toString()
	{
		cont++;
		return nombre +",DNI:"+dni+", nacido el:"+fechaNacimoiento+"("+cont+")";
	}
	

}
