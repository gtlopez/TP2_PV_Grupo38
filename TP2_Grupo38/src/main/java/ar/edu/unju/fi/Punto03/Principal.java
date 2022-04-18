package ar.edu.unju.fi.Punto03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		int contador = 1;
		//Solicitar al usuario que ingrese 5 números enteros		
		while (contador < 6) {
			System.out.print("Introduzca Número entero: ");
			num = teclado.nextInt();
			//Para establecer si un número es par, 
			//el resto de la división de dicho número entre 2 tiene que dar cero.
			if (num % 2 == 0)
				System.out.println("El numero ingresado es Par");
			else
				System.out.println("El numero ingresado no es Par");
			contador++;
		}
	}
}