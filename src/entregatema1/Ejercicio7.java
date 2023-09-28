package entregatema1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos la variable para guardar los mm, cm y m
		float mm, cm, m;
		
		//Creamos los cambios de medida y el resultado
		float mmToCm, mToCm, resultado;
		
		//Creamos una variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos la medida de mm
		System.out.println("Dame unos milimetros");
		mm = sc.nextFloat();
		
		//Le pedimos la medida de cm
		System.out.println("Dame unos centimetros");
		cm = sc.nextFloat();
		
		//Le pedimos la medida de mm
		System.out.println("Dame unos metros");
		m = sc.nextFloat();
		
		//Calculamos los mm en cm
		mmToCm = mm / 10;
		
		//Calculamos los mm en cm
		mToCm = m * 100;
		
		//Sumamos todos los cm
		resultado = mmToCm + mToCm + cm;
		
		//Mostramos el resultado en cm
		System.out.println("El resultado de la suma en cm es de: " + resultado);
		
		//Cerramos el escaner
		sc.close();
	}

}
