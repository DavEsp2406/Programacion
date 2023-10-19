package bucleswhile;

import java.util.Scanner;

public class Ejercicioswhile4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nrandom = 73;
		

		
		System.out.println("Adivina un número entre 1 y 100");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		while(num != nrandom) {
			
			if(num > nrandom) {
				System.out.println("Prueba con uno más pequeño");
			}else {
				System.out.println("Prueba con uno más grande");
			}
			
			num = sc.nextInt();	
		}
		
		System.out.println("Enhorabuena has adivinado el número");
		
	}

}
