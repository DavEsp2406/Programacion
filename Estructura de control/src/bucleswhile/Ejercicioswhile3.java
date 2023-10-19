package bucleswhile;

import java.util.Scanner;

public class Ejercicioswhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Escribe un número entero");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int i = 1;
		
		int repes = 1;
		
		while(num > i) {
			
			num = num / 10;
			
			repes++;
			
		}
		
		System.out.println("El número entero tiene un total de " + repes + " digitos");
		
		
		
		
		
		
		

	}

}
