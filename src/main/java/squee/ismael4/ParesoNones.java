/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squee.ismael4;

import java.util.Scanner;

/**
 *
 * @author ismajj
 */
public class ParesoNones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String eleccionA;
        do {
            System.out.println("PARES o NONES");
            System.out.println("Jugador A, elige una opción: [pares] o [nones]");
            eleccionA = teclado.nextLine();
        } while (!(eleccionA.equalsIgnoreCase("pares") || eleccionA.equalsIgnoreCase("nones")));

        int dedosA;
        do{
        System.out.println("Dedos mostrados por jugador A =");
        dedosA = teclado.nextInt();
        } while (dedosA > 10);
        
        int dedosB;
        do{
        System.out.println("Dedos mostrados por jugador B =");
        dedosB = teclado.nextInt();
        } while (dedosB > 10);
        
        int resultado = (dedosA + dedosB);
        
        System.out.println(resultado);
    }

}
