package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dame un radio: ");
		int radio = sc.nextInt();
		Circulo circulo1 = new Circulo (radio);
		int opcion;
		
		do {
			System.out.println("0 - Salir  \n"
							  +"1 - Calcular area \n"
							  +"2 - Calcular el perímetro");
			System.out.println("Por favor, selecciona una opción: ");
			
			 opcion = sc.nextInt();
			
			if (opcion == 1) {
				circulo1.calcularArea();
				System.out.println("El área del circulo de radio " + radio + " es: " + circulo1.getArea());
				
			}else if (opcion == 2) {
				circulo1.calcularPerimetro();
				System.out.println("El perímetro del circulo de radio " + radio + " es: " + circulo1.getPerimetro());
				
			}
		}while(opcion != 0);
		System.out.println("MAMA PINGA");
		
		
		
		
		
		
	}
}
