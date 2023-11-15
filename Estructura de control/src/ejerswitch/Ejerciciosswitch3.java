package ejerswitch;

import java.util.Scanner;

public class Ejerciciosswitch3 {
	
	/**
	 * Este metodo te pide una cantidad de dinero en x moneda 
	 * y te lo cambia a otra si quieres.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("¿Qué moneda va a utilizar, euros (€) o dolares ($)?");
		
		Scanner sc = new Scanner (System.in);
		
		char moneda = sc.next().charAt(0);
		
		System.out.println("Introduzca la cantidad de dinero");
			
		int cantidad = sc.nextInt();
		
		System.out.println("Usted tiene " + cantidad + moneda);

		System.out.println("¿Desea cambiarlo la otra moneda, si (S) o no (N)? ");
		
		char respu = sc.next().charAt(0);
		
		switch(moneda) {
			case '$':
				if(respu == 'S'){
					System.out.println("Su moneda ahora es " + (cantidad * 0.94 ) + '€');
				}else{
					System.out.println("Usted tiene " + cantidad + moneda);
				}break;
			case '€':
				if(respu == 'S'){
					System.out.println("Su moneda ahora es " + (cantidad * 1.06 ) + '$' );
				}else {
					System.out.println("Usted tiene " + cantidad + moneda);
				}break;
				
				default:
					System.out.println("Respuesta incorrecta");
		
		}
	
	}

}
