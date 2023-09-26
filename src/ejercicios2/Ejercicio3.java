package ejercicios2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/* Creamos la variable num para el número introducido, otro para el resto
		 *  scanner y un string llamado par que pasará el mensaje según 
		 *  si es o no par*/
		int num, resto;
		Scanner sc = new Scanner(System.in);
		String par;
		
		//Pedimos un número
		System.out.println("Dinos un número");
		num = sc.nextInt();
		
		//Vemos el resto del número dividido entre 2
		resto = num % 2;
		
		//Comparamos el resto para saber si es true o false y saber que mensaje pasar
		par = (resto == 0) ? "El número es par" : "El número es impar";
		System.out.println(par);
		
		sc.close();
	}

}
