package ifelse;
import java.util.Scanner;

public class Ejerciciosifelse5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.out.println("Introduzca un número");
		
		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 100) {
			System.out.println("El número esta dentro del rango");
		}else {
			System.out.println("El número no esta dentro del rango");
		}

	}

}
