/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squee.ismael4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ismajj
 */
public class ParesoNonesIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String eleccionA;
        do {
            System.out.println("PARES o NONES");
            System.out.println("Elige una opción: [pares] o [nones]");
            eleccionA = teclado.nextLine();
        } while (!(eleccionA.equalsIgnoreCase("pares") || eleccionA.equalsIgnoreCase("nones")));

        int dedosA;
        do{
        System.out.println("Dedos mostrados por ti =");
        dedosA = teclado.nextInt();
        } while (dedosA > 10);
        
        int dedosB;
        dedosB = random.nextInt(11);
        System.out.println("Dedos mostrados la máquina = "+dedosB);
        
        int resultado = (dedosA + dedosB);
        
        if (eleccionA.equalsIgnoreCase("pares")) {
            if (resultado % 2 == 0) {
                System.out.println("El resultado (" + resultado + ") es par. Has ganado.");
            } else {
                System.out.println("El resultado (" + resultado + ") es impar. Has perdido.");
            }
        }
            if (eleccionA.equalsIgnoreCase("nones")) {
                if (resultado % 2 == 1) {
                    System.out.println("El resultado (" + resultado + ") es impar. Has ganado.");
                } else {
                    System.out.println("El resultado (" + resultado + ") es par. Has perdido.");
                }
            }
    }
    
}
