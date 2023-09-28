package entregatema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// constantes de los precios de las entradas
		final float INFANTIL = 15.50f;
		final float ADULTO = 20f;
		final float DESCUENTO = 0.95f;
		final int TOPE = 100;
		
		//Creamos las variables para el numero de entradas por cada tipo de entrada
		int nInfantil, nAdulto;
		
		//Creamos variables para los precios que se hayan calculado
		float precioTotal, precioFinal;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el nº de entrada por cada tipo de entrada
		System.out.println("Dime el número de entradas infantiles que quieres");
		nInfantil = sc.nextInt();
		
		System.out.println("Dime el número de entradas para adultos que quieres");
		nAdulto = sc.nextInt();
		
		//Calculamos el precio total para aplicarle el descuento
		precioTotal = (nInfantil * INFANTIL) + (nAdulto * ADULTO);
		
		//Vemos si el precio total es superior o igual a 100 y si es así, aplicamos descuento
		precioFinal = (precioTotal >= TOPE) ? precioTotal * DESCUENTO : precioTotal;
		
		//Pasamos el precio total por pantalla
		System.out.println("El precio final de tus entradas es " + precioFinal + "€");
		
		//Cerramos el escaner
		sc.close();

	}

}
