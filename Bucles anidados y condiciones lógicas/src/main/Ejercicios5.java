package main;

import java.util.Scanner;

public class Ejercicios5 {

	public static void main(String[] args) {

		
		System.out.println("Escribe la longitud del primer lado");
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		System.out.println("Escribe la longitud del segundo lado");
		
		int n2 = sc.nextInt();
		
		System.out.println("Escribe la longitud del tercer lado");
		
		int n3 = sc.nextInt();
		
		
		
		
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("El número más grande es " + n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("El número más grande es " + n2);
		}else {
			System.out.println("El número más grande es " + n3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
