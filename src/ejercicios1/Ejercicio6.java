package ejercicios1;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos las variables necesarias
		int num1, num2, suma, resta, mul, div;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos dos números
		System.out.println("Dame un número");
		num1 = sc.nextInt();
		System.out.println("Dame otro número");
		num2 = sc.nextInt();
		
		//Hacemos los calculos y los mostramos por pantalla
		suma= num1 + num2;
		resta= num1 - num2;
		mul= num1 * num2;
		div= num1 / num2;
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La resta de los números es: " + resta);
		System.out.println("La multiplicación de los números es: " + mul);
		System.out.println("La división de los números es: " + div);
		sc.close();
	}

}
