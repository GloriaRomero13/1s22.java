import java.util.Scanner;
public class P16_1s22{ 
	public static void main(String[] args) {
	Scanner teclado = new
Scanner(System.in);
    byte n,i,a;
    int sumatoria=0,factorial;
    System.out.println("Ingrese el valor de N");
    n=teclado.nextByte();

    i=0;
    for(i=0;i<=n;i++){ 
    factorial=1;
     if(i==0) factorial=1;
     else { 
      for (a=i;a>0;a--){ 
      factorial*=a;

      }
	}
	sumatoria +=Math.pow(i,3)/factorial;
	}
System.out.println("la sumatoria es" + sumatoria);
}
}