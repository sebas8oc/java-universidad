import java.util.Scanner;

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  String[] nombres = new String[5];
  double[][] calificaciones = new double[5][3];
  double[] promedios = new double[5];

  pedirNombres(sc, nombres);
  perdirCalificaciones(sc, calificaciones, nombres);
  mostrarTabla(nombres, calificaciones);
  calcularPromedios(calificaciones, promedios, nombres);
  aproboReprobo(nombres, promedios);
  promedioMateria(calificaciones);
  promedioMasAlto(promedios, nombres);
  buscarEstudiante(sc, nombres, calificaciones, promedios);

  sc.close();
}

public static void pedirNombres(Scanner sc, String[] nombres) {

  for (int i = 0; i < nombres.length; i++) {
    System.out.println("Digite el nombre del estudiante " + (i + 1));
    nombres[i] = sc.next();
  }
}

public static void perdirCalificaciones(Scanner sc, double[][] calificaciones, String[] nombres) {

  double nota;

  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 3; j++) {
      System.out.println(
          "Digite la nota de la materia " + (j + 1) + " del estudiante " + nombres[i]);
      nota = sc.nextDouble();
      if (nota >= 0 && nota <= 5) {
        calificaciones[i][j] = nota;
      } else {
        System.out.println("Nota invalida debe estar entre 0 y 5");
        j--;
      }
    }
  }
}

public static void mostrarTabla(String[] nombres, double[][] calificaciones) {

  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 3; j++) {
      System.out.println(nombres[i] + " nota " + (j + 1) + " = " + calificaciones[i][j]);
    }
  }
}

public static void calcularPromedios(
    double[][] calificaciones, double[] promedios, String[] nombres) {
  for (int i = 0; i < promedios.length; i++) {
    double promedio = 0.0;
    for (int j = 0; j < 3; j++) {
      promedio += calificaciones[i][j];
    }
    promedios[i] = promedio / 3.0;
  }

  for (int i = 0; i < promedios.length; i++) {
    System.out.println("Promedio estudiante " + nombres[i] + " = " + promedios[i]);
  }
}

public static void aproboReprobo(String[] nombres, double[] promedios) {
  for (int i = 0; i < promedios.length; i++) {
    if (promedios[i] < 3.0) {
      System.out.println(nombres[i] + " REPROBO");
    } else {
      System.out.println(nombres[i] + " APROBO");
    }
  }
}

public static void promedioMateria(double[][] calificaciones) {
  for (int j = 0; j < 3; j++) {
    double sumaMateria = 0;
    for (int i = 0; i < 5; i++) {
      sumaMateria += calificaciones[i][j];
    }
    double promedioAsignatura = sumaMateria / 5.0;
    System.out.printf("Promedio Asignatura %d = %.2f\n", (j + 1), promedioAsignatura);
  }
}

public static void promedioMasAlto(double[] promedios, String[] nombres) {

  double promedioMasAlto = 0;
  int estudiante = 0;

  for (int i = 0; i < promedios.length; i++) {
    if (promedioMasAlto < promedios[i]) {
      promedioMasAlto = promedios[i];
      estudiante = i;
    }
  }

  System.out.println("El promedio mas alto es de " + nombres[estudiante] + " = " + promedioMasAlto);
}

public static void buscarEstudiante(
    Scanner sc, String[] nombres, double[][] calificaciones, double[] promedios) {
  String nombre;
  System.out.println("Digite el nombre del estudiante que desea buscar: ");
  nombre = sc.next();

  for (int i = 0; i < nombres.length; i++) {
    if (nombre.equalsIgnoreCase(nombres[i])) {
      System.out.println("Estudiante: " + nombres[i]);
      for (int j = 0; j < calificaciones[i].length; j++) {
        System.out.println("Notas: " + calificaciones[i][j] + " ");
      }
      System.out.println("Promedio: " + promedios[i]);
    }
  }
}
// 2. Una institucion necesita resgistrar la calificacion de  5 estud en 3 asignaturas
// Todo con metodos dentro del main lo menos posible
// Hasta mañana a media noche
// subir rea 2 actividad 3 semana 10 datos que hablan
// desarrolle un programa
// vector para nombres
// matriz para calificaciones
// el programa debe
// registrar los nombres de los 5 estudiantes
// registrr 3 calificaciones por estudiante
// validar que las notas esten entre 0,0 y 5.0
// mostrar la tabla completa
// calcular el promedio de cada estudiante
// indicar si cada estudiante aprobo o reprobo
// calcular el promedio de cada asignatura
// identificar el estudiante con el promedio mas alto
// buscar un estudiante por su nombre y mostrar sus notas y su promedio
// identificar el estudiante con el promedio mas alto
// buscar un estudiante por su nombre y mostrar sus  notas y su promedio
