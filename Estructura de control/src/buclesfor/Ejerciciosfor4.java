package buclesfor;

import java.util.Scanner;

public class Ejerciciosfor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ingresa un número positivo");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int fact = 1;
		
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				
				fact = fact * i;
				
			}
		}else {
			System.out.println("Chupala puta");
		}
		
		System.out.println("El factorial de " + num + " es " + fact);	
	}

}
