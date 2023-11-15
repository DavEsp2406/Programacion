package string;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Detector de palíndromos

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa una cadena de texto");
		
		String frase = sc.nextLine();
		
		String aux = "";
		
		frase = frase.replaceAll("\\s", "");
		frase = frase.toLowerCase();
		
		
		for(int i = frase.length()-1; i >= 0; i--) {
			aux += frase.charAt(i);	
		}
			
		if(frase.equals(aux)) {
			System.out.println("Es palíndromo");
		}else {
			System.out.println("No es palíndromo");
		}
	}

}
