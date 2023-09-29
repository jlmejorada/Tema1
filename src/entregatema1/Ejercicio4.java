package entregatema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos las variables para la base, altura y area del triangulo
		float base, altura, area;
		
		//Creamos la constante para el número 2
		final int NUM2=2;
		
		//Creamos una variable scanner
		Scanner sc = new Scanner(System.in);

		//Pedimos la base y la altura del triangulo
		System.out.println("Dame la base del triángulo");
		base = sc.nextFloat();
		
		System.out.println("Dame la altura del triángulo");
		altura = sc.nextFloat();
		
		//Calculamos el área del triángulo
		area = (base*altura)/NUM2;
		
		//Mostramos el area por pantalla
		System.out.println("El área de tu triangulo de es " + area);
		
		//Cerramos el scanner
		sc.close();
	}

}
