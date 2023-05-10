/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buclewhile;

/**
 *
 * @author emmanuel
 */
public class BucleWhile {
    public void buclee(){
        int contador = 0; // inicializa la condición
        while (contador < 10) // condición de prueba
        {
            contador++; // cuerpo del bucle
            System.out.println("contador: " + contador);
        }
        System.out.println("Terminado.Contador: " + contador);
    }
    public static void main(String[] a) {
        BucleWhile bucle = new BucleWhile();
        bucle.buclee();
    }
}
