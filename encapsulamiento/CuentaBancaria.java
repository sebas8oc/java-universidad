import java.text.NumberFormat;
import java.util.Locale;

public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria() {
        this.titular = "";
        this.numeroCuenta = "";
        this.saldo = 0;
    }

    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {

        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void setTitular (String titular) {
        this.titular = titular;
    }

    public String getTitular () {
        return titular;
    }

    public void setNumeroCuenta (String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta () {
        return numeroCuenta;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo () {
        return  saldo;
    }

    public void Depositar (double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Deposito exitoso " + cantidad + " depositados exitosamente");
        } else {
            System.out.println("Error no puede depositar cantidades negativas (-)");
        }
    }

    public void Retirar (double cantidad) {
        if (cantidad > 0 && cantidad <= this.saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso -" + cantidad + " retirado exitosamente");
        } else if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser mayor a cero.");
        } else {
            System.out.println("Saldo insuficiente ===== Su saldo es: " + this.saldo);
        }
    }

    public void mostrarInformacion() {
        Locale localColombia = new Locale("es", "CO");
        NumberFormat formatoCOP = NumberFormat.getCurrencyInstance(localColombia);
        System.out.println("Nombre del titular: " + this.titular);
        System.out.println("Numero de la cuenta: " + this.numeroCuenta);
        System.out.println("Saldo Actual: " + formatoCOP.format(this.getSaldo()));
    }

}
