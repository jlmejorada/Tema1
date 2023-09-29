package entregatema1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos una variable float para almacenar el número que debamos pedir
		float num, decimal;
		
		//Creamos una variable int para almacenar el número que saquemos de la comparación
		int comp;
		
		//Creamos la constante para comparar y ver si redondear o truncar
		final float REDONDEO=0.5f;
		
		//Creamos una variable scanner;
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos al usuario por un número que redondear y lo recogemos
		System.out.println("Dime un número");
		num = sc.nextFloat();
		
		//Calculamos la parte decimal
		decimal = num - (int) num;
		
		//Hacemos una comparación para ver si la parte decimal es mayor/igual o menor de 0.5
		comp = (decimal>=REDONDEO) ? (int)(++num) : (int)num;
		
		//Mostramos por pantalla el número redondeado
		System.out.println("El número redondeado es: " + comp);
		
		//Cerramos el scanner
		sc.close();
	}

}
