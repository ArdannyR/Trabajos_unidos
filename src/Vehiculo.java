public class Vehiculo {
    // Atributos
    String modelo;
    String color;
    double kilometraje;
    String placa;

    // Constructor
    public Vehiculo(String modelo, String color, double kilometraje, String placa){
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
        this.placa = placa;
    }








    public void info_de_vehiculo   () {
        System.out.printf("Vehiculo de modelo %s, color %s, placa %s \nTiene un kilometraje de: %.2f km",modelo,color,placa,kilometraje);
    }
}
