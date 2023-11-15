package dowhile;

import java.util.Scanner;

public class Ejerciciosdowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ingresa un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int suma = 0;
		
		int i = 0;
		
		do {
			suma = suma + i;
			
			i = i + 2;
			
		}while(i <= num);
		
		
		System.out.println("La suma de los pares desde 2 hasta " + num + " es" + " = " + suma);
	}

}
