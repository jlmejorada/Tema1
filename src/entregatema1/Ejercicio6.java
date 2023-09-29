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
		
		//Creamos la constante para 3600
		final int SEGUNDOTOHORA=36000;
		
		//Creamos la constante para 60
		final int SEGUNDOTOMIN=60;
		
		//Calulamos las horas
		horas=numero/SEGUNDOTOHORA;
		//Calculamos el resto de las horas
		resto=numero%SEGUNDOTOHORA;
		
		//Calulamos los minutoas
		minutos=resto/SEGUNDOTOMIN;
		//Calculamos el resto de los minutos, que seran los segundos
		segundos=resto%SEGUNDOTOMIN;
		
		//Devolvemos la hora en horas minutos y segundos
		System.out.println(numero + " segundos son " + horas + " horas " + minutos + " minutos " + segundos + " 5segundos ");
		
		//Cerramos el escaner
		sc.close();
	}

}
