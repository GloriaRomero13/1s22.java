import java.util.Scanner;
public class P12_1s22{ 
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	
    	int n;
    	
    	System.out.println("ingresa un numero");
    	n = teclado.nextInt();

    	if(n % 2 == 0) { 
    	System.out.println(n +" es un numero par");
    	}else{
    	System.out.println(n +" no es un numero par");
    	}  
    }    
}


	
