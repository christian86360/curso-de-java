/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_orientada_objetos;

/**
 *
 * @author CHRISHATAKE
 */
public class FechaHora extends Misclases {
    private int hora;
    private int minuto;
    private int segundo;
    
    public FechaHora(String sFecha,int hora,int min,int seg){
        
        super(sFecha);
        this.hora=hora;
        this.minuto=min;
        this.segundo=seg;
    }

   // FechaHora(String string, int i, int i0, int i1) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    public String toString(){
        
        //invocamos al metodo toString
        return super.toString()+"("+hora+":"+minuto+":"+segundo+")";
    }
    
}
