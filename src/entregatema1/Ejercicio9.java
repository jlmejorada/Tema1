package entregatema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/* Creamos las variables donde se van a guardar los dos números a comparar y 
		un string que mostraremos por pantalla con la respuesta*/
		float num1, num2;
		String respuesta;
		
		// Creamos una variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos y recogemos el primer numero
		System.out.println("Dame un número");
		num1 = sc.nextFloat();
		
		//Pedimos y recogemos el primer numero
		System.out.println("Dame otro número");
		num2 = sc.nextFloat();
		
		//Comparamos ambos números
		respuesta = (num1==num2) ? "Los números son iguales" : "Los números son diferentes" ;
		
		//Y mostramos la respuesta por pantalla
		System.out.println(respuesta);
		
		//Cerramos el escaner
		sc.close();
		

	}

}
