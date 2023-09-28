import java.util.Scanner;
import java.lang.Math;
public class P20_1s22{ 
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		double a;
		double b= 1.33;
		double resultado;
		System.out.println("hallar el volumen");
		System.out.println("escribe el radio: ");
		a = teclado.nextInt();
		resultado = b*Math.PI*Math.pow(a,3);
		//volumen es = (4/3)*PI*(r^3)
		System.out.println("El resultado del volumen es: "+ resultado);
	}
}