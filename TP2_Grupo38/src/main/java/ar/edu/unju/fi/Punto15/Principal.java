package ar.edu.unju.fi.Punto15;

import java.time.LocalDate;


public class Principal {

	public static void main(String[] args) {
		Persona unaPersona = new Persona("Persona001",LocalDate.of(1980, 6, 21));
		System.out.println("Cuantos años tiene la persona.");
		System.out.println("El signo del zodiaco de la persona según la fecha de nacimiento.");
		System.out.println("Estación del año que corresponde según la fecha de nacimiento.");
		System.out.println();
		System.out.print("Edad: "+unaPersona.calcularEdad());
		System.out.println();
		System.out.print("Signo del Zodiaco: "+unaPersona.calcularSignoZ());
		System.out.println();
		System.out.println("Estacion: "+unaPersona.calcularEstacion());
	}
}
