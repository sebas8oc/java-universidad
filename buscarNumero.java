// 3. buscar numero
// solicite 10 enteros
// pida al usuario un numero para buscar/
// el programa debe indicar si esl n esta en el arreglo
// cuantas veces aparcece
// y en que pocision esta
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc = new Scanner(System.in);

    int [] numeros = new int[10];
    int nb = 0, suma = 0, c = 0;
    boolean esta = false;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Numero " + i);
        numeros[i] = sc.nextInt();
    }

    System.out.println("Digite el numero a buscar: ");
    nb = sc.nextInt();

    for (int i = 0; i < numeros.length; i++) {
        if (nb == numeros[i]) {
            suma += 1;
            esta = true;
        }
    }


    if (esta){
        System.out.println("El numero " + nb + " se encuentra en la lista y aparece " + suma + " veces");
        System.out.println("En las posiciones: ");
        for (int i = 0; i < numeros.length; i++) {
            if (nb == numeros[i]) {
                System.out.println(i + " ");
            }
        }
    } else {
        System.out.println("El numero " + nb + " no se encuentra en la lista y aparece 0 veces");
    }

}
