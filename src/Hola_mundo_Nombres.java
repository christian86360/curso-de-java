import java.util.Scanner;
public class Hola_mundo_Nombres {

	public static void main(String[] args) {
		//esta clase permite leer datos por teclado
		Scanner scanner=new Scanner(System.in);
		
		//mensaje para el usuario
		System.out.println("Ingrese su nombre:");
		
		//leemos un valor entero por teclado
		String nom=scanner.nextLine();
		
		//mostramos un mensaje y luego el valor leido
		System.out.println("Hola mundo: " + nom);

	}

}
