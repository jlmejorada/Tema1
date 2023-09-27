package ejercicios2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos una variable para la nota del primer trimestre
		int primer;
		
		//Creamos una variable para la nota del segundo trimestre
		int segun;
		
		//Creamos una variable para la nota del tercer trimestre
		int tercer;
		
		//Creamos una variable para la nota media sin decimales de todos los trimestres
		float mediaEntera;
		
		//Creamos una variable para la nota media  con decimales de todos los trimestres
		float mediaDecimal;
		
		//Creamos una variable scanner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la nota del primer trimestre y la recogemos con el scanner
		System.out.println("Dime la nota del primer trimestre");
		primer = sc.nextInt();
		
		//Pedimos la nota del segundo trimestre y la recogemos con el scanner
		System.out.println("Dime la nota del segundo trimestre");
		segun = sc.nextInt();
		
		//Pedimos la nota del tercer trimestre y la recogemos con el scanner
		System.out.println("Dime la nota del tercer trimestre");
		tercer = sc.nextInt();
		
		//Calculamos la media de los 3 trimestres y la guardamos con y sin decimales
		mediaDecimal = (float) (primer + segun + tercer)/3;
		mediaEntera =(int) mediaDecimal;
		
		//Mostramos por pantalla ambas notas
		System.out.println("Tu nota de expediente es de " + mediaDecimal);
		System.out.println("Tu nota del boletin de calificaciones es de " + mediaEntera);
		
		//Cerramos el scanner
		sc.close();
	}

}
