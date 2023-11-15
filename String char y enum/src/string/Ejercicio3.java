package string;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// contador de vocales minusculas

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa una cadena de texto");
		
		String frase = sc.nextLine();
		
		int a = 0;
		
		
		for(int i = 0; i < frase.length(); i++) {
			
			if((frase.charAt(i) == 'a') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
				a++;
			}
			
		}System.out.println(a);
	}

}
