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
public class factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int factorial = 1;
        int numero = teclado.nextInt();
        int copia = numero;
        
        
        while (numero !=0) {
        
        factorial = factorial*numero;
        numero--;
        
        }
        
        System.out.println("Factorial de "+copia+" (!"+copia+") = "+factorial);
        
    }
    
}
