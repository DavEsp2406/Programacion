package buclesfor;

import java.util.Scanner;

public class Ejerciciosfor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingresa un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			System.out.println(i);
		}

	}

}
