// Clases necesarias por si acaso xd
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Creamos un Scanner
        Scanner sc = new Scanner(System.in);

        // Auto. 1
        Vehiculo c1 = new Vehiculo("Nissan", "Rojo",10000, "VH-2I37", true);
        // Auto. 2
        Vehiculo c2 = new Vehiculo("Toyota", "Verde",10000, "VK-2I27", false);

        // Creacion de los objetos
        // Auto 3 con los valores quamados
        System.out.print("Modelo: ");
        String modelo_c1 = sc.nextLine();

        System.out.print("Color: ");
        String color_c1 = sc.nextLine();

        System.out.print("Kilometraje: ");
        Double kilometraje_c1 = sc.nextDouble(); sc.nextLine();

        System.out.print("Placa: ");
        String placa_c1 = sc.nextLine();

        System.out.print("¿El auto esta acelerando?: ");
        Boolean acelera_c1 = sc.hasNextBoolean();

        // Auto. 3
        Vehiculo c3 = new Vehiculo(modelo_c1, color_c1,kilometraje_c1, placa_c1, acelera_c1);

        // Metodos
        c1.info_de_vehiculo();
        c2.info_de_vehiculo();
        c3.info_de_vehiculo();

        //Frenado

        c3.avanzar_detener_vehiculo();
        c3.info_de_vehiculo();

    }
}