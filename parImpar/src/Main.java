
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    int n;

    System.out.println("Digite un numero: ");
    n = sc.nextInt();

    if (n % 2 == 0) {
        System.out.println(n + " Es un numero par.");
    } else {
        System.out.println(n + " Es un numero impar.");
    }

}
