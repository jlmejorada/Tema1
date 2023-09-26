package ejercicios1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Lo primero es crear las variables necesarias
		String nombre, edad;
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el nombre y la edad del usuario
		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		System.out.println("Dime tu edad");
		edad = sc.nextLine();
		
		//Por último, mostramos el mensaje
		System.out.println("Hola " + nombre + ", tienes " + edad  + " años, ¡qué mayor eres!");
		
		sc.close();
	}

}
