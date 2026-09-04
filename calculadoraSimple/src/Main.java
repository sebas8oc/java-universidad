//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    int n1, n2, opc;

    System.out.println("Que operacion de desea ejecutar (1:+  2:-  3:*  4:/): ");
    opc = sc.nextInt();

    System.out.println("Digite el n1: ");
    n1 = sc.nextInt();

    System.out.println("Digite el n2: ");
    n2 = sc.nextInt();

    if (opc == 1) {
        System.out.println(n1 + n2);
    } else if (opc == 2) {
        System.out.println(n1 - n2);
    } else if (opc == 3) {
        System.out.println(n1 * n2);
    } else {
        if (n2 > 0) {
            System.out.println(n1 / n2);
        } else {
            System.out.println("No se puede dividir entre cero");
        }
    }

    sc.close();
    }