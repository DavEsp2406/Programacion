package main;

/**
 *  clase ejerciciosdepurar
 */

public class Ejerciciosdepurar {
	/**
	 * metodo main de mi programa
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*imprimir los numeroes que sean divisibles
		 *  entre 2 y entre 3 y los demas no los imprimimos
		 *  y los se iran poniendo los numeros en el orden de lista.*/	
		
		
		
		
		
		int i = 0;
		
		int contador = 1;
		
		while (i < 100){
			i++;
			
			if ((i % 2 == 0) && (i % 3 == 0)) {
				System.out.println("El " + contador + "º número es el " + i);
				contador ++;
				
			}
		}System.out.println();
		
		
	}

}

