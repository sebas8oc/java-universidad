/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */

// 10 % compra mayor a 100,000
// solicita nombre, cliente valor compra
// compra >= 100.000 calcula des y total a pagar
// de lo contrario el cliente paga el valor completo

public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        double valor, vf ,vdesc = 100.000;

        System.out.println("Digite su nombre completo: ");
        nombre = sc.nextLine();

        System.out.println("Digite el valor de la compra: ");
        valor = sc.nextDouble();

        if (valor >= vdesc) {
            vdesc = valor / 10;
            vf = valor - vdesc;
        } else {
            vf = valor;
        }

        System.out.println("========== FACTURA DPEOPLE ==========");
        System.out.println("Nombre: " + nombre);
        System.out.printf("Valor: %.3f%n",  vf);
       
    }
}
