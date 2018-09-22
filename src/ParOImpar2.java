import java.util.Scanner;

public class ParOImpar2 {

	public static void main(String[] args) {
		
		Scanner g=new Scanner(System.in);
		
		System.out.println("Ingrese un valor: ");
		int v=g.nextInt();
		//obtenemos el resto de dividir v por 2
		int resto=v % 2;
		
		//utilizamos un if in-line
		String mssg=(resto == 0) ?  "es Par": "es Impar";
		
      //muestro resultado
		System.out.println(v+" "+mssg);
	}

}
