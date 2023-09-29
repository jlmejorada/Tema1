package entregatema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Creamos la variable para recoger el número de metros del lanzamiento en float y otra 
		 para el cambio la conversión en int para truncar el número*/
		double num;
		int cambio;
		
		//Creamos la constante para multiplicar por 100 y pasar los m a cm
		final int CONVERTIR=100;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos y recogemos la distancia del lanzamiento en metros
		System.out.println("Dime la distancia del lanzamiento realizado en metros");
		num = sc.nextDouble();
		
		//Realizamos la conversión
		cambio = (int) (num * CONVERTIR);
		
		//Por último, mostramos un mensaje que exprese el resultado
		System.out.println("La distancia de tu lanzamiento es de " + cambio + " cm");
		
		//Cerramos el escaner
		sc.close();

	}

}
