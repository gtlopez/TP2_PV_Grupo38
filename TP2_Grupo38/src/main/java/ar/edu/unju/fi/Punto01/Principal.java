package ar.edu.unju.fi.Punto01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca el numero para calcular su factorial");
	    System.out.print("El numero debe estar en el rango [0;10]: ");
	    num = teclado.nextInt();
	    if(num < 0 || num > 11) {
	      System.out.println("Error. El numero debe estar en el rango [0;10]");
	    } else {
	      int resultado = Factorial(num);
	      System.out.printf("El Factorial del numero " + num + " es: %d\n", resultado);
	    }
	  }
	// metodo para calcular el factorial
	  public static int Factorial(int n) {
	    int factorial = 1;
	    for (int i = 2; i <= n; ++i) {
	      factorial *= i;
	    }
	    return factorial;
	  }


	

}
