package ar.edu.unju.fi.Punto06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 1;

		System.out.println("Solicitar al usuario que ingrese un número entero por consola,");
		System.out.println("para evaluar el número.");
		while (num >= 1 && num <= 10) {
			System.out.print("Introduzca Número entero: ");
			num = teclado.nextInt();

			if (num >= 1 && num <= 5)
				System.out.println("El alumno desaprueba");
			else if (num == 6)
				System.out.println("Alumno regulariza");
			else if (num >= 7 && num <= 10)
				System.out.println("El alumno promociona");
			else
				System.out.println("Valor no permitido");
		}
		System.out.println("FIN");
	}
}
