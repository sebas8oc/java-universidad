import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int capMax, c = 0, libres;

    String registro;

    System.out.println("Digite cual es la capacidad maxima de la sala: ");
    capMax = sc.nextInt();

    do {
        System.out.println("Registre su entrada (digitando su nombre) o finalize el registro con (fin)");
        registro = sc.next();
        registro = registro.toLowerCase();

        if (!registro.equals("fin")){
            c = c + 1;
        }

    } while (c < capMax && !registro.equals("fin"));

    libres = capMax - c;

    System.out.println("Cupos usados " + c + " cupos.");
    System.out.println("Cupos libres " + libres + " cupos.");

}
