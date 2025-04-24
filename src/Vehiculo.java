public class Vehiculo {
    // Atributos
    String modelo;
    String color;
    double kilometraje;
    String placa;
    Boolean acelera;

    // Constructor
    public Vehiculo(String modelo, String color, double kilometraje, String placa){
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.placa = placa;
    }

    // Metodo de datos
    public void info_de_vehiculo   () {
        System.out.printf("Vehiculo de modelo %s, color %s, placa %s \nTiene un kilometraje de: %.2f km",modelo,color,placa,kilometraje);
    }

    // Metodo de avanzar y o detener
    public void avanzar_detener_vehiculo() {
        if (acelera == true){
            acelera = false;
            System.out.printf("El vehiculo esta siendo conducido: %B",acalera);
        }
        else {
            acelera = true;
            System.out.printf("El vehiculo esta siendo conducido: %B",acalera);
        }

    }
}
