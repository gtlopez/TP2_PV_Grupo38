package ar.edu.unju.fi.Punto16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
				
		System.out.println("Solicitar al Usuario el ingreso por consola del valor de n");
		System.out.println("para construir un objeto de la clase CalculoMatematico");
		System.out.println();
		System.out.print("Ingrese el valro de n: ");
		
		num = teclado.nextInt();
		CalculoMatematico calculoMatematico = new CalculoMatematico(num);

		System.out.printf("El resultado de la sumatoria es: %.2f", calculoMatematico.calcularSumatoria());
		System.out.println();
		System.out.printf("El resultado de la productoria es: %.2f" ,calculoMatematico.calcularProductoria());

	}

}
