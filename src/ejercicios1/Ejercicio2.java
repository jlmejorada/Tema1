package ejercicios1;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos las variables int y scanner
		
		int n=0;
		Scanner sc = new Scanner (System.in);
		
		//Pedimos la edad y escaneamos el siguiente int
		System.out.println("Buenas, dime tu edad");
		n=sc.nextInt();
		
		//Sumamos un año la edad y lo mostramos por pantalla
		n=n+1;
		System.out.println("El año que viene tendras " + n + " años");
		
		sc.close();
	}

}
