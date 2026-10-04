import java.util.Scanner;

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    Double[] nota = new Double[5];
    String[] nombre = new String[5];
    String a = "Aprobo";
    String r = "Reprobo";
    Double na = 3.0 , suma = 0.0, promedio, mn = 0.0;
    int posMn = 0;

    boolean aprobo = true;

    for (int i = 0; i < nota.length; i++) {
        System.out.println("Digite nombre estudiante " + (i + 1));
        nombre[i] = sc.next();
        System.out.println("Digite la nota del estudiante " + (i + 1));
        nota[i] = sc.nextDouble();
    }

    for (int i = 0; i < nota.length; i++) {

        suma += nota[i];

        if (nota[i] >= mn) {
            mn = nota[i];
            posMn = i;
        }

        if (nota[i] > na) {
            aprobo = true;
        } else {
            aprobo = false;
        }
        if (aprobo) {
            System.out.println(nombre[i] + " || nota = " + nota[i] + " || " + a);
        } else {
            System.out.println(nombre[i] + " || nota = " + nota[i] + " || " + r);
        }

    }

    promedio = suma / nota.length;

    System.out.println("La nota promedio fue " + promedio);
    System.out.println("La nota mas alta fue de " + nombre[posMn] + " nota " + nota[posMn]);
}
