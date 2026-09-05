/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// Simular cajero
// clave y usuario 
// menu ( consultar - retirar - consignar y transferir

package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean correcto = false;
        
        int clave, rc, opc, saldo = 0, retirar = 0, consignar = 0, trf = 0, saldoT = 0;
        String usuario, ru;      
        
        System.out.println("Cree su usuario: ");
        usuario = sc.next();
        System.out.println("Cree su clave: ");
        clave = sc.nextInt();
        
        do {
            System.out.println("Cajero D/People");
            System.out.println("---OPCIONES---");
            System.out.println("1. Iniciar Sesion 2. Cerrar Sesion 3. Consultar Saldo");
            System.out.println("4. Retirar saldo 5. Consignar 6. Transferir ");
            
          
            System.out.println("Digite la opcion: ");
            opc = sc.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Inicio de sesion");
                    
                    do {
                        
                        System.out.println("Digite su usuario");
                        ru = sc.next();
                        
                        System.out.println("Digite su clave");
                        rc = sc.nextInt();
                        
                        if (usuario.equals(ru) & clave == rc ) {
                            correcto = true;
                        }
                        
                    } while (correcto == false);
                    break;
                case 3:
                    System.out.println("Consultar saldo");
                    
                    if (saldo == 0) {
                        System.out.println("Su saldo es cero porfavor consigne opcion 5");
                    } else {
                        System.out.println("Su saldo es " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Retirar saldo");
                    
                    if (saldo == 0) {
                        System.out.println("Su saldo es cero porfavor consigne opcion 5");
                    } else {
                        System.out.println("Cuanto desea retirar ");
                        retirar = sc.nextInt();
                    }
                    
                    if (saldo - retirar < 0) {
                        System.out.println("ERROR no puede retirar esa cantidad fondos insuficientes");
                    } else {
                        System.out.println("EXITOS retiro " + retirar);
                    }
                    break;
                case 5:
                    System.out.println("Consignar");
                    System.out.println("Saldo acutal " + saldo);
                    consignar = sc.nextInt();
                    saldo = saldo + consignar;
                    System.out.println("Felicitaciones consigno " + consignar);
                    System.out.println("Su nuevo saldo es de " + saldo);
                    break;
                case 6:
                    System.out.println("Transferir");
                    
                    if (saldo == 0) {
                        System.out.println("Su saldo es cero porfavor consigne opcion 5");
                    } else {
                        System.out.println("Cuanto desea transferir ");
                        saldoT = sc.nextInt();
                        System.out.println("A que cuenta desea transferir");
                        trf = sc.nextInt();
                    }
                    
                    if (saldo - saldoT < 0) {
                        System.out.println("ERROR no puede transferir esa cantidad fondos insuficientes");
                    } else {
                        System.out.println("EXITOS transfirio " + saldoT + " a la cuenta " + trf);
                    }
                    break;
                    
            }
        } while (opc != 2);
         
        
        
    }
}
