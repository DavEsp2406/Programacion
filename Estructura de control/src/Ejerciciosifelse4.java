import java.util.Scanner;
import java.util.Calendar;


public class Ejerciciosifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce tu año de nacimiento");
		
		Scanner sc = new Scanner (System.in);
		
		int naci = sc.nextInt();
		
		Calendar cal= Calendar.getInstance();
		
        int year= cal.get(Calendar.YEAR);
        
        
        
        if(naci <= year){
        	System.out.println("Tu edad actual es " + (year - naci));
        	
        }else {
        	System.out.println("La fecha de nacimiento es erronea");
        }
        
 
	}

}
