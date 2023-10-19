package ifelse;
import java.util.Scanner;

public class Ejerciciosifelse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		System.out.println("Introduzca un número");
	
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("El número es cero");
		}else if(num >=1) {
			System.out.println("El número es positivo");
		}else {
			System.out.println("El número es negativo");
		}
	
	
	
	
	
	
	
	}

}
