package ar.edu.unju.fi.Punto12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final double G = 9.81;
		double altura;
		double tiempo;
		
		System.out.println("Cálculo del tiempo que tarda en caer un objeto desde una altura h.");
		System.out.println("Se ingresara la altura (en metros) desde donde cae el objeto.");
		System.out.println("El separador de decimales en la coma.");
		System.out.println();
	    System.out.print("Ingrese la altura: ");
	    altura = teclado.nextDouble();
	    //Calculo del tiempo que tarda en caer un objeto 	   
	    tiempo = Math.sqrt(2*altura/G);
	    
	    System.out.printf("El objeto tarda %.2f segundos en caer desde una altura de %.2f metros" , tiempo, altura);

	}

}
