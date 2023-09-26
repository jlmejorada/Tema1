package ejercicios2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/* Creamos la variable edad, scanner y un string que pasará el
		 * mensaje según si es mayor de edad o no */
		int edad;
		Scanner sc = new Scanner(System.in);
		String mayor;
		
		//Pedimos la edad
		System.out.println("Dinos tu edad");
		edad = sc.nextInt();
		
		//Comparamos al edad para saber si es true o false y saber que mensaje pasar
		mayor = (edad>17) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayor);
		
		sc.close();
	}

}
