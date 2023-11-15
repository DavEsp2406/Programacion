package main;

import java.util.Scanner;

public class Ejercicios4 {

	public static void main(String[] args) {
		/* Escribe un programa para comprobar si un tri ́angulo es equil ́atero, is ́osceles o escaleno. Pista: tienes que
		realizar comparaciones con el tama ̃no de los lados.*/

		
		System.out.println("Escribe la longitud del primer lado");
		
		Scanner sc = new Scanner(System.in);
		
		int lado1 = sc.nextInt();
		
		System.out.println("Escribe la longitud del segundo lado");
		
		int lado2 = sc.nextInt();
		
		System.out.println("Escribe la longitud del tercer lado");
		
		int lado3 = sc.nextInt();
		
		
		
		if((lado1 == lado2) && (lado1 == lado3)) {
			System.out.println("el triangulo es equilatero");
		}else if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
			System.out.println("El triangulo es escaleno");
		}else {
			System.out.println("El triangulo es isosceles");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
