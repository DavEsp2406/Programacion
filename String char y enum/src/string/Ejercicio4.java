package string;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// invertir una frase

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa una cadena de texto");
		
		String frase = sc.nextLine();
		
		String aux = "";
		
		for(int i = frase.length()-1; i >= 0; i--) {
			aux += frase.charAt(i);	
		}
		
		System.out.println(aux);
	
	}
}
