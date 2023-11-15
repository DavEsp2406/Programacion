package dowhile;

import java.util.Scanner;



public class Ejerciciosdowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingresa un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int i = 1;
		
		int multi = 0;
		
		do {
			
			multi = num * i;
			
			System.out.println(num + " * " + i + " = " + multi);
			
			i++;

		}while(i <= 10);
	
	}
}
