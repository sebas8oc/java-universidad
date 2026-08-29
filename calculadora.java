/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, suma, resta, mult;
        double div;
        String op;

        System.out.println("Digite un numero: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite un numero: ");
        n2 = sc.nextInt();
        
        System.out.println("Digite la operacion que desea realizar (+ - * /): ");
        op = sc.next();
        
        if (op.equals("+")) {
            suma = n1 + n2;
            System.out.println("La suma de " + n1 + " + " + n2 + " es = " + suma);
        } else if (op.equals("-")){
            resta = n1 - n2;
            System.out.println("La resta de " + n1 + " - " + n2 + " es = " + resta);
        } else if (op.equals("*")){
            mult = n1 * n2;
            System.out.println("La multiplicacion de " + n1 + " * " + n2 + " es = " + mult);
        }  else if (op.equals("/")){
           if (n2 != 0) {
                div = (double) n1 / n2;
                System.out.println("La division de " + n1 + " / " + n2 + " es = " + div);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        } else {
            System.out.println("Opc invalida");
        }
        
    }
}
