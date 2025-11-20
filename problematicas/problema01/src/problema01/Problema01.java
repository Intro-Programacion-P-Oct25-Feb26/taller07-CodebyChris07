/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        String cadena = "";
        String listado_edades = "";

        int edad;
        double estatura;

        int contador = 1;

        int suma_edades = 0;
        double suma_estaturas = 0;

        while (contador <= 5) {

            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posicion en el campo");
            posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();

            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine(); 

            cadena = String.format("%s%s - %s -, edad %d, estatura %.2f\n",
                    cadena,
                    nombre,
                    posicion,
                    edad,
                    estatura);

            listado_edades = String.format("%s%d\n", listado_edades, edad);

            suma_edades = edad;
            suma_estaturas = estatura;
            contador = contador + 1;
        }

        double promedio_edades = suma_edades / 5.0;
        double promedio_estaturas = suma_estaturas / 5.0;

        System.out.printf("Listado de jugadores:\n%s\n"
                + "Listado de edades:\n%s\n"
                + "Promedio de edades: %.2f\n"
                + "Promedio de estaturas: %.2f\n",
                cadena,
                listado_edades,
                promedio_edades,
                promedio_estaturas);

    }

}
