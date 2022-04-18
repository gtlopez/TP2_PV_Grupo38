package ar.edu.unju.fi.Punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
	//b.1	
		System.out.println("Punto b.1");
		ProcesoFecha pf1 = new ProcesoFecha(LocalDate.of(2000, 12, 21),LocalDate.of(2022, 1, 1));
		System.out.println("Variable fecha1: " + pf1.fecha1);
		System.out.println("Variable fecha2: " + pf1.fecha2);
		System.out.println();
	//b.2
		System.out.println("Punto b.2");
		ProcesoFecha pf2 = new ProcesoFecha(LocalTime.parse("02:34:50.63"),LocalTime.parse("19:00:00.00"));
		//System.out.println(pf2.time1);
		//System.out.println(pf2.time2);
		System.out.println("Variable modificada time1: " + pf2.time1.plusHours(5));
		System.out.println("Variable modificada time2: " + pf2.time2.minusMinutes(20));
		System.out.println();
	//b.3
		System.out.println("Punto b.3");
		System.out.println("Comparar Fechas");
		//pf2.compararFechas();
		
	//b.4
		System.out.println("Punto b.4");
		LocalDateTime ldt1 = LocalDateTime.of(pf1.fecha1.getYear(),pf1.fecha1.getMonth(),pf1.fecha1.getDayOfMonth(),
				pf2.time1.getHour(),pf2.time2.getMinute(),pf2.time1.getSecond());
		LocalDateTime ldt2 = LocalDateTime.of(pf1.fecha2.getYear(),pf1.fecha2.getMonth(),pf1.fecha2.getDayOfMonth(),
				pf2.time2.getHour(),pf2.time2.getMinute(),pf2.time2.getSecond());
		
		ProcesoFecha pf3 = new ProcesoFecha(ldt1,ldt2);
		System.out.println("Variable fecha1: " + ldt1);
		System.out.println("Variable fecha2: " + ldt2);
		System.out.println();
	
	//b.5
		System.out.println("Punto b.5");
		LocalDate fNac = LocalDate.of(1980,1,1);
		LocalDate fHoy = LocalDate.now();
		ProcesoFecha pf4 = new ProcesoFecha(fNac,fHoy);
		System.out.println();
		System.out.println("Han transcurrido " + pf4.contarTiempoTranscurrido().getYears() + 
				" años, " + pf4.contarTiempoTranscurrido().getMonths() + " meses y " + 
				pf4.contarTiempoTranscurrido().getDays() + " dias desde la fecha " + 
				pf4.formatearFecha(fNac) + " hasta la fecha " + pf4.formatearFecha(fHoy));

	}

}