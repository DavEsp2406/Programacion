package main;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int numeros[] = {1,2,3,4,5,6,7,8,9};
		
		
		int sumatorio = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			sumatorio += i;
		}
		
		System.out.println(sumatorio);
	}

}
