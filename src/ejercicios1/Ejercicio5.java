package ejercicios1;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos las variables necesarias
		float radio, longitud, area;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el radio de la circunferencia
		System.out.println("Dame el radio de la circunferencia");
		radio = sc.nextFloat();
		
		//Calculamos la longitud y area de la circunferencia
		longitud = (float) (2*Math.PI) * radio;
		area = (float) (Math.PI * (Math.pow(radio,2)));
		
		//Damos los calculos
		System.out.println("El perimetro de la circunferencia es: " + longitud);
		System.out.println("El area de la circunferencia es: " + area);
		
		sc.close();
	}

}
