package entregatema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos una variable que recoja dos número enteros y el resto de modulo
		int num1, num2, resto;
		
		//Creamos una variable scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un número y lo recojemos con el escaner
		System.out.println("Dame un número entero");
		num1 = sc.nextInt();
		
		//Pedimos un número del que queramos saber si el otro es su multiplo
		System.out.println("Dame un número entero");
		num2 = sc.nextInt();
		
		//Calculamos a traves de su modulo, cuando le queda oara ser multiplo del segun número
		resto = num2 - (num1%num2);
		resto = (resto == 0)? resto : num2 - resto;
		
		//Mostramos por pantalla, cuanto le queda al número para ser multiplo de 7
		System.out.println("A tu número le falta " + resto + " para ser multiplo de " + num2);
		
		//Cerramos el escanner
		sc.close();
	}

}
