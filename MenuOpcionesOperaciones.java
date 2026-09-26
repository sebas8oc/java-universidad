import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int opc, opc2;
    String falla, plan = "Basico";

    do {
        System.out.println("---SOPORTE TECNICO---");
        System.out.println("1. Consultar estado del servicio. \n2. Reportar una falla tecnica. \n3.Solicitar cambio de plan. \n4.Salir.");

        System.out.println("Digita la opcion: ");
        opc = sc.nextInt();

        if (opc == 1) {
            System.out.println("El estado de su servicio es: ACTIVO su plan actual es el plan : " + plan);
        } else if (opc == 2) {
            System.out.println("Por favor describa la falla que esta presentando");
            falla = sc.next();
        } else if (opc == 3) {
            do {
                System.out.println("==== Cambio de plan ====");
                System.out.println("1. Basico\n2. Premium\n 3. Pro\n 4.Salir");
                System.out.println("Digite el numero de plan al cual desea cambiar: ");
                opc2 = sc.nextInt();
                if (opc2 == 1) {
                    plan = "Basico";
                } else if (opc2 == 2) {
                    plan = "Premium";
                } else if (opc2 == 3) {
                    plan = "Pro";
                } else if (opc2 != 4 || opc2 > 4) {
                    System.out.println("Opcion invalida");
                }
            } while (opc != 4);
        } else {
            System.out.println("SALIENDO");
        }
    } while (opc != 4);
