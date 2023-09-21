package ejercicios1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos la variable n y la variable del scanner
		
		int n=0;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un número y escaneamos el siguiente int
		
		System.out.println("Dime un número");
		n=sc.nextInt();
		
		//Mostramos la respuesta
		System.out.println("Tu número es:" + n);
		
		//cerramos el scanner
		sc.close();
	}

}
