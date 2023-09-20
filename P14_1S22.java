import java.util.Scanner;

public class P14_1S22{ 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        String opc;
        byte num1, num2;
        int resultado;

        System.out.println("Menu de opciones");
        System.out.println("\n Suma");
        System.out.println("\n Resta");
        System.out.println("\n Division");
        System.out.println("\n Multiplicacion");
        System.out.println("\n Que opcion desea: ");
        opc = teclado.nextLine();

        switch(opc){
        case "Suma":
        	System.out.println("Aqui va la suma");
        	break;
        case "Resta":
        	System.out.println("Aqui va la resta");
        	break;
        case "Multiplicacion":
        	System.out.println("Aqui va la multiplicacion");
        	break;
        case "Division":
        	System.out.println("Aqui va la division");
        	break;
        default: 
        	System.out.println("No existe la opcion");
 }


	}
}