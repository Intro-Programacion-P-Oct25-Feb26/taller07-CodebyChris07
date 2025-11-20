/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "1";
        int denominador = 3;
        int contador = 1;

        while (denominador <= 15) {

            if (contador % 2 == 0) {
                cadena = String.format("%s + 1/%d", cadena, denominador);
            } else {
                cadena = String.format("%s - 1/%d", cadena, denominador);
            }

            denominador = denominador + 2;
            contador = contador + 1;
        }

        System.out.println(cadena);

    }
}
