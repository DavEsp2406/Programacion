package main;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int par = 0;
		
		int impar = 0;
		
		int numeros[];
			
		numeros	= new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
			
			if (numeros[i] % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("El array contiene " + par + " números pares \ny " + impar + " números impares :D");
		
	}

}
