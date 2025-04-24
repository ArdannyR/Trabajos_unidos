public class Vehiculo {
    // Atributos
    String modelo;
    String color;
    double kilometraje;
    String placa;
    Boolean acelera;

    // Constructor
    public Vehiculo(String modelo, String color, double kilometraje, String placa, boolean acelera){
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.placa = placa;
        this.acelera = acelera;
    }

    // Metodo de datos
    public void info_de_vehiculo   () {
        System.out.printf("\nVehiculo de modelo %s, color %s, placa %s \nTiene un kilometraje de: %.2f km\nCarro conducido: %B\n\n",modelo,color,placa,kilometraje,acelera);
    }

    // Metodo de avanzar y o detener
    public void avanzar_detener_vehiculo() {
        if(acelera == true){
            this.acelera = false;
            System.out.println("Vehiculo acelerado");
        }
        else{
            this.acelera = true;
            System.out.println("Vehiculo se esta deteniendo");
        }
    }
}
