package main;
import java.util.Scanner;

public class Ejercicio2 {


	public static void main(String[] args) {	
		System.out.println("Ingrea un número");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int contador = 1;
		
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(contador);
				contador++;
			}
			System.out.println();
			contador = 1;
		}	
	}
}