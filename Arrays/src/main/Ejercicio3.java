package main;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numeros = new int [10];
		
		int save = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int) (Math.random()*100);
			
			System.out.print(numeros[i] + " ");
		
			if (numeros[i] > save) {
				save = numeros[i];
				
			}
		}System.out.println("\n" + "El número más grande del array es " + save);
		
		
		
		
		
		
	}
}
