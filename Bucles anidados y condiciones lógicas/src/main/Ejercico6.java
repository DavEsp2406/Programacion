package main;

import java.util.Scanner;

public class Ejercico6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe el primer número");
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		System.out.println("Escribe el segundo número ");
		
		int n2 = sc.nextInt();
		
		System.out.println("Escribe el tercer número");
		
		int n3 = sc.nextInt();
		
		
		
		if((n1 > n2) && (n2 > n3)) {
			System.out.println("Los números están en orden decreciente");
		}else if((n1 < n2) && (n2 < n3) ) {
			System.out.println("Los números están en orden creciente");
		}else {
			System.out.println("Los números no están ni en orden decreciente ni creciente");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
