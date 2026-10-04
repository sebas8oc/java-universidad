//[] 5. una empresa tiene 4 empleados y desea registrar
// las ventas obtenidas durante 5 dias
// desarrolle un programa que almacene las ventas en una matriz
// solicite todas las ventas
// muestre la matriz completa
// calcule lla venta total de cada empleado
// calcule el promedio de ventas de cada empleado
// y determine cual empleado obtuvo el mayor total de ventas
import  java.util.Scanner;
void main() {

    Scanner sc = new Scanner(System.in);

    Double[][] ventas = new Double[4][5];
    Double[] ventaTotalEmpleado = {0.0, 0.0, 0.0, 0.0};
    Double[] promedioEmpleado = new Double[4];
    Double mT = 0.0;
    int empleadoMayorTotal = 0;


    String[] empleados =  {"Juan", "Carlos", "Sebastian", "Miguel"};


    // Pedir las 5 ventas de cada vendedor
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.println("Digite la venta " + (j + 1) + " de " + empleados[i]);
            ventas[i][j] = sc.nextDouble();
            // calcular las ventas totales de cada empleado
            ventaTotalEmpleado[i] = ventaTotalEmpleado[i] + ventas[i][j];
        }
    }

    // Calcular promedio de cada empleado
    for (int i = 0; i < 4; i++) {
        promedioEmpleado[i] = ventaTotalEmpleado[i] /4;
    }

    // Mostrar las 20 ventas
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(ventas[i][j] + "\t");
        }
        System.out.println();
    }

    // Mostrar ventas totales de cada empleado
    for (int i = 0; i < 4; i++) {
        System.out.println("Ventas totales de: " + empleados[i] + " es " + ventaTotalEmpleado[i]);
        // Calcular empleado con mayor total de ventas
        if (ventaTotalEmpleado[i] > mT) {
            mT = ventaTotalEmpleado[i];
            empleadoMayorTotal = i;
        }
    }

    // Mostrar empleado con mayor total de ventas
    System.out.println("El empleado con las ventas mas altas fue " + empleados[empleadoMayorTotal] + " vendio " + mT);

    // Mostrar promedio de ventas de cada empleado
    for (int i = 0; i < 4; i++) {
        System.out.println("Promedio de ventas de: " + empleados[i] + " es " + promedioEmpleado[i]);
    }

}
