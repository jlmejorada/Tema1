package entregatema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/* Creamos la variable para los segundos introducidos y 
		para las horas minutos y segundos calculados*/
		int numero,resto, segundos, minutos, horas;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los segundos que quiera introducir el usuario
		System.out.println("Dame un número de segundos");
		numero = sc.nextInt();
		
		//Calulamos las horas
		horas=numero/3600;
		//Calculamos el resto de las horas
		resto=numero%3600;
		
		//Calulamos los minutoas
		minutos=resto/60;
		//Calculamos el resto de los minutos, que seran los segundos
		segundos=resto%60;
		
		//Devolvemos la hora en horas minutos y segundos
		System.out.println(numero + " segundos son " + horas + " horas " + minutos + " minutos " + segundos + " 5segundos ");
		
		//Cerramos el escaner
		sc.close();
	}

}
