import java.util.Scanner;
public class P17_1s22{ 
	public static void main(String[] args) {
		System.out.println("anotar los numeros del 1 al 100");
		for (int i = 0; i < 100; i++){ 
			System.out.println(i + 1);
			if (i % 10 == 0){ 
				System.out.println();
			}
	    }
	}
}