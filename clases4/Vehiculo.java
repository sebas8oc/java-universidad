public class Vehiculo {
    String placa;
    String marca;
    double distanciaRecorrida;
    double litrosConsumidos;
    double precioLitro;

    public Vehiculo() {
        placa = "AAA000";
        marca = "N/A";
        distanciaRecorrida = 0.0;
        litrosConsumidos = 0.0;
        precioLitro = 0.0;
    };

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        distanciaRecorrida = 0.0;
        litrosConsumidos = 0.0;
        precioLitro = 0.0;
    };

    public Vehiculo(String placa, String marca, double distanciaRecorrida, double litrosConsumidos, double precioLitro) {
        this.placa = placa;
        this.marca = marca;
        this.distanciaRecorrida = distanciaRecorrida;
        this.litrosConsumidos = litrosConsumidos;
        this.precioLitro = precioLitro;
    };

    public double calcularRendimiento() {
        return distanciaRecorrida / litrosConsumidos;
    }

    public double calcularCostoCombustible() {
        return litrosConsumidos * precioLitro;
    }

    public void mostrarClasificacion(double rendimiento) {
        if (rendimiento < 8 ) {
            System.out.println("Rendimiento Bajo");
        } else if (rendimiento >= 8 && rendimiento <= 14 ) {
            System.out.println("Rendimiento Medio");
        } else {
            System.out.println("Rendimiento Alto");
        }
    }
    
    public void mostrarInformacion() {
        
    }
}
