package ejerswitch;

import java.util.Scanner;

public class Ejerciciosswitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Ingresa el primer número");
		
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		
		System.out.println("Ingresa el segundo número");
		
		int num2 = sc.nextInt();
		
		System.out.println("Ingresa un operador (+, -, *, /) ");
		
		char ope = sc.next().charAt(0);
		
		switch(ope) {
			
			case '+':
				System.out.println("El resultado de la operación " + (num1 + num2));
				break;
			case '-':
				System.out.println("El resultado de la operación " + (num1 - num2));
				break;
			case '*':
				System.out.println("El resultado de la operación " + (num1 * num2));
				break;
			case '/':
				System.out.println("El resultado de la operación " + (num1 / num2));
				break;
			default:
				System.out.println("Operador incorrecto");
		}
		
		
			
		
		
	}

}
