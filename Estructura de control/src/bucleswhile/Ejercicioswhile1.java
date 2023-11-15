package bucleswhile;

import java.util.Scanner;

public class Ejercicioswhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escribe un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		int i = 1;
		
		while(i <= num) {
			System.out.print(i + " ");
			i++;
		}
	}
}
