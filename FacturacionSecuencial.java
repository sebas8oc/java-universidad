//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int nProducto = 0;
    double subtotal = 0, total = 0, precio = 0, iva = 0.19, pIva;
    String nombre;

    System.out.println("Digite el nombre del clilente: ");
    nombre = sc.next();

    System.out.println("Cuantos productos compro: ");
    nProducto = sc.nextInt();

    for (int i = 0; i < nProducto; i++) {
        System.out.println("Precio del producto #" + nProducto + ":");
        precio = sc.nextDouble();

        subtotal = subtotal + precio;
    }

    pIva = subtotal * iva;

    total = subtotal + pIva;

    System.out.println("\n--- FACTURA PARA: " + nombre + " ---");
    System.out.println("El subtotal es: " + subtotal);
    System.out.println("El valor del IVA es: " + pIva); 
    System.out.println("El total es: " + total);
}
