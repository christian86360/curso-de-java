import java.util.Scanner;

public class Hola_mundo_Nombre2 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		//mensaje para el usuario
		System.out.println("Ingres nombre edad y altura");
		//leemos el nombre
		String nom=scanner.nextLine();
		//Leemos la edad
		int edad=scanner.nextInt();
		//leemos la altura
		double altura=scanner.nextDouble();
		//mostramos los datos por consola
		System.out.println("Nombre:"+ nom +" Edad:"+ edad +" Altura:" + edad);
		
		
	}

}
