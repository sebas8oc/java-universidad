// Solicitar los vectores

import java.util.Scanner;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    double [] notas = new double[5];

    for (int i = 0; i < notas.length; i++) {
        notas[i] = sc.nextDouble();
    }

    for (int i = 0; i < notas.length; i++) {
        System.out.println("Nota " + (i+1) + " = " + notas[i]);
    }



}
