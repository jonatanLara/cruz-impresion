/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglocruz;

import java.util.Scanner;

/**
 *
 * @author jonatanLara
 */
public class ArregloCruz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n ;
        Scanner leer = new  Scanner(System.in);
        System.out.println("Introduce el tamaño de la cruz");
        n=leer.nextInt();
        for (int linea = 0; linea < n; linea++) {
            for (int comlumnas = 0; comlumnas < n; comlumnas++) {
                if (linea == n/2) {
                    System.out.print("*");
                }else if (comlumnas ==n/2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                 }
            System.out.println(" ");
        }
           
    }
    
}
