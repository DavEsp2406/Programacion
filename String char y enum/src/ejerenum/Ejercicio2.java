package ejerenum;

import java.util.Scanner;

public class Ejercicio2 {


    public enum TipoVehiculo {MOTO, COCHE, CAMION}


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona un número correspondiente a su vehiculo : 1.Moto, 2.coche, 3.camión. ");

        int nopcion = sc.nextInt();

        TipoVehiculo tipo;

        switch (nopcion){
            case 1:
                tipo = TipoVehiculo.MOTO;
                System.out.println("Has seleccionado " + tipo);
                break;
            case 2:
                tipo = TipoVehiculo.COCHE;
                System.out.println("Has seleccionado " + tipo);
                break;
            case 3:
                tipo = TipoVehiculo.CAMION;
                System.out.println("Has seleccionado " + tipo);
                break;
            default:
                System.out.println("Introduce un número válido");
        }


        
        

    }
}