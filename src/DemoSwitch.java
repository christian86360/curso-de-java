import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
	
		Scanner g=new Scanner(System.in);
		System.out.println("Ingrese un dia de la semana (numero):");
        int v=g.nextInt();
         String dias;
    switch(v)
    {
    case 1:
    	dias="Lunes";
    	break;
    case 2:
    	dias="Martes";
    	break;
    case 3:
        dias="Miercoles";
        break;
    case 4:
        dias="Jueves";
        break;
    case 5:
    	 dias="Viernes";
    	 break;
    case 6:
    	 dias="Sabado";
    	 break;
    case 7:
    	dias="Domingo";
    	break;
    	default:
    		dias= "Dia incorrecto....el valor debe ser entre 1y7 .";
    	
       }
    System.out.println(dias);
	}

}
