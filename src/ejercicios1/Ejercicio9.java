package ejercicios1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Empezamos creando las variables necesarias
		float pesetas, euros;
		Scanner sc = new Scanner(System.in);
		
		//Pasamos un mensaje pidiendo un número de pesetas
		System.out.println("Dame un valor en pesetas ");
		pesetas = sc.nextFloat();
		
		//Calculamos las pesetas en euros
		euros = pesetas/166;
		
		//Y por últimos lo pasamos por pantalla
		System.out.println(pesetas + " pesetas son: " + euros + "€");
		
		sc.close();
	}

}
