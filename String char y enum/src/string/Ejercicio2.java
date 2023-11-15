package string;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// CAMBIAR E POR X

		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingresa una frase");
		
		String frase = sc.nextLine(); 
		
		String aux = "";
		
		System.out.println(frase.replace('e', 'x'));
		
		for(int i = 0; i < frase.length(); i++) {
			
			if((frase.charAt(i) == 'e') || (frase.charAt(i) == 'E')) {
				aux += "x";
			}else {
				aux += frase.charAt(i);
			}
		}System.out.println(aux);
	}

}
