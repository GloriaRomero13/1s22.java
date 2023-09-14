import java.util.Scanner;
public class P11_1s22{ 
	public static void main(String[] args){
	int edad;
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingresa Tu Edad");
	edad = teclado.nextInt();

	if (edad >= 18){ 
    System.out.println("Eres mayor de edad");
    }else{
    System.out.println("No eres mayor de edad");
    }

    //Raiz Cuadrada
    System.out.println("Raiz cuadrada de 10" + Math.sqrt(10));
    //Potencia
    System.out.println("Potencia" + Math.pow(5,3));
    //Residuo De Division
    System.out.println("Residuo de 10/2: " + (10%2));
    System.out.println("Residuo de 11/2: " + (11%2));
    }
}    