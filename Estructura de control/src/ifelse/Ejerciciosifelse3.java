package ifelse;
import java.util.Scanner;

public class Ejerciciosifelse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Introduzca un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		
		if(num % 2 == 0){
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");

		}
	}

}
