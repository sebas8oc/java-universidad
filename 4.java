package com.mycompany.mavenproject4;

import java.util.Scanner;

//soloicite una contraseña
// si es correcta termina el ciclo
// si es incorrecta se repite hasta que sea correcta

public class Mavenproject4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String clave, i;
        
        boolean correcta = false;
        
        System.out.println("Digita tu clave: ");
        clave = sc.next();
        
        do {
            System.out.println("Digite la clave que creo: ");
            i = sc.next();
            
            if (i.equals(clave)) {
                System.out.println("Clave correcta");
                correcta = true;
            } else {
                System.out.println("Clave incorrecta");
            }
            
        } while (correcta == false);
    }
}
