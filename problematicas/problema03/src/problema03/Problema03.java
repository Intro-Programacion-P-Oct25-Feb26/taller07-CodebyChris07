/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        int numero = 2;
        int incremento = 3;
        int contador = 1;
        while (contador <= 6) {
            cadena = String.format("%s%s\n", cadena, numero);
            numero = numero + incremento;
            incremento = incremento + 2;

            contador = contador + 1;

        }
        System.out.printf("%s", cadena);
    }
}
