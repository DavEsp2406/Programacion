package main;
import java.util.Scanner;

public class Ejercicio1 {


	public static void main(String[] args) {	
		System.out.println("Ingrea un número");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
			
		}	
	}
}
