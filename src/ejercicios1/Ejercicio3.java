package ejercicios1;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creo las variables necesarias
		int añoActual=0;
		int añoNacimiento=0;
		int edad=0;
		Scanner sc = new Scanner (System.in);
		
		// Pido año actual y lo recojo
		System.out.println("Dime el año actual");
		añoActual = sc.nextInt ();
		
		// Pido año de nacimiento y lo recojo
		System.out.println("Dime tu año de nacimiento");
		añoNacimiento= sc.nextInt ();
		
		// Calculamos edad y lo mostramos por pantalla
		edad = añoActual - añoNacimiento;
		System.out.println("Tu edad es " + edad);
		
		sc.close();
	}

}
