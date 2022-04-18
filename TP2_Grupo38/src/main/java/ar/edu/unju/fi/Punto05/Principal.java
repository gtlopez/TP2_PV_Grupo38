package ar.edu.unju.fi.Punto05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.println("Ingrese un número de tipo entero y verifique si corresponde a algún mes del año");
		do {
			System.out.print("Introduzca Número entero: ");
			num = teclado.nextInt();
			
			switch(num){
            case 1: 
            	System.out.println("El numero " + num + " corresponde al Mes de ENERO"); 
            	break;
            case 2: 
            	System.out.println("El numero " + num + " corresponde al Mes de FEBRERO"); 
            	break;
            case 3: 
            	System.out.println("El numero " + num + " corresponde al Mes de MARZO"); 
            	break;
            case 4: 
            	System.out.println("El numero " + num + " corresponde al Mes de ABRIL");
            	break;
            case 5: 
            	System.out.println("El numero " + num + " corresponde al Mes de MAYO");
            	break;
            case 6: 
            	System.out.println("El numero " + num + " corresponde al Mes de JUNIO");
            	break;
            case 7: 
            	System.out.println("El numero " + num + " corresponde al Mes de JULIO"); 
            	break;
            case 8: 
            	System.out.println("El numero " + num + " corresponde al Mes de AGOSTO");
            	break;
            case 9: 
            	System.out.println("El numero " + num + " corresponde al Mes de SEPTIEMBRE");
            	break;
            case 10: 
            	System.out.println("El numero " + num + " corresponde al Mes de OCTUBRE");
            	break;
            case 11: 
            	System.out.println("El numero " + num + " corresponde al Mes de NOVIEMBRE");
            	break;
            case 12: 
            	System.out.println("El numero " + num + " corresponde al Mes de DICIEMBRE");
            	break;
            default : 
            	System.out.println("No Existe ese MES");
				System.out.println("FIN");
        }
		} while (num < 13 && num > 0);
	}
}