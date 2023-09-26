package ejercicios1;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaramos las variables necesarias
		float resu, mul, precio, iva=21;
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un precio al usuario
		System.out.println("Dame un precio");
		precio = sc.nextFloat();
		
		// Calculamos el IVA
		mul=(precio*iva)/100;
		resu=mul+precio;
		
		//Pasamos el mensaje con el calculo realizado
		System.out.println("El precio con iva es de: " + resu + "€");
		sc.close();
	}

}
