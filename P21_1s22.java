import java.util.Scanner;
import java.lang.Math;
public class P21_1s22{ 
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		System.out.println("hallar el area de un triangulo: ");
		System.out.println("   *");
		System.out.println("   * *");
		System.out.println(" a *   *  b");
		System.out.println("   *  s  *");
		System.out.println("   *       *");
		System.out.println("   * * * * * *");
		System.out.println("        c");
		int a;
		int b;
		int c;
		int S;
		int area;
		double resultado;
		System.out.println("Escibe el valor de a: ");
		a = teclado.nextInt();
		System.out.println("Escribe el valor de b: ");
		b = teclado.nextInt();
		System.out.println("Escribe el valor de c: ");
		c = teclado.nextInt();
		S = (a+b+c)/2;
		area = S*(S-a)*(S-b)*(S-c);
		resultado = Math.sqrt(area);
		System.out.println("El area de un triangulo es: "+ resultado);
	}
}