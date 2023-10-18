package buclesfor;

import java.util.Scanner;

public class Ejerciciosfor2 {

	public static void main(String[] args) {
		
		
		
		
		System.out.println("Ingresa un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int sum = 0;

		
		for(int i = 1; i <= num; i++) {	
			if(i % 2 == 0){
				sum += i;
				}	
			}
		
		System.out.println("La suma de todos los pares de 1 hasta N es: " + sum);
		
		
		}
		
	}

