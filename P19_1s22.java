import java.util.Scanner;
import java.lang.Math;
public class P19_1s22{ 
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double resultado;
		System.out.println("Calcular un angulo en radianes");

		System.out.println("Introducir el numero de un angulo: ");
		a = teclado.nextInt();
		resultado = Math.PI*a/180;
		//radianes es = PI*a/180
		System.out.println("el resultado en radianes es: " + resultado);

	}
}