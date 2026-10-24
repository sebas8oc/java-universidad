public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public double calcularSubtotal() {
        double subtotal;

        subtotal = precio * cantidad;
        return subtotal;
    }

    public double calcularDescuento(double subtotal) {
        double descuento = 0.0;
        if (subtotal >= 200000.0) {
            descuento = subtotal * 0.20;
        } else {
            descuento = 0.0;
        }

        return descuento;
    }

    public double calcularTotal(double descuento, double subtotal) {
        double total = subtotal - descuento;
        return total;
    }

    public void mostrarEstadoInventario() {
        if (cantidad == 0) {
            System.out.println("Producto Agotado");
        } else if (cantidad >= 1 && cantidad <= 5) {
            System.out.println("Pocas Unidades");
        } else {
            System.out.println("Existencia Suficiente");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del producto: " + nombre);
        double subtotal = calcularSubtotal();
        double descuento = calcularDescuento(subtotal);
        double total = calcularTotal(descuento, subtotal);
        System.out.println("Subtotal = " + subtotal);
        System.out.println("Descuento = " + descuento);
        System.out.println("Total = " +  total);
        mostrarEstadoInventario();
    }
}
