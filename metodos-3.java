// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    String[] nombres = new String[5];
    double[][] calificaciones = new double[3][5];
    double nota;

    for (int i = 0; i < nombres.length; i++) {
        System.out.println("Digite el nombre del estudiante " + (i + 1));
        nombres[i] = sc.next();
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.println("Digite la nota " + (j + 1) + " del estudiante " + (i + 1));
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 5) {
                calificaciones[i][j] = nota;
                break;
            } else {
                System.out.println("Nota inválida. Debe estar entre 0 y 5. Intente de nuevo.");
            }

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
// buscar un estudiante por su nombre y mostrar sus  notas y su promedio
