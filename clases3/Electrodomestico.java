public class Electrodomestico {
    String nombre;
    double potencia;
    double horasDiarias;
    int diasUso;

    public double calcularConsumo(double potencia, double horasDiarias) {
        double horasDias = diasUso * horasDiarias;
        double consumo = horasDias * potencia;

        return  consumo;
    }

    public void mostrarNivelConsumo(double consumo) {
        if (consumo < 50) {
            System.out.println("Consumo Bajo");
        } else if (consumo >= 50 && consumo <= 100 ) {
            System.out.println("Consumo Medio");
        } else {
            System.out.println("Consumo Alto");
        }
    }

    public void mostrarInformacion () {
        double consumo = calcularConsumo(potencia, horasDiarias);
        System.out.println("Nombre del dispósitivo: " + nombre);
        System.out.println("Potencia del dispositivo: " + potencia);
        System.out.println("Horas diarias de uso del dispositivo " + horasDiarias);
        System.out.println("Dias de uso: " + diasUso);
        System.out.println("Nivel de consumo: ");
        mostrarNivelConsumo(consumo);
    }
}
