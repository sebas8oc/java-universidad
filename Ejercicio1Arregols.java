// Realizar programa que cree un arreglo para 5 int
// Solicite los 5 numeros
// Muestre todos los numeros almacenados
// Calcule su suma
// Cuente cuantos son positivos, negativos, y cuantos iguales 0

import java.util.Scanner;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    int [] numeros = new int[5];
    int suma = 0, positivos = 0, negativos = 0, neutros = 0;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Agregue una nuevo numero a la lista: ");
        numeros[i] = sc.nextInt();

        suma = suma + numeros[i];

        if (numeros[i] == 0) {
            neutros += 1;
        } else if (numeros[i] < 0) {
            negativos += 1;
        } else {
            positivos += 1;
        }
    }

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Numero " + (i+1) + " = " + numeros[i]);
    }

    System.out.println("Suma = " + suma);
    System.out.println("Positivos = " + positivos);
    System.out.println("Negativos = " + negativos);
    System.out.println("Neutros = " + neutros);
}
