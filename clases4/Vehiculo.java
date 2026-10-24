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
}
