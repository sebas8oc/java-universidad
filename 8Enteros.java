// crear un arreglo para almacenar 8 numeros enteros
// muestre los numeros
// la suma de todos
// cuantos positivos
// negativos
// cuantos ceros
// cantidad pares e impares
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    int [] numeros = new int[8];
    int suma = 0, positivos = 0, negativos = 0, ceros = 0, pares = 0, impares = 0;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Digite el numero: ");
        numeros[i] = sc.nextInt();

        suma = suma + numeros[i];

        if (numeros[i] < 0) {
            negativos += 1;
        } else if (numeros[i] > 0) {
            positivos += 1;
        } else {
            ceros += 1;
        }

        if (numeros[i] % 2 == 0) {
            pares += 1;
        } else {
            impares += 1;
        }
    }

    positivos = suma / numeros.length;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Numero  " + (i+1) + " = " + numeros[i]);
    }

    System.out.println("Suma de los numeros = " + suma);
    System.out.println("Suma positivos" + positivos);
    System.out.println("Suma negativos" + negativos);
    System.out.println("Suma  ceros = " + ceros);
    System.out.println("Suma pares " + pares);
    System.out.println("Suma impares " + impares);

}
