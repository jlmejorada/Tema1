package entregatema1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos variables float para a, b, c, x e y
		float a, b, c, x, y;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los números para las variables del polinomio
		System.out.println("Dame el número que se sustituira por a");
		a = sc.nextFloat();
		
		System.out.println("Dame el número que se sustituira por b");
		b = sc.nextFloat();

		System.out.println("Dame el número que se sustituira por c");
		c = sc.nextFloat();

		//Y pedimos el número que sustituira la incognita x del polinomio
		System.out.println("Dame el número que se sustituira la incognita x");
		x = sc.nextFloat();
		
		//Calculamos el polinomio
		y =(a * ((float) Math.pow(x, 2))) + (b * x) + c;
		
		//Mostramos el resultado de del polinomio por pantalla
		System.out.println("El resultado del polinomio es de " + y);
		
		//Cerramos el escaner
		sc.close();
	}

}
