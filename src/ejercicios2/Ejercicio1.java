package ejercicios2;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos las variables para los kg peras, manzanas y la suma de precios
		float manzana=0, pera=0, suma;
		
		//Creamos la variable del scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los kg de manzanas y peras
		System.out.println("Dime los kg de manzanas compradas");
		manzana = sc.nextFloat();
		
		System.out.println("Dime los kg de peras compradas");
		pera = sc.nextFloat();
		
		//Pedimos calculamos el precio según el kg de fruta
		suma = (manzana * 2.35f) + (pera * 1.95f);
		
		//Mostramos por pantalla el precio final de la compra
		System.out.println("El precio final de la compra es de " + suma + "€");
		
		sc.close();
	}
}
