package string;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// cambiar un caracter por otro que pidas

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa una cadena de texto: ");
		
		String frase = sc.nextLine(); 
		
		System.out.println("Ingresa el carácter a buscar");
		
		char chartlf = sc.next().charAt(0);
		
		System.out.println("Ingresa el carácter con el que reemplazarlo");
		
		char charReemplz = sc.next().charAt(0);
		
		System.out.println(frase.replace(chartlf, charReemplz));
		
	}
}
