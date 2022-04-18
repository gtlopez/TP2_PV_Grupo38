package ar.edu.unju.fi.Punto02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int anio;
		
		//Un año es bisiesto cuando en vez de tener 365 días,
		//tiene 366 que es cuando el mes de Febrero tiene 29 días.
		System.out.println("Determinar si el año ingresado es bisiesto");
		System.out.print("Ingrese año: ");
		anio = teclado.nextInt();
		
		// El año debe ser divisible por 4, pero no divisible por 100, o el año debe ser divisible por 400. 
		// Si cumple estas condiciones el año es bisiesto.
		if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0)) {
			System.out.println("El año " + anio + " es un año bisiesto");
		} else {
			System.out.println("El año " + anio + " no es un año bisiesto");
		}
	}
}