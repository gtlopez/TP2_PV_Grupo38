package ar.edu.unju.fi.Punto15;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

public class Persona {
	public String nombre;
	public LocalDate fechaNacimiento;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int calcularEdad() {
		//LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		int edad = periodo.getYears();
		if (fechaNacimiento.lengthOfYear() <= LocalDate.now().lengthOfYear())
			edad--;
		return edad;
		
	}
	
	public String calcularSignoZ() {
		String signo="";
		int anio = fechaNacimiento.getYear();
		
		LocalDate ariesInicio = LocalDate.of(anio,3,21);
		LocalDate tauroInicio = LocalDate.of(anio,4,20);
		LocalDate geminisInicio = LocalDate.of(anio,5,22);
		LocalDate cancerInicio = LocalDate.of(anio,6,21);
		LocalDate leoInicio = LocalDate.of(anio,7,23);
		LocalDate virgoInicio = LocalDate.of(anio,8,23);
		LocalDate libraInicio = LocalDate.of(anio,9,23);
		LocalDate escorpioInicio = LocalDate.of(anio,10,23);
		LocalDate sagitarioInicio = LocalDate.of(anio,11,22);
		LocalDate capricornioInicio = LocalDate.of(anio,12,22);
		LocalDate acuarioInicio = LocalDate.of(anio,1,20);
		LocalDate piscisInicio = LocalDate.of(anio,2,19);
		
		if (fechaNacimiento.isBefore(acuarioInicio)) {
			signo = "Capricornio";
		}else {
			if (fechaNacimiento.isBefore(piscisInicio)) {
				signo = "Acuario";
			}else {
				if (fechaNacimiento.isBefore(ariesInicio)) {
					signo = "Piscis";
				}else {
					if (fechaNacimiento.isBefore(tauroInicio)) {
						signo = "Aries";
					}else {
						if (fechaNacimiento.isBefore(geminisInicio)) {
							signo = "Tauro";
						}else {
							if (fechaNacimiento.isBefore(cancerInicio)) {
								signo = "Geminis";
							}else {
								if (fechaNacimiento.isBefore(leoInicio)) {
									signo = "Cancer";
								}else {
									if (fechaNacimiento.isBefore(virgoInicio)) {
										signo = "Leo";
									}else {
										if (fechaNacimiento.isBefore(libraInicio)) {
											signo = "Virgo";
										}else {
											if (fechaNacimiento.isBefore(escorpioInicio)) {
												signo = "Libra";
											}else {
												if (fechaNacimiento.isBefore(sagitarioInicio)) {
													signo = "Escorpio";
												}else {
													if (fechaNacimiento.isBefore(capricornioInicio)) {
														signo = "Sagitario";
													}else {
														signo = "Capricornio";
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}	
		return signo;
	}
	
	public String calcularEstacion(){
		String estacion="";
		int anio = fechaNacimiento.getYear();
		LocalDate otonioInicio = LocalDate.of(anio,3,21);
		LocalDate inviernoInicio = LocalDate.of(anio,6,21);
		LocalDate primaveraInicio = LocalDate.of(anio,9,21);
		LocalDate veranoInicio = LocalDate.of(anio,12,21);
		
		if (fechaNacimiento.isBefore(otonioInicio)){
			estacion = "Verano";
		} else {
			if (fechaNacimiento.isBefore(inviernoInicio)){
				estacion = "Otoño";
		} else {
			if (fechaNacimiento.isBefore(primaveraInicio)){
				estacion = "Invierno";
			} else {
				if (fechaNacimiento.isBefore(veranoInicio)){
					estacion = "Primavera";
				} else {
					estacion = "Verano";
					}
				}
			}
		}			
		return estacion;
	}
}
