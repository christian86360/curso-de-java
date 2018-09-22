import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
	
		Scanner guardar=new Scanner(System.in);
		
		System.out.println("Ingresa un valor: ");
		int v=guardar.nextInt();
		//obtenemos el resuido de la dividir v por 2
     int resto=v%2;
     //para preguntar por igual utilizamos ==
     if(resto==0)
     {
    	 System.out.println(v+" Es par");
     }else
     {
    	 System.out.println(v+" Es impar");
     }

	}

}
