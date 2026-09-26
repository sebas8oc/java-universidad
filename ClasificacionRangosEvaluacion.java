import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    int latencia = 0;


    System.out.println("Digite la latencia reportada: ");
    latencia = sc.nextInt();

    if (latencia < 50) {
        System.out.println("Latencia Excelente");
    } else if (latencia >= 50 && latencia <= 150) {
        System.out.println("Conexion Aceptable");
    } else if (latencia >= 150 && latencia <= 300) {
        System.out.println("Conexion Lenta");
    } else {
        System.out.println("Sin respuesta / Tiempo de espera agotado");
    }

}
