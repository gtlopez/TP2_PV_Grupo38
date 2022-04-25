package ar.edu.unju.fi.Punto17;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
	public LocalDate fecha1;
	public LocalDate fecha2;
	public LocalTime time1;
	public LocalTime time2;
	public LocalDateTime dateTime1;
	public LocalDateTime dateTime2;

	public ProcesoFecha() {
	}

	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		this.time1 = time1;
		this.time2 = time2;
	}

	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	public LocalDate getFecha1() {
		return fecha1;
	}

	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}

	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	public LocalTime getTime1() {
		return time1;
	}

	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	public LocalTime getTime2() {
		return time2;
	}

	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	public LocalDateTime getDateTime1() {
		return dateTime1;
	}

	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	public LocalDateTime getDateTime2() {
		return dateTime2;
	}

	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}

	public Period contarTiempoTranscurrido() {
		Period periodo = Period.between(fecha1, fecha2);
		return periodo;
	}

	public String formatearFecha(LocalDate fecha) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fecha.format(dtf);
	}

	public String compararFechas() {
		String mensajes;

		if (fecha1.isAfter(fecha2)) {
			mensajes = "La fecha " + formatearFecha(fecha1) + " es posterior a la fecha " + formatearFecha(fecha2)
					+ ".";
		} else {
			if (fecha1.isBefore(fecha2)) {
				mensajes = "La fecha " + formatearFecha(fecha1) + " es anterior a la fecha " + formatearFecha(fecha2)
						+ ".";
			} else {
				mensajes = "Las fechas  " + formatearFecha(fecha1) + " y  " + formatearFecha(fecha2) + " son iguales.";
			}
		}
		return mensajes;
	}
}
