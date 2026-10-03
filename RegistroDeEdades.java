//[] 1. Registro de edades
// Almacena las edades de 6 estudiantes en un arreglo
// solicita las edades mostrarlas
// calcular la suma, el promedio y contar cuantos est son mayores de edad y cuantos menores

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    int [] edades = new int[6];
    int suma = 0, mayores = 0, menores = 0, promedio = 0;

    for (int i = 0; i < edades.length; i++) {
        System.out.println("Digite la edad del estudiante: ");
        edades[i] = sc.nextInt();

        suma = suma + edades[i];

        if (edades[i] < 18) {
            menores += 1;
        } else if (edades[i] >= 18) {
            mayores += 1;
        }
    }

    promedio = suma / edades.length;

    for (int i = 0; i < edades.length; i++) {
        System.out.println("Edad estudiante  " + (i+1) + " = " + edades[i]);
    }

    System.out.println("Suma de las edades = " + suma);
    System.out.println("El promedio de las edades es =  " + promedio);
    System.out.println("Estudiantes mayores de edad = " + mayores);
    System.out.println("Estudiantes menores de edad = " + menores);

}
