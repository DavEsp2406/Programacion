package buclesfor;

import java.util.Scanner;

public class Ejerciciosfor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingresa un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int mult = 0;
		
		for(int i = 1; i <= 10; i++) {	
				mult = num * i;	
				System.out.println(num + "*" + i + "=" + mult);
		}
		
		

	}

}
