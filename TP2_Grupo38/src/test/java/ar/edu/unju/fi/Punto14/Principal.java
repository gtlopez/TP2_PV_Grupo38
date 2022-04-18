package ar.edu.unju.fi.Punto14;

import java.time.LocalDate;



public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado01 = new Empleado();
		Empleado empleado02 = new Empleado("Nombreempleado02", 54812, 190);		
		Empleado empleado03 = new Empleado("NombreEmpleado03", LocalDate.of(2001, 10, 25), 250);	
		Empleado empleado04 = new Empleado("NombreEmpleado04", 300);
	
		empleado01.sueldo=empleado01.calcularSueldo();
		empleado01.sueldo=empleado02.calcularSueldo();
		empleado01.sueldo=empleado03.calcularSueldo();
		empleado01.sueldo=empleado04.calcularSueldo();
			
		empleado01.mostrarDatos();
		empleado02.mostrarDatos();
		empleado03.mostrarDatos();
		empleado04.mostrarDatos();
		
	}

}
