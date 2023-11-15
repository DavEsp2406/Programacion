package main;

public class Ejercicio3 {
	
	
	public static void main(String[] args) {
		
		int N = 1;
		
		System.out.print("    ");
		
		for (int k = 1; k <= 10; k++) {
			System.out.print(N + " ");
			N++;
		}
		
		System.out.println();
		
		for (int k = 1; k <= 24; k++) {
			System.out.print("-");
			N++;
		}
		
		System.out.println();
		
		N = 1;
		
		for (int i = 1; i <= 10; i++ ) {
			
			System.out.print(N + " | ");
			for (int j = 1; j <= 10; j++) {	
				System.out.print((N * j) + " ");
			}
			System.out.println();
			N++;		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
