package buclesfor;

import java.util.Scanner;

public class Ejerciciosfor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Escribe un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		

	}

}
