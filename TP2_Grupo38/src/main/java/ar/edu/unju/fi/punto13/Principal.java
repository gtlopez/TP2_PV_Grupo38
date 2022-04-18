package ar.edu.unju.fi.punto13;


import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Empleado unEmpleado = new Empleado("EmpleadoNumero001", LocalDate.parse("2000-10-01"), 10001, "empleadoNumero01@gmail.com", 0d, 140);
		unEmpleado.sueldo=unEmpleado.calcularSueldo();
		Empleado otroEmpleado = new Empleado("EmpleadoNumero002", LocalDate.parse("1999-07-01"), 9570, "empleadoNumero02@gmail.com", 0d, 280);
		otroEmpleado.sueldo=otroEmpleado.calcularSueldo();
		
		String mostrarDatos = unEmpleado.toString();		
		System.out.println(mostrarDatos);
		System.out.println();
		unEmpleado.mostrarDatos();
		otroEmpleado.mostrarDatos();
	}

}
