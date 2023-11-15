package ejerenum;

import java.util.Scanner;

public class Ejercicio1 {
	
	public enum DiaSemana {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO}

	public static void main(String[] args) {
	//Pregunta por un día de la semana en número
		
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Introduce un número de la semana");

		        int dia = sc.nextInt();

		        DiaSemana[] dayList = DiaSemana.values();

		        System.out.println(dayList[dia -1]);
		
		        
	}

}
