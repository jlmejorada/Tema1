package ejercicios1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos las variables necesarias
		int nota1=0;
		int nota2=0;
		float media=0;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la nota 1
		System.out.println("Dame la primera nota");
		nota1 = sc.nextInt();
		
		//Pedimos la nota 2
		System.out.println("Dame la segunda nota");
		nota2 = sc.nextInt();
		
		//Calculamos la media y la mostramos por pantalla
		media =(float) (nota1 + nota2) / 2;
		System.out.println("La media de tus examenes es de " + media);
		
		sc.close();
		}
}
