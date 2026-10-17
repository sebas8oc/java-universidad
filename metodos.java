import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int opc, n1, n2, resultado;

    System.out.println(" 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
    opc = sc.nextInt();

    System.out.println("Digite x");
    n1 = sc.nextInt();

    System.out.println("Digite y");
    n2 = sc.nextInt();

    switch (opc) {
        case 1:
            resultado = Sumar(n1, n2);
            MostrarResultado(resultado);
            break;
        case 2:
            resultado = Resta(n1, n2);
            MostrarResultado(resultado);
            break;
        case 3:
            resultado = Multiplicacion(n1, n2);
            MostrarResultado(resultado);
            break;
        case 4:
            resultado = Dividision(n1, n2);
            MostrarResultado(resultado);
            break;
        default:
            System.out.println("Opc incorrecta");
            break;
    }

}

public static int Sumar (int n1, int n2) {
    int resultado = n1 + n2;
    return resultado;
}

public static int Resta (int n1, int n2) {
    int resultado = n1 - n2;
    return resultado;
}

public static int Multiplicacion (int n1, int n2) {
    int resultado = n1 * n2;
    return resultado;
}

public static int Dividision (int n1, int n2) {
    int resultado = n1 / n2;
    return resultado;
}

public static void MostrarResultado (int resultado) {
    System.out.println("El resultado es " + resultado);
}
