/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// solicita char y depende del char debe decir si la a es vocal es mayus o mins o consonante
package com.mycompany.mavenproject2;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        char a;
        
        System.out.println("Digite un caracter para saber si es minuscula o mayuscula y si es o no vocal");
        a = sc.next().charAt(0);
        
        switch (a) {
            case 'A', 'a':
                System.out.println("Si es vocal");
                if (a == 'a') {
                    System.out.println("es minuscula");
                } else {
                    System.out.println("es mayuscula");
                }
                break;
            case 'e', 'E':
                System.out.println("Si es vocal");
                if (a == 'e') {
                    System.out.println("es minuscula");
                } else {
                    System.out.println("es mayuscula");
                }
                break;
            case 'i', 'I':
                System.out.println("Si es vocal");
                if (a == 'i') {
                    System.out.println("es minuscula");
                } else {
                    System.out.println("es mayuscula");
                }
                break;
            case 'o', 'O':
                System.out.println("Si es vocal");
                if (a == 'o') {
                    System.out.println("es minuscula");
                } else {
                    System.out.println("es mayuscula");
                }
                break;
            case 'u', 'U':
                System.out.println("Si es vocal");
                if (a == 'u') {
                    System.out.println("es minuscula");
                } else {
                    System.out.println("es mayuscula");
                }
                break;
            default:
                System.out.println("no es vocal");
        }
        
    }
}
