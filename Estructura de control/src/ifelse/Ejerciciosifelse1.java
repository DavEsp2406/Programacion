package ifelse;
import java.util.Scanner;

public class Ejerciciosifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		System.out.println("Ingrese su calificación del examén");
		
		Scanner sc = new Scanner (System.in);
		
		int nota = sc.nextInt();
		
		
		
		if (nota>=60) {
			System.out.println("Aprobaste");
		}
		
		else{
			System.out.println("Suspendiste");
		}
	
	
	}
}
