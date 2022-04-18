package ar.edu.unju.fi.Punto04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.println("Ingrese un número de tipo entero y verifique si corresponde a algún mes del año");
		do {
			System.out.print("Introduzca Número entero: ");
			num = teclado.nextInt();
			if (num >= 1 && num <= 12) {
				if (num == 1) {
					System.out.println("El numero " + num + " corresponde al Mes de ENERO");
				} else {
					if (num == 2) {
						System.out.println("El numero " + num + " corresponde al Mes de FEBRERO");
					} else {
						if (num == 3) {
							System.out.println("El numero " + num + " corresponde al Mes de MARZO");
						} else {
							if (num == 4) {
								System.out.println("El numero " + num + " corresponde al Mes de ABRIL");
							} else {
								if (num == 5) {
									System.out.println("El numero " + num + " corresponde al Mes de MAYO");
								} else {
									if (num == 6) {
										System.out.println("El numero " + num + " corresponde al Mes de JUNIO");
									} else {
										if (num == 7) {
											System.out.println("El numero " + num + " corresponde al Mes de JULIO");
										} else {
											if (num == 8) {
												System.out.println("El numero " + num + " corresponde al Mes de AGOSTO");
											} else {
												if (num == 9) {
													System.out.println("El numero " + num + " corresponde al Mes de SEPTIEMBRE");
												} else {
													if (num == 10) {
														System.out.println("El numero " + num + " corresponde al Mes de OCTUBRE");
													} else {
														if (num == 11) {
															System.out.println("El numero " + num + " corresponde al Mes de NOVIEMBRE");
														} else {
															if (num == 12) {
																System.out.println("El numero " + num + " corresponde al Mes de DICIEMBRE");
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

			} else {
				System.out.println("No Existe ese MES");
				System.out.println("FIN");
			}
		} while (num < 13 && num > 0);
	}
}