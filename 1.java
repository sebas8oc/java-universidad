/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int op, n1, n2;
        System.out.println("Elija una opcion (1: + 2: - 3: * 4: /):  ");
        op = sc.nextInt();
        
        System.out.println("Digite un numero: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite un numero: ");
        n2 = sc.nextInt();
        
        switch (op){
            case 1:
                System.out.println("La SUMA es = " + (n1 + n2));
                break;
            case 2:
                System.out.println("La resta es = " + (n1 - n2));
                break;
            case 3:
                System.out.println("La SUMA es = " + (n1 * n2));
                break;
            case 4:
                if (n2 > 0){
                    System.out.println("La SUMA es = " + (n1 / n2));
                } else {
                    System.out.println("No es posible dividir en cero");
                }
                break;
            default:
                System.out.println("Digite una opcion correcta ");
        }
    }
}
