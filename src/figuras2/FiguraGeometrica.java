/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras2;

/**
 *
 * @author LugoMaroquin
 */
public abstract class FiguraGeometrica {
	
	private String nombre;
	//metodo abtracto
	public abstract double area();
	
	public static double areaPromedio(FiguraGeometrica arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum +=arr[i].area();
		}
		return sum/arr.length;
	}
	
	//agregamos un contructor
	public FiguraGeometrica(String nom){
		nombre=nom;
	}
	//ahora en el metodo el toString muestra tanbien el nombre
	public String toString()
	{
		return nombre+"(area="+area()+")";
		
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	

}
