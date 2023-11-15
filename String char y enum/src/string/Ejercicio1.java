package string;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// CONTADOR DE A
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa una cadena de texto");
		
		String frase = sc.nextLine(); 
		
		System.out.println(frase);
		
		int a = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			
			if((frase.charAt(i) == 'a') || (frase.charAt(i) == 'A')) {
				a++;
			}
		}
	
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
	}

}
