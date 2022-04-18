package ar.edu.unju.fi.punto13;
import java.time.LocalDate;

public class Empleado {
	public String nombre;
	public LocalDate fecha_Ingreso;
	public int legajo;
	public String email;
	public double sueldo;
	public int horasTrabajadas;
	
	public Empleado(String nombre, LocalDate fecha_Ingreso, int legajo, String email, double sueldo,
			int horas_Trabajadas) {
		super();
		this.nombre = nombre;
		this.fecha_Ingreso = fecha_Ingreso;
		this.legajo = legajo;
		this.email = email;
		this.sueldo = sueldo;
		this.horasTrabajadas = horas_Trabajadas;	
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public LocalDate getFecha_Ingreso() {
		return fecha_Ingreso;
	}



	public void setFecha_Ingreso(LocalDate fecha_Ingreso) {
		this.fecha_Ingreso = fecha_Ingreso;
	}



	public int getLegajo() {
		return legajo;
	}



	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		
		this.sueldo = sueldo;
	}



	public int getHoras_Trabajadas() {
		return horasTrabajadas;
	}



	public void setHoras_Trabajadas(int horas_Trabajadas) {
		this.horasTrabajadas = horas_Trabajadas;
	}



	public double calcularSueldo() {
		int horas_160 = 600;
		int horas_61 = 650;
		double sueldo_real;
		if (horasTrabajadas > 160) {
			int extra = horasTrabajadas - 160;
			sueldo_real = horasTrabajadas * 600 + extra * 650;  
		} else
			sueldo_real = horasTrabajadas * 600;
		return sueldo_real;
	}

	public void mostrarDatos() {
		System.out.println("DATOS DEL EMPLEADO");
		System.out.println("------------------");
		System.out.println("Nombre de Empleado: " + nombre);
		System.out.println("Fecha de Ingreso: " + fecha_Ingreso);
		System.out.println("Numero de legajo: " + legajo);
		System.out.println("Direccion de email: " + email);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Horas Trabajadas: " + horasTrabajadas);
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", fecha_Ingreso=" + fecha_Ingreso + ", legajo=" + legajo + ", email="
				+ email + ", sueldo=" + sueldo + ", horas_Trabajadas=" + horasTrabajadas + "]";
	}
	
	

}
