package ejercicios1;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos las variables necesarias
		String name, dir, num;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos las variables
		System.out.println("Dame tu nombre");
		name = sc.nextLine();
		System.out.println("Dame tu dirección");
		dir = sc.nextLine();
		System.out.println("Dame tu número de telefono");
		num = sc.nextLine();
		
		//Ahora mostramos los mensajes por pantalla
		System.out.println("Nombre: " + name);
		System.out.println("Dirección: " + dir);
		System.out.println("Número: " + num);
		
		sc.close();
	}

}
