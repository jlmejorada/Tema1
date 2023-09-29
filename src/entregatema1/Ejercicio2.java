package entregatema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos una variable que recoja un número entero y el resto de modulo
		int num, resto;
		
		//Creamos la constante para el número 7 y otra para el 0
		final int num7=7;
		final int num0=0;
		
		//Creamos una variable scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un número y lo recojemos con el escaner
		System.out.println("Dame un número");
		num = sc.nextInt();
		
		//Calculamos a traves de su modulo, cuando le queda oara ser multiplo de 7
		resto = (num%num7);
		resto = (resto == num0)? resto : num7 - resto;
		
		//Mostramos por pantalla, cuanto le queda al número para ser multiplo de 7
		System.out.println("A tu número le falta sumarle " + resto + " para ser multiplo de 7");
		
		//Cerramos el escanner
		sc.close();
	}

}
