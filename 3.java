/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */

//utilizando switch crear un programa que permita calcular el perimetro y areas de una figura plana luego de seleccionar la opcion indicada segun
// el sig menu 1. rectangulo 2. circulo 3. triangulo 4. rombo 5. trapecio
public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int op;
        
        int b, h, r, a, c, dm, DM, l;
        
        //Trapecio variables
        int BM, bm, li, ld;
        
        System.out.println("Seleccione una opcion");
        System.out.println("1. Rectangulo 2. Circulo 3. Triangulo 4. Rombo 5. Trapecio");
        op = sc.nextInt();
        
       
        switch (op) {
            case 1: 
                System.out.println("Area y Perimetro / Rectangulo");
                
                System.out.println("Digite la base: ");
                b = sc.nextInt();
                System.out.println("Digite la altura: ");
                h = sc.nextInt();
                
                System.out.println("El area es = " + (b * h));
                System.out.println("El perimetro es = " + (b * 2 + h * 2));
                break;
            case 2: 
                System.out.println("Area y Perimetro / Circulo");
               
                System.out.println("Digite el radio: ");
                r = sc.nextInt();
     
                System.out.println("El area es = " + (3.14 * (r * r)));
                System.out.println("El perimetro es = " + (2 * 3.14 * r));
                break;
            case 3:
                System.out.println("Area y Perimetro / Triangulo");
                
                System.out.println("Digite lado a: ");
                a = sc.nextInt();
                System.out.println("Digite lado b: ");
                b = sc.nextInt();
                System.out.println("Digite lado c: ");
                c = sc.nextInt();
                
                System.out.println("El area es = " + (a + b + c));
                double pt = a+b+c / 2.0;
                System.out.println("El perimetro es = " +  pt);
                break;
            case 4: 
                System.out.println("Area y Perimetro / Rombo");
                
                System.out.println("Digita la longitud de un lado: ");
                l = sc.nextInt();
                System.out.println("Digita la diagonal mayor: ");
                DM = sc.nextInt();
                System.out.println("Digita la diagonal menor: ");
                dm = sc.nextInt();
                
                System.out.println("El area es = " + (DM * dm / 2.0));
                System.out.println("El perimetro es = " + (4 * l));
                break;
            case 5: 
                System.out.println("Area y Perimetro / Trapecio");
                
                System.out.println("Digita la altura: ");
                h = sc.nextInt();
                System.out.println("Digita la base mayor: ");
                BM = sc.nextInt();
                System.out.println("Digita la base menor: ");
                bm = sc.nextInt();
                System.out.println("Digita el lado izquierdo: ");
                li = sc.nextInt();
                System.out.println("Digita el lado derecho: ");
                ld = sc.nextInt();
                
                System.out.println("El area es = " + ((BM + bm) * h) / 2.0);
                System.out.println("El perimetro es = " + ( BM + bm + li + ld));
                
                break;
            default:
                System.out.println("Opc invalida");
        }
        
    }
}
