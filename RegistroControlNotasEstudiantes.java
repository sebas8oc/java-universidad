import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int nEst, aprobo = 0, reprobo = 0, clasNot = 0;
    double nota, tN = 0;
    String nombre;

    System.out.println("Digite la cantidad de estudiantes a evaluar: ");
    nEst = sc.nextInt();



   for (int i = 0; i < nEst; i++) {
       System.out.println("Digite nombre del estudiante " + (i + 1));
       nombre = sc.next();
       System.out.println("Digite la nota del estudiante " + (i + 1));
       nota = sc.nextDouble();

       tN = tN + nota;

       if (nota >= 3.0) {
           aprobo = aprobo + 1;
       } else if (nota < 3.0) {
           reprobo = reprobo + 1;
       }

       if (nota >= 0 && nota <= 2) {
           clasNot = 1;
       } else if (nota >= 3 && nota <= 4) {
           clasNot = 2;
       } else  if (nota == 5) {
           clasNot = 3;
       }

       switch (clasNot) {
           case 1:
               System.out.println("Nota baja");
                break;
           case 2:
               System.out.println("Nota Alta");
               break;
           case 3:
               System.out.println("Nota Superior");
       }
   }

    tN = tN / nEst;

    System.out.println("En total aprobaron " + aprobo + " estudiantes.");
    System.out.println("En total reprobaron " + reprobo + " estudiantes.");
    System.out.println("El promedio general del grupo fue de " + tN);
}
