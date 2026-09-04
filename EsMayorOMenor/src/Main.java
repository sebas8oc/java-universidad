import java.util.Scanner;
import java.util.Random;
void main() {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    int n1, n2, nr, n;

    boolean bien = false;

    System.out.println("El valor inicial y final definiran el rango del numero aleatorio a adivinar");
    System.out.println("Digite un valor inicial: ");
    n1 = sc.nextInt();

    System.out.println("Digite un valor final: ");
    n2 = sc.nextInt();

    nr = rd.nextInt(n2 - n1 + 1) + n1;


    while (bien == false) {
        System.out.println("Adivina el numero magico: ");
        n = sc.nextInt();

        if (n == nr) {
            System.out.println("Felicitaciones adivinaste el numero magico era: " + nr);
            bien = true;
        } else if (n > nr) {
            System.out.println("El numero magico es menor");
        } else if (n < nr) {
            System.out.println("El numero magico es mayor");
        }
    }

    sc.close();
}
