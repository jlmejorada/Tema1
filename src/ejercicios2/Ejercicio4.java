package ejercicios2;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/* Creamos unas variables boleean para si hay que ir o no a la biblioteca,
		para si llueve o no y para si tiene o no hecho los deberes*/
		boolean biblioteca, llueve, deberes;
		// Creamos una variable string para el texto final que vamos a mostrar
		String fin;
		// Creamos una variable scanner
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos si está lloviendo y recogemos la respuesta
		System.out.println("¿No esta lloviendo?");
		llueve = sc.nextBoolean();
		
		//Preguntamos si va a la biblioteca y recogemos la respuesta
		System.out.println("¿Vas a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		//Preguntamos si va ha acabado la tarea y recogemos la respuesta
		System.out.println("¿Has acabado la tarea?");
		deberes = sc.nextBoolean();
		
		//Comparamos las respuestas y vemos si sale o no a la calle
		fin = biblioteca || (llueve && deberes) ? "Si sales" : "No sales";
		System.out.println(fin);
		
		sc.close();
	}

}
