package ar.edu.unju.fi.punto08;

public class Principal {

	public static void main(String[] args) {
		int i = 1;
		int multiplo = 4;
		int maximo = 100;
		System.out.println(
				"Secuencia numérica, la cual está determinada por los números múltiplos de 4 menores o iguales que 100:");
		do {
			if (i % multiplo == 0)
				System.out.print(i + " ");
			i++;

		} while (i <= maximo);

	}

}
