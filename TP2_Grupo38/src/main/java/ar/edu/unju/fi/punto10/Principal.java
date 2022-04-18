package ar.edu.unju.fi.punto10;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás ");
		System.out.println("utilizando un bucle while: ");
		int i = 320;  
	    while(i >= 160) {
	    	System.out.print(i + " ");
	        i-=20;
	    }

	}

}
