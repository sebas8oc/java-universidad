import java.util.Scanner;
import java.util.Random;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    int vi, vf, va;

    System.out.println("Digitea un Valor inicial: ");
    vi = sc.nextInt();
    System.out.println("Digita un Valor final: ");
    vf = sc.nextInt();

    va = rd.nextInt(vf - vi + 1) + vi;

    System.out.println("Su numero aleatorio entre " + vi + " y " + vf + " es " + va);
}
