package ar.edu.unju.fi.Punto17;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
		System.out.println();
		
		//b.6
		System.out.println("Punto b.6");
		ProcesoFecha pf5 = new ProcesoFecha();
		Scanner teclado = new Scanner(System.in);
		String fechaAux;
		LocalDate fechaB6;
		LocalDate fechaIncrementada;

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		System.out.println("Ingreso de fechas con el formato 'dd/MM/yyyy'");
		System.out.print("Ingrese una fecha: "); 
		fechaAux = teclado.next();
		fechaB6 = LocalDate.parse(fechaAux,dtf);		
		pf5.setFecha1(fechaB6);
		fechaIncrementada = fechaB6.plusDays(365);
		System.out.println();
		System.out.println("Fecha ingresada por consola: " + pf5.formatearFecha(pf5.getFecha1()));
		System.out.println("Fecha Incrementada: " + pf5.formatearFecha(fechaIncrementada));
			
		//b.6.2
		LocalDate fechaB62;
		LocalDate fechaDecrementada;
		System.out.println();
		System.out.println("Ingreso de fechas con el formato 'dd/MM/yyyy'");
		System.out.print("Ingrese una fecha: "); 
		fechaAux = teclado.next();
		fechaB62 = LocalDate.parse(fechaAux,dtf);
		pf5.setFecha2(fechaB62);
		fechaDecrementada = pf5.fecha2.minusMonths(6);
		System.out.println();
		System.out.println("Fecha ingresada por consola: " + pf5.formatearFecha(pf5.getFecha1()));
		System.out.println("Fecha Disminuida en 6 meses: " + pf5.formatearFecha(fechaDecrementada));

	
		
	}

}