/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t, r;
        
        System.out.println("Digite el numero del que quiere la tabla de multiplicar: ");
        t = sc.nextInt();
        System.out.println("Hasta que numero desea multiplicarlo: ");
        r = sc.nextInt();
        
        for (int i = 1; i <= r; i++) {
            System.out.println(t + "x" + i + " = " + t * i);
        }
    }
}
