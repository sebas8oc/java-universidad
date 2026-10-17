import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    int horas;
    double valorHora, salarioBruto, descuento, neto;

    System.out.println("Ingrese el numero de horas trabajadas");
    horas = sc.nextInt();

    System.out.println("Ingrese el valor de la hora");
    valorHora = sc.nextDouble();

    salarioBruto = CalculoSalarioBruto(horas, valorHora);
    descuento = Descuento(salarioBruto);
    neto = Neto(descuento, salarioBruto);
    MostrarComprobante(neto);


}

public static double CalculoSalarioBruto (int horas, double valorHora) {
    double res = (double) horas * valorHora;
    return res;
}

public static double Descuento (double salarioBruto) {
    double res;
    if (salarioBruto > 2000000) {
        res = salarioBruto * 0.08;
    } else {
        res = salarioBruto * 0.04;
    }
    return res;
}

public static double Neto (double descuento, double salarioBruto) {
    double res = salarioBruto - descuento;
    return res;
}

public static void MostrarComprobante (double neto) {
    System.out.println("Su salario neto es " + neto);
}
