import java.util.Scanner;

public class Que_Dia_Es {

	public static void main(String[] args) {
	
		Scanner guardar=new Scanner(System.in);
		
		System.out.println("Ingrese su edad: ");
		int eda=guardar.nextInt();
		if(eda >=18)
		{
			System.out.println("Eres mayor de edad");
		}else
		{
			System.out.print("Eres menor de edad jajajajajaj");
		}

	}

}
